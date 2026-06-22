package org.gumball.burgerman.kms.kitchen.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    private String id;
    private String menuItemName;
    private String customizationInstructions;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public OrderItem() {}

    public OrderItem(String id, String menuItemName, String customizationInstructions) {
        this.id = id;
        this.menuItemName = menuItemName;
        this.customizationInstructions = customizationInstructions;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getMenuItemName() { return menuItemName; }
    public void setMenuItemName(String menuItemName) { this.menuItemName = menuItemName; }
    public String getCustomizationInstructions() { return customizationInstructions; }
    public void setCustomizationInstructions(String customizationInstructions) { this.customizationInstructions = customizationInstructions; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}
