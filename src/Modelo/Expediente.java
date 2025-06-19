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
    private ListaSimpleEnlazada<Movimiento> movimientos;
    private ListaSimpleEnlazada<String> documentos;

    public Expediente(int identificador, boolean prioridad, String asunto, Interesado_Persona datos, String documentoReferencia, String fhInicio) {
        this.identificador = identificador;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.datos = datos;
        this.documentoReferencia = documentoReferencia;
        this.estado = false;
        this.fhInicio = fhInicio;
        this.fhFinal = "\000";
        this.movimientos = new ListaSimpleEnlazada<>();
        this.documentos = new ListaSimpleEnlazada<>();
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

    public boolean isEstado() {
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

    public ListaSimpleEnlazada<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ListaSimpleEnlazada<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public ListaSimpleEnlazada<String> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ListaSimpleEnlazada<String> documentos) {
        this.documentos = documentos;
    }




    
}
