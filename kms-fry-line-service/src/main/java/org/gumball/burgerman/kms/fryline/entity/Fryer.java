package org.gumball.burgerman.kms.fryline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fryer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String oilType;
    private double targetTemperatureFahrenheit;
    private String productTypeRestriction; // e.g., "CHICKEN_ONLY"

    public Fryer() {}

    public Fryer(String name, String oilType, double targetTemperatureFahrenheit, String productTypeRestriction) {
        this.name = name;
        this.oilType = oilType;
        this.targetTemperatureFahrenheit = targetTemperatureFahrenheit;
        this.productTypeRestriction = productTypeRestriction;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOilType() { return oilType; }
    public void setOilType(String oilType) { this.oilType = oilType; }
    public double getTargetTemperatureFahrenheit() { return targetTemperatureFahrenheit; }
    public void setTargetTemperatureFahrenheit(double targetTemperatureFahrenheit) { this.targetTemperatureFahrenheit = targetTemperatureFahrenheit; }
    public String getProductTypeRestriction() { return productTypeRestriction; }
    public void setProductTypeRestriction(String productTypeRestriction) { this.productTypeRestriction = productTypeRestriction; }
}
