package org.gumball.burgerman.kms.fryline;

import dev.allthings.boot.nats.core.NatsTemplate;
import org.gumball.burgerman.kms.common.model.OrderItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FryLineNatsGateway {

    private final NatsTemplate natsTemplate;

    public FryLineNatsGateway(NatsTemplate natsTemplate) {
        this.natsTemplate = natsTemplate;
    }

    public void sendOrderItems(List<OrderItem> items) {
        // Publish items to NATS
        for (OrderItem item : items) {
            natsTemplate.publish("fry-line.items", item);
        }
    }
}
