
package com.proyecto.bakend.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    
}
