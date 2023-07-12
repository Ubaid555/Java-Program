package net.javaguides.officium.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.officium.model.Employee;

public class EmployeeDao {
public int registerEmployee(Employee employee) throws ClassNotFoundException {
	String INSERT_USERS_SQL = "INSERT INTO employee" + "(name, factory, officer, plno, section, designation) VALUES " + "(?, ?, ?, ?, ?, ?);";
	
	int result=0;
	
	Class.forName("com.mysql.jdbc.Driver");
	
	 try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setString(2, employee.getName());
	            preparedStatement.setString(3, employee.getFactory());
	            preparedStatement.setString(4, employee.getOfficer());
	            preparedStatement.setString(5, employee.getPlno());
	            preparedStatement.setString(6, employee.getSection());
	            preparedStatement.setString(7, employee.getDesignation());

	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	            e.printStackTrace();
	        }
	        return result;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
}
