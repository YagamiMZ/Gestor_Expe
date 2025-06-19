/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

//convertimos a clase generica, reemplazar los parametros int a T.

import Modelo.*;
//convertimos a clase generica, reemplazar los parametros int a T.
public class Nodo1<T>{
    
    private T item;
    private Nodo1 sgteNodo; //asumiendo q la clase nodo ya esta hecha
    
    //metodos
    //creacion de un nodo
    //constructores sin/con parametros
    
    public Nodo1(){
        item = null;
        sgteNodo = null;
    }
    
    public Nodo1(T item){
        this.item = item;
        sgteNodo = null;
    }
    
    public Nodo1(T item, Nodo1 sgteNodo){
        this.item = item;
        this.sgteNodo = sgteNodo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Nodo1 getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo1 sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
    
    
    
    
    
    
    
    
}
