package com.restaurant.model;

import java.time.LocalDateTime;

import com.restaurant.enums.ReservationStatus;

public class Reservation {

    private Long id;
    private User user;
    private RestaurantTable restaurantTable;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int guestCount;
    private ReservationStatus status;

  
    public Reservation() {
    }

    public Reservation(Long id, User user, RestaurantTable restaurantTable,LocalDateTime startTime, LocalDateTime endTime,int guestCount,ReservationStatus status) {

        this.id = id;
        this.user = user;
        this.restaurantTable = restaurantTable;
        this.startTime = startTime;
        this.endTime = endTime;
        this.guestCount = guestCount;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }

    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}