<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Feedback Report</title>
    <style>
    body{
    background-color:Lightblue;
    }
    
    h2 {
            text-align: center;
        }
        
        #personal_Info {
            margin-top: 30px;
        }

        #personal_Info input[type="text"] {
        background-color:off-white;
            display: block;
            margin: 10px auto;
            padding: 10px;
            width: 250px;
        }
        
        .system_info, .survey_info {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    .system_info, .survey_info label {
        margin-bottom: 10px;
        margin-top: 20px;
    }
    
    .survey_info,  input[type="radio"]{
    margin-bottom: 20px;
    }
    
    .system_info input[type="radio"]{
    margin-bottom: 20px;
    }
    
     #suggestion {
            margin-top: 20px;
            text-align: center;
        }

        #suggestion label {
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 10px;
            
        }

        #suggestion textarea {
            display: block;
            margin: 10px auto;
            padding: 10px;
            width: 400px;
            height: 100px;
        }

        #suggestion button {
            padding: 10px 20px;
            font-size: 18px;
        }
        
       </style>
</head>

<body>
    <h2>OFFICIUM SYSTEM</h2>
    <h2>FEEDBACK COMPLIANCE REPORT</h2>
    <h2>PERSONAL INFORMATION</h2>
    
     <div id="personal_Info">
        <input type="text" placeholder="Name">
        <input type="text" placeholder="FY / Deptt">
        <input type="text" placeholder="Officer / Staff">
        <input type="text" placeholder="PL No.">
        <input type="text" placeholder="Section">
        <input type="text" placeholder="Designation">
     </div>
        
       <h2>SYSTEM INFORMATION</h2>
       
     <div class="system_info">
       <table><tr><td><label>Do you have a PC for the application use?</label><br></tr></td>
        
        <tr><td><input type="radio" name="pc_for_use" value="Personal">Shared
                <input type="radio" name="pc_for_use" value="Shared">Personal
        </tr></td>

        <tr><td><label>Is PC connected to the network?</label></tr></td>
       
        <tr><td> <input type="radio" name="pc_connected" value="Yes">Yes
        <input type="radio" name="pc_connected" value="No">No
        </tr></td>

        <tr><td><label>Is PC meeting the minimum requirement of the application (Core i3 & above)?</label></tr></td>
        <tr><td><input type="radio" name="pc_minimum_req" value="Yes">Yes
        <input type="radio" name="pc_minimum_req" value="No">No</tr></td>
        </table>
    </div>
        
    <h2>SOFTWARE INFORMATION SURVEY SCALE</h2>
    <div class="survey_info">
    <table> 
            <tr><td><label>Is Application fully deployed in FY/Dept?</label><br></tr></td>
   
            <tr>
                <td><input type="radio" name="fullyDeployed">1
	            <input type="radio" name="fullyDeployed">2
	            <input type="radio" name="fullyDeployed">3
	            <input type="radio" name="fullyDeployed">4
	            <input type="radio" name="fullyDeployed">5</td>
            </tr>
           
            <tr><td><label>Has all necessary information regarding usage been conveyed during training sessions?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="necessaryInfo">1
	            <input type="radio" name="necessaryInfo">2
	            <input type="radio" name="necessaryInfo">3
	            <input type="radio" name="necessaryInfo">4
	            <input type="radio" name="necessaryInfo">5</td>
            </tr>
            
	        <tr><td><label>Is Application reliable, providing document secrecy?</label><br></tr></td>
	        <tr>
                <td><input type="radio" name="reliable">1
	            <input type="radio" name="reliable">2
	            <input type="radio" name="reliable">3
	            <input type="radio" name="reliable">4
	            <input type="radio" name="reliable">5</td>
            </tr>
            
	        <tr><td><label>Is Application useful for maintaining document history?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="useful">1
	            <input type="radio" name="useful">2
	            <input type="radio" name="useful">3
	            <input type="radio" name="useful">4
	            <input type="radio" name="useful">5</td>
            </tr>
            	        
	        <tr><td><label>In case of any issue, is the OA team providing proper help?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="issue">1
	            <input type="radio" name="issue">2
	            <input type="radio" name="issue">3
	            <input type="radio" name="issue">4
	            <input type="radio" name="issue">5</td>
            </tr>
            	        
	        <tr><td><label>Is Application user-friendly?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="friendly">1
	            <input type="radio" name="friendly">2
	            <input type="radio" name="friendly">3
	            <input type="radio" name="friendly">4
	            <input type="radio" name="friendly">5</td>
            </tr>
            	        
	        <tr><td><label>Using Application is a good/wise decision?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="decision">1
	            <input type="radio" name="decision">2
	            <input type="radio" name="decision">3
	            <input type="radio" name="decision">4
	            <input type="radio" name="decision">5</td>
            </tr>
            	        
	        <tr><td><label>Does Application allow me to work accurately?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="work">1
	            <input type="radio" name="work">2
	            <input type="radio" name="work">3
	            <input type="radio" name="work">4
	            <input type="radio" name="work">5</td>
            </tr>
            	        
	        <tr><td><label>Is there a need for the organization to encourage employees to use the Application?</label><br></tr></td>
            <tr>
                <td><input type="radio" name="need">1
	            <input type="radio" name="need">2
	            <input type="radio" name="need">3
	            <input type="radio" name="need">4
	            <input type="radio" name="need">5</td>
            </tr>       
    </table>
    </div>
        <div id="suggestion">
        <label>Suggestion:</label>
        <textarea></textarea>
        <button type="submit">Submit</button>
    </div>
</body>
</html>




