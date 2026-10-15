package com.restaurant.model;

public class RestaurantTable {

    private Long id;
    private String tableNumber;
    private int capacity;
    private boolean active;
    private Restaurant restaurant;

    public RestaurantTable() {
    }

    public RestaurantTable(Long id, String tableNumber,int capacity, boolean active,Restaurant restaurant) {

        this.id = id;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.active = active;
        this.restaurant = restaurant;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}