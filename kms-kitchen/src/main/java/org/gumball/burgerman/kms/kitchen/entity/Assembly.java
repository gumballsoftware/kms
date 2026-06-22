package org.gumball.burgerman.kms.kitchen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assembly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String menuItemName;
    private String processingInstructions;

    public Assembly() {}

    public Assembly(String menuItemName, String processingInstructions) {
        this.menuItemName = menuItemName;
        this.processingInstructions = processingInstructions;
    }

    public Long getId() { return id; }
    public String getMenuItemName() { return menuItemName; }
    public void setMenuItemName(String menuItemName) { this.menuItemName = menuItemName; }
    public String getProcessingInstructions() { return processingInstructions; }
    public void setProcessingInstructions(String processingInstructions) { this.processingInstructions = processingInstructions; }
}
