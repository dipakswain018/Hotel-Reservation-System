package com.restaurant.restaurant_domain;

import java.sql.SQLException;

import com.restaurant.DAO.UserDAO;
import com.restaurant.enums.UserRole;
import com.restaurant.model.User;

public class App {

    public static void main(String[] args) {

        
        User user = new User(
                null,
                "Alluka",
                "alluka34@gmail.com",
                "alluka@897",
                UserRole.CUSTOMER
        );

        UserDAO userDAO = new UserDAO();

        try {
            User savedUser = userDAO.save(user);

            System.out.println("User saved successfully!");
            System.out.println("Generated ID: " + savedUser.getId());
            System.out.println("Name: " + savedUser.getName());

        } catch (SQLException e) {
            System.out.println("Failed to save user.");
            e.printStackTrace();
        }
    }
}