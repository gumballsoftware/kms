package org.gumball.burgerman.kms.fryline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HoldingBin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String productTypeRestriction; // e.g., "CHICKEN", "FRIES_AND_ONION_RINGS"
    private double targetTemperatureFahrenheit;

    public HoldingBin() {}

    public HoldingBin(String name, String productTypeRestriction, double targetTemperatureFahrenheit) {
        this.name = name;
        this.productTypeRestriction = productTypeRestriction;
        this.targetTemperatureFahrenheit = targetTemperatureFahrenheit;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getProductTypeRestriction() { return productTypeRestriction; }
    public void setProductTypeRestriction(String productTypeRestriction) { this.productTypeRestriction = productTypeRestriction; }
    public double getTargetTemperatureFahrenheit() { return targetTemperatureFahrenheit; }
    public void setTargetTemperatureFahrenheit(double targetTemperatureFahrenheit) { this.targetTemperatureFahrenheit = targetTemperatureFahrenheit; }
}
