<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Feedback Report</title>
    <style>
        body{
     
        
        }
        h2 {
            text-align: center;
        }

        /* Center align the table */
        table {
            margin: 0 auto;
        }

        /* Center align radio buttons */
        .radio-group {
            text-align: left;
        }
        div {
            text-align: center;
            
            margin-top:20px;
            margin-bottom:20px;
        }
        .system-info{
        text-align: left;
        }
    </style>
</head>
<body>
    <h2>OFFICIUM SYSTEM</h2>
    <h2>FEEDBACK COMPLIANCE REPORT</h2>
    <h2>PERSONAL INFORMATION</h2>

    <form action="submitFeedback.jsp" method="post">
    <table>
    <div>
        <tr><td><label>Name:</label></td>
        <td> <input type="text" name="name"><br></td></tr>
        
        <tr><td><label>Fy / Deptt:</label></td>
        <td><input type="text" name="fy_dept"><br></td></tr>
        
         <tr><td><label>Officer / Staff:</label></td>
        <td><input type="text" name="officer_staff"><br></td></tr>
        
        <tr><td><label>PL No.:</label></td>
        <td><input type="text" name="pl_no"><br></td></tr>
        
        <tr><td><label>Section:</label></td>
        <td><input type="text" name="section"><br></td></tr>
        
         <tr><td><label>Designation:</label></td>
        <td><input type="text" name="designation"><br></td></tr>
        </div>
     </table>
     <div class="system-info">
        <h2>SYSTEM INFORMATION</h2>
        <div class="radio-group">
            <label>Do you have a PC for the application use?</label><br>
            <input type="radio" name="pc_for_use" value="Yes">Yes
            <input type="radio" name="pc_for_use" value="No">No<br>

            <label>Is PC connected to the network?</label><br>
            <input type="radio" name="pc_connected" value="Yes">Yes
            <input type="radio" name="pc_connected" value="No">No<br>

            <label>Is PC meeting the minimum requirement of the application (Core i3 & above)?</label><br>
            <input type="radio" name="pc_minimum_req" value="Yes">Yes
            <input type="radio" name="pc_minimum_req" value="No">No<br>
        </div>
</div>
<div>
        <h2>SOFTWARE INFORMATION SURVEY SCALE</h2>
        <table>
            <c:forEach var="label" items="${feedbackReportPanel.labelTexts}" varStatus="status">
                <tr>
                    <td><label>${label}</label></td>
                    <td>
                        <input type="radio" name="scale_${status.index}" value="1">1
                        <input type="radio" name="scale_${status.index}" value="2">2
                        <input type="radio" name="scale_${status.index}" value="3">3
                        <input type="radio" name="scale_${status.index}" value="4">4
                        <input type="radio" name="scale_${status.index}" value="5">5
                    </td>
                </tr>
            </c:forEach>
        </table>
        </div>
<div >
        <label>Suggestion:</label><br>
        <textarea name="suggestion" rows="5" cols="40"></textarea><br>

        <input type="submit" value="Submit">
        </div>
    </form>
</body>
</html>
