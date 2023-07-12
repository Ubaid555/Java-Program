package net.javaguides.officium.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.officium.dao.EmployeeDao;
import net.javaguides.officium.model.Employee;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	EmployeeServlet() {
    	super();
    }
    private static final long serialVersionUID = 1L;
    private EmployeeDao employeeDao = new EmployeeDao();
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponce responce) throws ServletException, IOException {
    	responce.getWriter.append("Served at: ").append(request.getContextPath());
    	RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/views/EmployeeRegister.jsp");
    	dispatcher.forward(request, responce);
    }

    public void init() {
        employeeDao = new EmployeeDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {

    	        String Name = request.getParameter("name");
    	        String Factory = request.getParameter("factory");
    	        String Officer = request.getParameter("officer");
    	        String Plno = request.getParameter("plno");
    	        String Section = request.getParameter("section");
    	        String Designation = request.getParameter("designation");

    	        Employee employee = new Employee();
    	        employee.setName(Name);
    	        employee.setFactory(Factory);
    	        employee.setOfficer(Officer);
    	        employee.setPlno(Plno);
    	        employee.setSection(Section);
    	        employee.setDesignation(Designation);

    	        try {
    	            employeeDao.registerEmployee(employee);
    	        } catch (Exception e) {
    	            // TODO Auto-generated catch block
    	            e.printStackTrace();
    	        }

    	        response.sendRedirect("employeedetails.jsp");
    	    }
    	}