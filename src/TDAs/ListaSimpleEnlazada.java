
//Ronald
package TDAs;

public class ListaSimpleEnlazada<T> {
    
    private Nodo<T> cabeza;
    private Nodo<T> ultimo;    

    public ListaSimpleEnlazada() {
        cabeza=null;
        ultimo=null;
               
    }
    
    public boolean esVacia(){
        
        return cabeza==null;
        
    }    
    
    
    //Agregar: añade al final de la lista un nuevo nodo
    
    public void agregar(T item){
    
        Nodo<T> n = new Nodo(item,null);
        if (esVacia()) {
            
            cabeza = n;
            ultimo = n;
            
        }else{
            
            /*
            Nodo aux=cabeza;
            while(aux.getSgteNodo()!=null){
            
                aux=aux.getSgteNodo();
            }       
            aux.setSgteNodo(n);
            */
            ultimo.setSgteNodo(n);
            ultimo = n;
            
        }
    }
    
    public int longitud(){
        
        if (esVacia()) {
            
            return 0;
            
        }else{
            
            int contador =1;
            
            Nodo<T> aux=cabeza;
            while(aux.getSgteNodo()!=null){
                
                contador++;
                aux=aux.getSgteNodo();
            }       

            return contador;
        }
    }
    
    
    public void mostrar(){
    
        Nodo<T> aux = cabeza;
        while(aux!=null){
            
            System.out.print(aux.getItem()+"\t");
            aux = aux.getSgteNodo();
        
        }    
    }
    
    public T iesimo(int pos){
    
        if(pos>=1 && pos<=longitud()){
                 
            Nodo<T> aux = cabeza;
            for (int i = 1; i < pos; i++) {       
                aux=aux.getSgteNodo();
            }
            return aux.getItem();
                
            }
        else{
        
            return null;
        }            
    }
    
    /*
    Ubicacion
    */
    
    public int ubicacion(T item){
        
        
        if (esVacia()) {
            return -1;
            
        }else{
            int i=1;
            Nodo<T> aux = cabeza;
            while(aux!=null){
                if (aux.getItem().equals(item)) {
                    return i;                
                }
                aux=aux.getSgteNodo();
                i++;      
            }
            return -1;
        }
    }
    
    public void insertar(T item,int pos){
        
        if (pos>=1 && pos<=longitud()) {
            
            Nodo<T> newNodo = new Nodo(item);
            //caso 1:añadir en la posicion 1
            if (pos==1) {
                newNodo.setSgteNodo(cabeza);
                cabeza = newNodo;                
            }else if(pos>1){
                
                Nodo<T> aux = cabeza;                
                for (int i = 1; i < pos-1; i++) {
                    aux=aux.getSgteNodo();
                                      
                }
                newNodo.setSgteNodo(aux.getSgteNodo());
                aux.setSgteNodo(newNodo);     
            }
   
        }else{
            System.out.println("La posicion no es valida!!!");
        }
    }
    
    //Eliminar
    public void eliminar(int pos){
        
        if (pos>=1 && pos<=longitud()) {
            
            if (pos==1) {
                cabeza=cabeza.getSgteNodo();                
            }if (pos>1) {
                
                Nodo<T> aux = cabeza;
                for (int i = 1; i < pos-1; i++) {
                    aux = aux.getSgteNodo();       
                }
                Nodo<T> aux2=aux.getSgteNodo();
                aux.setSgteNodo(aux2.getSgteNodo());
       
            }

        }else{
            System.out.println("La posicion no es valida!!!");
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
