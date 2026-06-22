package org.gumball.burgerman.kms.kitchen.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "kitchen_order")
public class Order {
    @Id
    private String id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    public Order() {}

    public Order(String id, List<OrderItem> items) {
        this.id = id;
        this.items = items;
        if (items != null) {
            items.forEach(item -> item.setOrder(this));
        }
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; }
}
