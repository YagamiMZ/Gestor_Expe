/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class Interesado_Persona {
    private String DNI;
    private String nombre; 
    private String telefono;
    private String email;
    private boolean procedencia;

    public Interesado_Persona(String DNI, String nombre, String telefono, String email, boolean procedencia) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.procedencia = procedencia;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(boolean procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Interesado_Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", procedencia=" + procedencia + '}';
    }
    
    
}
