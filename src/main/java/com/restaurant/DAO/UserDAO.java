package com.restaurant.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.restaurant.config.DBConnection;
import com.restaurant.model.User;

public class UserDAO {

    public User save(User user) throws SQLException {

        String sql = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole().name());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected == 1) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        user.setId(rs.getLong(1));
                    }
                }
            }

            return user;
        }
    }
    public boolean update(User user) throws SQLException {

        String sql = "UPDATE users SET name = ?, email = ?, role = ?WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getRole().name());
            ps.setLong(4, user.getId());

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;
        }
    }
    
    public boolean deleteById(Long id) throws SQLException {

        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setLong(1, id);

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;
        }
    }
}