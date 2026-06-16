package org.gumball.burgerman.kms.common.model;

public record OrderItem(String id, String menuItemName, String customizationInstructions) {
    public OrderItem(String id, String menuItemName, String customizationInstructions) {
        this.id = id;
        this.menuItemName = menuItemName;
        this.customizationInstructions = customizationInstructions == null ? "" : customizationInstructions;
    }
}
