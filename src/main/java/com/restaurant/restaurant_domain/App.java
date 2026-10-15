package com.restaurant.restaurant_domain;

import com.restaurant.enums.ReservationStatus;
import com.restaurant.enums.UserRole;

public class App {

    public static void main(String[] args) {

        UserRole role = UserRole.CUSTOMER;

        ReservationStatus status = ReservationStatus.CONFIRMED;

        System.out.println("User Role: " + role);

        System.out.println("Reservation Status: " + status);
        
        
    }
}