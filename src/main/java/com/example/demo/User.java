package com.example.demo;

public class User {

  
  
  public User(Integer id_usuario, String nombre_usuario, String role, String ultima_sesion, String fecha_creado,
  String fecha_modificado, Boolean reset_password) {
    this.id_usuario = id_usuario;
    this.nombre_usuario = nombre_usuario;
    this.role = role;
    this.ultima_sesion = ultima_sesion;
    this.fecha_creado = fecha_creado;
    this.fecha_modificado = fecha_modificado;
    this.reset_password = reset_password;
  }

  public User() {}


  public Integer getId_usuario() {
    return id_usuario;
  }
  public void setId_usuario(Integer id_usuario) {
    this.id_usuario = id_usuario;
  }
  public String getNombre_usuario() {
    return nombre_usuario;
  }
  public void setNombre_usuario(String nombre_usuario) {
    this.nombre_usuario = nombre_usuario;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public String getUltima_sesion() {
    return ultima_sesion;
  }
  public void setUltima_sesion(String ultima_sesion) {
    this.ultima_sesion = ultima_sesion;
  }
  public String getFecha_creado() {
    return fecha_creado;
  }
  public void setFecha_creado(String fecha_creado) {
    this.fecha_creado = fecha_creado;
  }
  public String getFecha_modificado() {
    return fecha_modificado;
  }
  public void setFecha_modificado(String fecha_modificado) {
    this.fecha_modificado = fecha_modificado;
  }
  public Boolean getReset_password() {
    return reset_password;
  }
  public void setReset_password(Boolean reset_password) {
    this.reset_password = reset_password;
  }
  
  private Integer id_usuario;
  private String nombre_usuario;
  private String role;
  private String ultima_sesion;
  private String fecha_creado;
  private String fecha_modificado;
  private Boolean reset_password;
}
