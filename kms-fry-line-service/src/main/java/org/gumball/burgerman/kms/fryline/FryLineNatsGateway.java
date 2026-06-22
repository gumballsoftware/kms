package org.gumball.burgerman.kms.fryline;

import io.nats.client.Connection;
import org.gumball.burgerman.kms.common.model.OrderItem;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.List;


@Component
public class FryLineNatsGateway {
    Connection natsConnection;
    public FryLineNatsGateway(Connection natsConnection) {
        this.natsConnection = natsConnection;
    }

    public void sendOrderItems(List<OrderItem> items) {
        // Publish items to NATS
        for (OrderItem item : items) {
            natsConnection.publish("fry-line.items", item.toString().getBytes(StandardCharsets.UTF_8));
        }
    }
}
