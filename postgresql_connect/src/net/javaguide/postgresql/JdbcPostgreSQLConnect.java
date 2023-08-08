package net.javaguide.postgresql;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JdbcPostgreSQLConnect {
    private final String url = "jdbc:postgresql://localhost/formDatabase";
    private final String user = "postgres";
    private final String password = "1234567";

    public void createRecord(String name, String email, String remarks) {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO formData (name, email, remarks) VALUES (?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setString(3, remarks);
                pstmt.executeUpdate();
                System.out.println("New record inserted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error while inserting a new record: " + e.getMessage());
        }
    }

    public void displayAllRecords() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM formData";

            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String remarks = rs.getString("remarks");

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Email: " + email);
                    System.out.println("Remarks: " + remarks);
                    System.out.println("--------------------------");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving records: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Form Entry System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel remarksLabel = new JLabel("Remarks:");
        JTextField remarksField = new JTextField();

        JButton submitButton = new JButton("Submit");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(remarksLabel);
        panel.add(remarksField);
        panel.add(submitButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        JdbcPostgreSQLConnect app = new JdbcPostgreSQLConnect();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String remarks = remarksField.getText();

                app.createRecord(name, email, remarks);
                app.displayAllRecords();
            }
        });
    }
}







