/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author geram
 */
public class PostgreSQLSamplq {
    private String jbdc_url = "****"; //Override this secrets.
    private String username = "****";
    private String password = "****";
    private static PostgreSQLSamplq instance = null;
    private static Connection connection = null;

    
    private PostgreSQLSamplq(){
        try {
            Class.forName("org.postgresql.Driver");
            PostgreSQLSamplq.connection = DriverManager.getConnection(jbdc_url,username,password);
        } catch (Exception e) {
            System.out.println("[Server]:" + e);
        }
      
    }
    
    static public Connection getInstance(){
        if(PostgreSQLSamplq.instance == null){
            PostgreSQLSamplq.instance = new PostgreSQLSamplq();
        }
        return PostgreSQLSamplq.connection;
    }
    
    
    
    
}
