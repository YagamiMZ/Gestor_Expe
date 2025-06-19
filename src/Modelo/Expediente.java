/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import TDAs.*;

public class Expediente {
    
    private int identificador; 
    private boolean prioridad;
    private String asunto;
    private Interesado_Persona datos;
    private String documentoReferencia;
    private boolean estado;
    private String fhInicio;
    private String fhFinal;
    private ListaSimpleEnlazada<Tramite> documentoProducto;

    public Expediente(int identificador, boolean prioridad, String asunto, Interesado_Persona datos, String documentoReferencia, boolean estado, String fhInicio, String fhFinal, ListaSimpleEnlazada<Tramite> documentoProducto) {
        this.identificador = identificador;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.datos = datos;
        this.documentoReferencia = documentoReferencia;
        this.estado = estado;
        this.fhInicio = fhInicio;
        this.fhFinal = null;
        this.documentoProducto = documentoProducto;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Interesado_Persona getDatos() {
        return datos;
    }

    public void setDatos(Interesado_Persona datos) {
        this.datos = datos;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }

    public void setDocumentoReferencia(String documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFhInicio() {
        return fhInicio;
    }

    public void setFhInicio(String fhInicio) {
        this.fhInicio = fhInicio;
    }

    public String getFhFinal() {
        return fhFinal;
    }

    public void setFhFinal(String fhFinal) {
        this.fhFinal = fhFinal;
    }

    public ListaSimpleEnlazada<Tramite> getDocumentoProducto() {
        return documentoProducto;
    }

    public void setDocumentoProducto(ListaSimpleEnlazada<Tramite> documentoProducto) {
        this.documentoProducto = documentoProducto;
    }
    
    
}
