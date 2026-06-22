package org.gumball.burgerman.kms.kitchen.entity;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Instant startTime;
    private Instant endTime;

    @ManyToMany
    @JoinTable(
        name = "menu_menu_items",
        joinColumns = @JoinColumn(name = "menu_id"),
        inverseJoinColumns = @JoinColumn(name = "menu_item_id")
    )
    private Set<MenuItem> menuItems;

    public Menu() {}

    public Menu(String name, Instant startTime, Instant endTime, Set<MenuItem> menuItems) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.menuItems = menuItems;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Instant getStartTime() { return startTime; }
    public void setStartTime(Instant startTime) { this.startTime = startTime; }
    public Instant getEndTime() { return endTime; }
    public void setEndTime(Instant endTime) { this.endTime = endTime; }
    public Set<MenuItem> getMenuItems() { return menuItems; }
    public void setMenuItems(Set<MenuItem> menuItems) { this.menuItems = menuItems; }
}
