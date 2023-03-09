/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectotienda.probando.model;

/**
 *
 * @author calin10
 */
public class Usuario {
    private int cui;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String fechanacimiento;

    public Usuario(int cui, String nombres, String apellidos, String direccion, String fechanacimiento) {
        this.cui = cui;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fechanacimiento = fechanacimiento;
    }

    public Usuario() {
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cui=" + cui + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", fechanacimiento=" + fechanacimiento + '}';
    }
    
    
    
    
}
