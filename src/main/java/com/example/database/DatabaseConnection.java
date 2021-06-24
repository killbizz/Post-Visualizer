package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private Connection connDB;
    private Statement statement;

    public Statement getStatement() {
        return this.statement;
    }

    public DatabaseConnection() {
        try{
            //MySQL DB connection
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/post_visualizer", "root", "");
            statement = connDB.createStatement();

        } catch (SQLException ex) { 
            ex.printStackTrace();
            System.out.println("SQLException");
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("GenericException");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("OtherException");
        }
    }

}
