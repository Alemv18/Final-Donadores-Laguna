/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author juans
 */
public class Donacion {
    
    private int id;
    private Receptor receptor;
    private Donador donador;
    private Date fecha_donacion;
    private String ubicacion;
    private String comentarios;
    

    public Donacion(Receptor receptor, Donador donador, int id, Date fecha_donacion, String ubicacion, String comentarios) {
        this.receptor = receptor;
        this.donador = donador;
        this.id = id;
        this.fecha_donacion = fecha_donacion;
        this.ubicacion = ubicacion;
        this.comentarios = comentarios;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public Donador getDonador() {
        return donador;
    }

    public void setDonador(Donador donador) {
        this.donador = donador;
    }

    public Date getFecha_donacion() {
        return fecha_donacion;
    }

    public void setFecha_donacion(Date fecha_donacion) {
        this.fecha_donacion = fecha_donacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
}
