
package com.proyecto.bakend.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHYS {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    public dtoHYS() {
    }

    public dtoHYS(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
