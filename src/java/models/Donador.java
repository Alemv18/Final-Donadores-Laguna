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
public class Donador {
    
    private int id;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private String sexo;
    private String sangre;
    private String email;
    private String telefono;
    private String direccion;
    private Integer cp;
    
    
    public Donador(String nombre, String apellidos, Date fecha_nacimiento, String sexo, String sangre, String email, String telefono, String direccion, Integer cp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.sangre = sangre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cp = cp;
    }
    
    public Donador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Donador{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + ", sangre=" + sangre + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + ", cp=" + cp + '}';
    }


    
}
