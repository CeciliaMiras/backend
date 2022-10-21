
package com.proyecto.bakend.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    //CONSTRUCTOR

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    //GETTERS Y SETTERS

    public String getNombreE() {
        return nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
