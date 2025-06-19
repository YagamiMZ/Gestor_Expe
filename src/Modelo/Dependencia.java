/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import TDAs.*;


public class Dependencia {
    private String nombre;
    private Cola<Expediente> cola;

    public Dependencia(String nombre) {
        this.nombre = nombre;
        this.cola = new Cola<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cola<Expediente> getCola() {
        return cola;
    }

    public void setCola(Cola<Expediente> cola) {
        this.cola = cola;
    }
    
}
