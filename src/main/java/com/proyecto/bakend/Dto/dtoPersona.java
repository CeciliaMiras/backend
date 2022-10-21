
package com.proyecto.bakend.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido; 
    @NotBlank
    private String descripcion; 
    @NotBlank
    private String img;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImg(String img) {
        this.img = img;
    }

  
    
    
    
}
