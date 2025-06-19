/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

public class Cola<T> {

    /*
    Frente: apunta al primer item de la cola.
    Ultimo: apunta al ultimo item de la cola.
     */
    private Nodo<T> frente;
    private Nodo<T> ultimo;

    /*-------------------------------
    --------CONSTRUCTORES------------
    ---------------------------------*/
    public Cola() {
        this.frente = null;
        this.ultimo = null;

    }

    public Cola(Nodo<T> frente, Nodo<T> ultimo) {
        this.frente = frente;
        this.ultimo = ultimo;

    }

    /*-------------------
    ------METODOS--------
    ---------------------*/
 /*
    esVacio: Determina si la cola esta vacia
    TIPO DE RETORNO: true or false
     */
    public boolean esVacio() {
        return frente == null;
    }

    /*
    encolar: Agrega un elemento a la cola, coloca el elemento al final de la cola.
    PARAMETROS: el item a ooner en la cola.
    TIPO DE RETORNO: void
    CASOS A CONSIDERAR:
    1. la cola esta vacia:
     */
    public void encolar(T item) {

        Nodo<T> nodo = new Nodo<T>(item, null);
        if (esVacio()) {
            frente = nodo;
            ultimo = nodo;    
        }else {

            ultimo.setSgteNodo(nodo);
            ultimo = nodo;

        }
    }

    public T desencolar() {

        if (esVacio()) {

            throw new RuntimeException("La cola esta vacia!!");
        } else {

            T item = frente.getItem();
            frente = frente.getSgteNodo();

            return item;
        }
    }

    public Nodo<T> getFrente() {
        return frente;
    }

    public void setFrente(Nodo<T> frente) {
        this.frente = frente;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }
    
    


}
