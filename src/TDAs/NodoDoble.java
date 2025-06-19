/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

//convertimos a clase generica, reemplazar los parametros int a T.

import Modelo.*;
//convertimos a clase generica, reemplazar los parametros int a T.
public class NodoDoble<T>{
    
    private NodoDoble<T> antNodo;
    private T item;
    private NodoDoble<T> sgteNodo; //asumiendo q la clase nodo ya esta hecha
    
    //metodos
    //creacion de un nodo
    //constructores sin/con parametros
    
    public NodoDoble(){
        item = null;
        sgteNodo = null;
        antNodo = null;
    }
    
    public NodoDoble(T item){
        this.item = item;
        sgteNodo = null;
        antNodo = null;
    }
    
    public NodoDoble(T item, NodoDoble<T> sgteNodo, NodoDoble<T> antNodo){
        this.item = item;
        this.sgteNodo = sgteNodo;
        this.antNodo = antNodo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public NodoDoble<T> getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(NodoDoble<T> sgteNodo) {
        this.sgteNodo = sgteNodo;
    }

    public NodoDoble<T> getAntNodo() {
        return antNodo;
    }

    public void setAntNodo(NodoDoble<T> antNodo) {
        this.antNodo = antNodo;
    }
    
    
    
    
    
    
    
    
}
