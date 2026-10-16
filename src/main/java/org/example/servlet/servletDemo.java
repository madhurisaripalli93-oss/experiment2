package org.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class servletDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String username =request.getParameter("username");
        String password =request.getParameter("password");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Welcome:"+username+"</h1>");
        out.println("<p>Password:"+password+"</p>");
        out.println("</body>");
        out.println("</html>");

    }
}