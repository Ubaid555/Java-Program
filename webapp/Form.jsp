<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/register.jsp" method="post">

   <table style="with: 80%">
    <tr>
     <td> Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Factory</td>
     <td><input type="text" name="factory" /></td>
    </tr>
    <tr>
     <td>Officer / Worker</td>
     <td><input type="text" name="officer" /></td>
    </tr>
    <tr>
     <td>Pl No.</td>
     <td><input type="password" name="plno" /></td>
    </tr>
    <tr>
     <td>Section</td>
     <td><input type="text" name="section" /></td>
    </tr>
    <tr>
     <td>Designation</td>
     <td><input type="text" name="designation" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>