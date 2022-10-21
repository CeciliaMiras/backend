
package com.proyecto.bakend.Security.Dto;

import java.util.HashSet;
import java.util.Set;


public class NuevoUsuario {
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Set<String>roles=new HashSet<>();
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    
    
}
