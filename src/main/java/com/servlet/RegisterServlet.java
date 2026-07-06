package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.db.DataBaseConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        try {

            Connection con=DataBaseConnection.getConnection();

            String q="insert into registerpage(username,password) values(?,?)";

            PreparedStatement ps=con.prepareStatement(q);

            ps.setString(1, username);
            ps.setString(2, password);

            int rows=ps.executeUpdate();

            res.setContentType("text/html");

            if(rows>0) {
                res.getWriter().println("<h1>Registration Successful</h1>");
            }
            else {
                res.getWriter().println("<h1>Registration Failed</h1>");
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}