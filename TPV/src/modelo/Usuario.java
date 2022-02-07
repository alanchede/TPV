/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Joselu
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private int rol; //0 normal,1 admnin
    private String usuario;
    private String password;

    public Usuario(String nombre, String apellidos, int rol, String usuario, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rol = rol;
        this.usuario = usuario;
        this.password = password;
    }
    
    public Usuario() {
        this.nombre = "";
        this.apellidos = "";
        this.rol = 0;
        this.usuario = "";
        this.password = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", rol=" + rol + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
    
}
