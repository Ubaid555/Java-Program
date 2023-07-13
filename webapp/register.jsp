<%@ page import="java.sql.*" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.io.PrintWriter" %>

<%
String name = request.getParameter("name");
String factory = request.getParameter("factory");
String officer = request.getParameter("officer");
String plno = request.getParameter("plno");
String section = request.getParameter("section");
String designation = request.getParameter("designation");

ResultSet rs = null;
Connection con = null;

try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registr", "root", "1234");
    PreparedStatement ps = conn.prepareStatement("INSERT INTO registr (name, factory, officer, plno, section, designation) VALUES (?, ?, ?, ?, ?, ?)");
    ps.setString(1, name);
    ps.setString(2, factory);
    ps.setString(3, officer);
    ps.setString(4, plno);
    ps.setString(5, section);
    ps.setString(6, designation);
    int x = ps.executeUpdate();
    if (x > 0) {
        out.println("<h1>Data saved successfully</h1>");
    } else {
        out.println("<h1>Data cannot be saved</h1>");
    }
} catch (Exception e) {
    out.println("<h1>Error: " + e.getMessage() + "</h1>");
}
%>
