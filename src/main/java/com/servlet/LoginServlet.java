package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.db.DataBaseConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        res.setContentType("text/html");

        try {

            Connection con=DataBaseConnection.getConnection();

            String q="select * from registerpage where username=? and password=?";

            PreparedStatement ps=con.prepareStatement(q);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs=ps.executeQuery();

            if(rs.next()) {

                res.getWriter().println(
                "<h1>Login Successful</h1>");

                res.getWriter().println(
                "<h2>Welcome "+username+"</h2>");

            }
            else {

                res.getWriter().println(
                "<h1>Invalid Username or Password</h1>");

            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}