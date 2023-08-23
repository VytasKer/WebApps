package com.cornholio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/date.html")
public class DateServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Date now = new Date();

		PrintWriter out = response.getWriter();
		out.println("<p>Current time: " + now.toString() + "</p>");
	}
}