package org.gumball.burgerman.kms.fryline.service;

import org.gumball.burgerman.kms.fryline.FryLineNatsGateway;
import org.gumball.burgerman.kms.common.model.Acknowledgement;
import org.gumball.burgerman.kms.common.model.Order;
import org.gumball.burgerman.kms.common.model.OrderItem;
import org.gumball.burgerman.kms.station.service.StationService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FryLineService implements StationService {

    private final FryLineNatsGateway natsGateway;

    public FryLineService(FryLineNatsGateway natsGateway) {
        this.natsGateway = natsGateway;
    }

    public Acknowledgement processOrder(Order order) {
        // Logic to determine handled items
        List<OrderItem> handledItems = order.items().stream()
                .filter(item -> item.menuItemName().toLowerCase().contains("fry"))
                .collect(Collectors.toList());

        if (handledItems.isEmpty()) {
            return new Acknowledgement("NA", null, null);
        }

        handledItems.forEach(this::processOrderItem);

        return new Acknowledgement("ACK", handledItems, Instant.now().plusSeconds(300).toString());
    }

    protected void processOrderItem(OrderItem orderItem) {

    }
}
