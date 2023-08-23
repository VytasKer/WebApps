package com.cornholio;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/time")
public class UnixTimeServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    long unixTimeSeconds = System.currentTimeMillis() / 1000;

    response.setContentType("text/html");
    response.getWriter().println(unixTimeSeconds);
  }
}