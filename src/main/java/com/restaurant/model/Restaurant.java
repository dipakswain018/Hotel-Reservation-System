package com.restaurant.model;

import java.time.LocalTime;

public class Restaurant {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private boolean active;

 
    public Restaurant() {
    }

    public Restaurant(Long id, String name, String address,String phone, LocalTime openingTime,LocalTime closingTime, boolean active) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}