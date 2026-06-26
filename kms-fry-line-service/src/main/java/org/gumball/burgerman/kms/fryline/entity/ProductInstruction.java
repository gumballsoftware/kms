package org.gumball.burgerman.kms.fryline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private double cookingTimeMinutes;
    private Double maxHoldingTimeMinutes;
    private double targetTemperatureFahrenheit;
    private boolean cookToOrder;

    public ProductInstruction() {}

    public ProductInstruction(String productName, double cookingTimeMinutes, Double maxHoldingTimeMinutes, double targetTemperatureFahrenheit, boolean cookToOrder) {
        this.productName = productName;
        this.cookingTimeMinutes = cookingTimeMinutes;
        this.maxHoldingTimeMinutes = maxHoldingTimeMinutes;
        this.targetTemperatureFahrenheit = targetTemperatureFahrenheit;
        this.cookToOrder = cookToOrder;
    }

    public Long getId() { return id; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public double getCookingTimeMinutes() { return cookingTimeMinutes; }
    public void setCookingTimeMinutes(double cookingTimeMinutes) { this.cookingTimeMinutes = cookingTimeMinutes; }
    public Double getMaxHoldingTimeMinutes() { return maxHoldingTimeMinutes; }
    public void setMaxHoldingTimeMinutes(Double maxHoldingTimeMinutes) { this.maxHoldingTimeMinutes = maxHoldingTimeMinutes; }
    public double getTargetTemperatureFahrenheit() { return targetTemperatureFahrenheit; }
    public void setTargetTemperatureFahrenheit(double targetTemperatureFahrenheit) { this.targetTemperatureFahrenheit = targetTemperatureFahrenheit; }
    public boolean isCookToOrder() { return cookToOrder; }
    public void setCookToOrder(boolean cookToOrder) { this.cookToOrder = cookToOrder; }
}
