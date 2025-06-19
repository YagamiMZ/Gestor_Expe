/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import TDAs.*;
//convirtiendo la clase a generica 
public class ListaDE<T> {

    private NodoDoble<T> cabeza;
    private NodoDoble<T> ultimo;

    //metodos
    public ListaDE() {
        cabeza = null;
        ultimo = null;
    }

    /*
    metodo: es vacio.
    verifica si la lista esta vacia
     */
    public boolean esVacia() {
        return cabeza == null;
    }

    /*
    agregar: añade al final de la lista un nuevo nodo
     */
    public void agregar(T item) {
        //crear un nuevo nodo
        NodoDoble<T> nuevo = new NodoDoble(item, null, null);

        if (esVacia()) {
            //lista esta vacia
            cabeza = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setAntNodo(ultimo);
            ultimo.setSgteNodo(nuevo);
            ultimo = nuevo;

        }
    }

    public void mostrar() {
        NodoDoble<T> aux = cabeza;
        //while(aux!=null){ //cuando la lista esta vacia, la cabeza 
        //  System.out.print(aux.getItem()+"\t");
        // aux = aux.getSgteNodo();
        for (int i = 0; i < longitud(); i++) {
            System.out.print(aux.getItem() + "\t");
            aux = aux.getSgteNodo();
        }
        System.out.println(" ");
    }

    public void mostrarInv() {
        NodoDoble<T> aux = ultimo;
        while (aux != null) {
            System.out.print(aux.getItem() + "\t");
            aux = aux.getAntNodo();
        }
    }

    //CONTAR
    public int longitud() {
        int n = 0;
        if (esVacia()) {
            return 0;
        } else {
            NodoDoble<T> aux = cabeza;
            while (aux != null) {
                n++;
                aux = aux.getSgteNodo();
            }
            return n;
        }
    }

    //devuelve el valor de un item de una posicion dada
    public T iesimo(int pos) {
        if (pos >= 1 && pos <= longitud()) {
            int i = 1;
            NodoDoble<T> aux = cabeza;
            while (i < pos) {
                aux = aux.getSgteNodo();
                i++;
            }
            return aux.getItem();
        } else {
            return null;
        }
    }

    public int buscar(T item) {
        NodoDoble<T> aux = cabeza;
        int contador = 0;
        if (!esVacia()) {
            while (!aux.getItem().equals(item)) {
                aux = aux.getSgteNodo();
                contador++;
            }
            contador++;
        }
        return contador;
    }

    public void insertar(T item, int pos) {
        if (pos >= 1 && pos <= longitud()) {
            NodoDoble<T> nuevoNodo = new NodoDoble(item, null, null);
            if (pos == 1) {
                nuevoNodo.setSgteNodo(cabeza);
                cabeza.setAntNodo(nuevoNodo);
                cabeza = nuevoNodo;
            } else {
                NodoDoble aux = cabeza;
                for (int j = 1; j < pos - 1; j++) {
                    aux = aux.getSgteNodo();
                }
                nuevoNodo.setSgteNodo(aux.getSgteNodo());
                aux.setSgteNodo(nuevoNodo);
                aux = nuevoNodo.getSgteNodo();
                nuevoNodo.setAntNodo(aux.getAntNodo());
                aux.setAntNodo(nuevoNodo);

            }
        } else {
            System.out.println("Posición no valida!!!: ");
        }
    }

    public void eliminar(int pos) {
        if (pos >= 1 && pos <= longitud()) {
            if (pos == 1) {
                cabeza = cabeza.getSgteNodo();
                if (cabeza != null) {
                    cabeza.setAntNodo(null);
                }
            } else {
                NodoDoble<T> aux = cabeza;
                for (int i = 1; i < pos - 1; i++) {
                    aux = aux.getSgteNodo();
                }
                if (pos != longitud()) {
                    NodoDoble<T> aux2 = aux.getSgteNodo();
                    aux.setSgteNodo(aux2.getSgteNodo());
                    aux2 = aux2.getSgteNodo();
                    aux2.setAntNodo(aux);
                } else {
                    ultimo = aux;
                    aux.setSgteNodo(null);
                }
            }
        } else {
            System.out.println("Posición no valida!!!: ");
        }
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }

}
