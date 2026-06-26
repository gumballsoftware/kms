package org.gumball.burgerman.kms.fryline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.DayOfWeek;

@Entity
public class BatchHoldingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private DayOfWeek dayOfWeek;
    private int hourOfService;
    private int numberOfBatchesToHold;

    public BatchHoldingSchedule() {}

    public BatchHoldingSchedule(String productName, DayOfWeek dayOfWeek, int hourOfService, int numberOfBatchesToHold) {
        this.productName = productName;
        this.dayOfWeek = dayOfWeek;
        this.hourOfService = hourOfService;
        this.numberOfBatchesToHold = numberOfBatchesToHold;
    }

    public Long getId() { return id; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public DayOfWeek getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(DayOfWeek dayOfWeek) { this.dayOfWeek = dayOfWeek; }
    public int getHourOfService() { return hourOfService; }
    public void setHourOfService(int hourOfService) { this.hourOfService = hourOfService; }
    public int getNumberOfBatchesToHold() { return numberOfBatchesToHold; }
    public void setNumberOfBatchesToHold(int numberOfBatchesToHold) { this.numberOfBatchesToHold = numberOfBatchesToHold; }
}
