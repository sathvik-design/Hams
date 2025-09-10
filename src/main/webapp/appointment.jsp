<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Appointment</title>
</head>
<body>
    <h2>Book Your Appointment</h2>
    <form action="BookAppointmentServlet" method="post">
        <label>Patient Name:</label>
        <input type="text" name="patientName" required><br><br>

        <label>Doctor:</label>
        <input type="text" name="doctorName" required><br><br>

        <label>Date:</label>
        <input type="date" name="appointmentDate" required><br><br>

        <input type="submit" value="Book">
    </form>

    <p><a href="index.jsp">Back to Home</a></p>
</body>
</html>
