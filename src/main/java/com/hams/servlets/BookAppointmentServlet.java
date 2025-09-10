package com.hams.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BookAppointmentServlet")
public class BookAppointmentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form inputs
        String patientName = request.getParameter("patientName");
        String doctorName = request.getParameter("doctorName");
        String appointmentDate = request.getParameter("appointmentDate");

        // Set response type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display confirmation page
        out.println("<html><body>");
        out.println("<h2>Appointment Confirmation</h2>");
        out.println("<p>Patient: " + patientName + "</p>");
        out.println("<p>Doctor: " + doctorName + "</p>");
        out.println("<p>Date: " + appointmentDate + "</p>");
        out.println("<br><a href='index.jsp'>Back to Home</a>");
        out.println("</body></html>");
    }
}
