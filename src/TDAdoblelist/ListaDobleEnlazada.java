//Ronald
package TDAdoblelist;

public class ListaDobleEnlazada<T> {

    private Nodo<T> cabeza;
    private Nodo<T> ultimo;

    public ListaDobleEnlazada() {
        cabeza = null;
        ultimo = null;

    }

    public boolean esVacia() {

        return cabeza == null;

    }

    //Agregar: añade al final de la lista un nuevo nodo
    public void agregar(T item) {

        Nodo<T> n = new Nodo(item, null, null);
        if (esVacia()) {

            cabeza = n;
            ultimo = n;

        } else {

            /*
            Nodo aux=cabeza;
            while(aux.getSgteNodo()!=null){
            
                aux=aux.getSgteNodo();
            }       
            aux.setSgteNodo(n);
             */
            ultimo.setSgteNodo(n);
            n.setAntNodo(ultimo);
            ultimo = n;

        }
    }

    public int longitud() {

        if (esVacia()) {

            return 0;

        } else {

            int contador = 1;

            Nodo<T> aux = cabeza;
            while (aux.getSgteNodo() != null) {

                contador++;
                aux = aux.getSgteNodo();
            }

            return contador;
        }
    }

    public void mostrar() {

        Nodo<T> aux = cabeza;
        while (aux != null) {

            System.out.print(aux.getItem() + "\t");
            aux = aux.getSgteNodo();

        }
    }

    public void mostrarInvert() {

        Nodo<T> aux = ultimo;
        while (aux != null) {

            System.out.print(aux.getItem() + "\t");
            aux = aux.getAntNodo();

        }
    }

    public T iesimo(int pos) {

        if (pos >= 1 && pos <= longitud()) {

            Nodo<T> aux = cabeza;
            for (int i = 1; i < pos; i++) {
                aux = aux.getSgteNodo();
            }
            return aux.getItem();

        } else {

            return null;
        }
    }

    public Nodo<T> iesimoNodo(int pos) {

        if (pos >= 1 && pos <= longitud()) {

            Nodo<T> aux = cabeza;
            for (int i = 1; i < pos; i++) {
                aux = aux.getSgteNodo();
            }
            return aux;

        } else {

            return null;
        }
    }


    /*
    Ubicacion
     */
    public int ubicacion(T item) {

        if (esVacia()) {
            return -1;

        } else {
            int i = 1;
            Nodo<T> aux = cabeza;
            while (aux != null) {
                if (aux.getItem().equals(item)) {
                    return i;
                }
                aux = aux.getSgteNodo();
                i++;
            }
            return -1;
        }
    }

    public void insertar(T item, int pos) {

        if (pos >= 1 && pos <= longitud()) {

            Nodo<T> newNodo = new Nodo(item);
            //caso 1:añadir en la posicion 1
            if (pos == 1) {
                newNodo.setSgteNodo(cabeza);
                cabeza = newNodo;
                ultimo.setSgteNodo(newNodo);
            } else if (pos > 1) {

                Nodo<T> aux = cabeza;
                for (int i = 1; i < pos - 1; i++) {
                    aux = aux.getSgteNodo();

                }
                Nodo<T> aux2 = aux.getSgteNodo();
                newNodo.setSgteNodo(aux2);
                aux2.setAntNodo(newNodo);
                newNodo.setAntNodo(aux);
                aux.setSgteNodo(newNodo);

            }

        } else {
            System.out.println("La posicion no es valida!!!");
        }
    }

    //Eliminar
    public void eliminar(int pos) {

        //posicion valida
        if (pos >= 1 && pos <= longitud()) {

            //primera posicion
            if (pos == 1) {
                cabeza = cabeza.getSgteNodo();
                if (cabeza != null) {
                    cabeza.setAntNodo(null);
                }
            } else if (pos > 1 && pos < longitud()) {

                Nodo<T> aux = cabeza;
                for (int i = 1; i < pos - 1; i++) {

                    aux = aux.getSgteNodo();

                }
                //aux elemento previo
                //aux2 es el q vas a elminar

                Nodo<T> aux2 = aux.getSgteNodo();

                aux.setSgteNodo(aux2.getSgteNodo());
                aux2.getSgteNodo().setAntNodo(aux);

            } else {

                ultimo = ultimo.getAntNodo();
                ultimo.setSgteNodo(null);

            }

        } else {
            System.out.println("La posicion no es valida!!!");
        }

    }

    /*
    Intercambiar.- Cambiar dos elementos de los nodos gracias a sus posiciones
     */
    public void Intercambiar(int pos1, int pos2) {

        if (pos1 > 0 || pos1 <= longitud() || pos2 > 0 || pos2 <= longitud()) {
            // posicion valida
            T item = iesimoNodo(pos1).getItem();
            T item2 = iesimoNodo(pos2).getItem();
            iesimoNodo(pos1).setItem(item2);
            iesimoNodo(pos2).setItem(item);   
        } else {
            System.out.println("Posicion no valida");
        }

    }


    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

}
