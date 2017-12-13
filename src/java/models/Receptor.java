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
public class Receptor {
    
    private int id;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private String sexo;
    private String sangre;
    private String diagnostico;
    private String ubicacion;

    public Receptor(int id,String name, String apellidos, Date fecha_nacimiento, String sexo, String sangre, String diagnostico, String ubicacion) {
        this.id = id;
        this.nombre = name;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.sangre = sangre;
        this.diagnostico = diagnostico;
        this.ubicacion = ubicacion;
    }
    public Receptor(String name, String apellidos, Date fecha_nacimiento, String sexo, String sangre, String diagnostico, String ubicacion) {
        this.nombre = name;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.sangre = sangre;
        this.diagnostico = diagnostico;
        this.ubicacion = ubicacion;
    }
    public Receptor(int id, String name){
        this.id = id;
        this.nombre = name;
    }
    
    public Receptor(){
        
    }

    public int getId(){
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
    
    
}
