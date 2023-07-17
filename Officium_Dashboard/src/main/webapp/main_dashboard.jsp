<%@ page language="java" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <style>
        .dashboard {
            background-color: lightgray;
            padding: 20px;
            text-align: left;
            font-size: 24px;
            text-align: center;
        }

        .row {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-wrap: wrap;
            margin-top: 20px;
        }

        .icon {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin: 50px;
            cursor: pointer;
            margin-right: 10px;
        }
        
        .icon i {
            font-size: 52px; 
        }
        .icon img {
            width: 52px;
            height: 52px;
        }
        .icon a {
            text-decoration: none; 
            margin: 10px 0; 
        }
        .calendar {
            margin-top: 50px;
            text-align: center;
        }
         #datepicker {
            margin-top: 10px;
            padding: 5px;
            font-size: 16px;
        }
        .dropdown-content {
            display: none;
            position: absolute;
            top: 100%;
            left: 0;
            background-color: #f9f9f9;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }
        .icon:hover .dropdown-content {
            display: block;
        }
        .dropdown-item {
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }
        .dropdown-item:hover {
            background-color: #f1f1f1;
        }
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
    <!-- ... (existing CSS links) ... -->
</head>
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.10.2/fullcalendar.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
</head>
<body>
    <div class="dashboard">
       OFFICIUM Dashboard
    </div>

    <div class="row">
        <div class="icon">
            <i class="fas fa-envelope"></i>
            <span><a href="<%= getWordFileURL("letter.docx") %>">Letter</a></span>
        </div>
        <div class="icon">
            <i class="fas fa-sticky-note"></i>
            <span><a href="<%= getWordFileURL("note.docx") %>">Note</a></span>
        </div>
        <div class="icon">
            <img src="note-icon.png" alt="MOM Icon">
            <span><a href="<%= getWordFileURL("noting.docx") %>">Noting</a></span>
        </div>
        <div class="icon">
            <img src="mom.png" alt="MOM Icon">
            <span><a href="/Word/mom.docx">MOM</a></span>
        </div>
        <div class="icon">
            <i class="fas fa-newspaper"></i>
            <span><a href="<%= getWordFileURL("note.docx") %>">Khabarnama</a></span>
            <div class="dropdown-content">
            <a href="#">Option 1</a>
            <a href="#">Option 2</a>
            <a href="#">Option 3</a>
            <!-- Add more options as needed -->
        </div>
        </div>
    </div>

    <div class="calendar">
        <h2>Calendar</h2>
        <!-- Flatpickr date picker -->
        <input type="text" id="datepicker" placeholder="Select a date" readonly>
        <!-- FullCalendar container -->
        <div id="calendar"></div>
    </div>

    <%-- Java function to generate the URL for opening the Word file --%>
    <%!
        public String getWordFileURL(String filename) {
            try {
                String encodedFilename = URLEncoder.encode(filename, "UTF-8");
                return "/Word/" + encodedFilename;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    %>

    <!-- JavaScript to initialize Flatpickr -->
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            // Initialize Flatpickr date picker
            flatpickr("#datepicker", {
                dateFormat: "d/m/Y",
                // You can add more options here as needed
            });

            // Initialize FullCalendar
            var calendarEl = document.getElementById('calendar');
            var calendar = new FullCalendar.Calendar(calendarEl, {
                initialView: 'dayGridMonth',
                events: [
                    // Your events data goes here
                    // Example: { title: 'Event 1', start: '2023-07-17' },
                    // Example: { title: 'Event 2', start: '2023-07-18' },
                    // ...
                ],
                headerToolbar: {
                    left: 'prev,next today',
                    center: 'title',
                    right: 'dayGridMonth,timeGridWeek,timeGridDay'
                },
                // Add any additional options or callbacks as needed
            });
            calendar.render();
        });
    </script>
</body>
</html>
