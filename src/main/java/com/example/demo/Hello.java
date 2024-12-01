/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;
import java.sql.Statement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author geram
 */
@RestController
public class Hello {

  @RequestMapping("/")
  public List<User> Greet() {
    try {
      var connection = PostgreSQLSamplq.getInstance();
      Statement statement = connection.createStatement();
      ResultSet result = statement.executeQuery("SELECT * FROM \"User\"");

      // while(result.next()){
      // String column_value = result.getString("nombre_usuario");
      // System.out.println("Column value: "+ column_value);
      // }

      List<User> users = new ArrayList<User>();

      while (result.next()) {
        User user = new User();
        user.setId_usuario(Integer.parseInt(result.getString("id_usuario")));
        user.setNombre_usuario(result.getString("nombre_usuario"));
        user.setRole(result.getString("role"));
        user.setUltima_sesion(result.getString("ultima_sesion"));
        user.setFecha_creado(result.getString("fecha_creado"));
        user.setFecha_modificado(result.getString("fecha_modificado"));
        user.setReset_password(Boolean.parseBoolean(result.getString("resetPassword")));
        users.add(user);
      }
      
      return users;
    } catch (Exception e) {
      System.out.println("[SERVER]:" + e);
      return null;
    }

  }
}
