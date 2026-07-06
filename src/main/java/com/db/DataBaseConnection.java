package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

    public static Connection getConnection() {

        Connection con=null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/batch71",
                    "root",
                    "123456");
            System.out.println("Connected");

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}