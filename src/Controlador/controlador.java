
package Controlador;
import TDAs.*;
import Modelo.*;
import TDAdoblelist.*;
//777
public class controlador {
    
    private static ListaDobleEnlazada<Expediente> Todo_Expedientes = new ListaDobleEnlazada<>();
    //private static ListaCircularSimple<Expediente> Alertas = new ListaCircularSimple<>();
    private static ListaDobleEnlazada<Expediente> Expedientes_Finalizados = new ListaDobleEnlazada<>();
    private static ListaSimpleEnlazada<Dependencia> lista_Dependencia = new ListaSimpleEnlazada<>();
    
   
    
    public static boolean Registrar_enDependencia(Expediente exp,int indice){   
        boolean creado = false;
        lista_Dependencia.iesimo(indice).getCola().encolar(exp);
        
        
        return creado;
    }
    
    private static Expediente BuscarExpediente(int id){
    
        for (int i = 1; i <= Todo_Expedientes.longitud(); i++) {
            
            if(id==Todo_Expedientes.iesimo(i).getIdentificador()) {
                
                return Todo_Expedientes.iesimo(i);
            }
        }
        return null;
    }
    
    
    public static void FinalizarTramite(int id){
        Expediente exp = BuscarExpediente(id);
        
        exp.setEstado(true);
    }

    public static ListaDobleEnlazada<Expediente> getTodo_Expedientes() {
        return Todo_Expedientes;
    }

    public static void setTodo_Expedientes(ListaDobleEnlazada<Expediente> Todo_Expedientes) {
        controlador.Todo_Expedientes = Todo_Expedientes;
    }

    public static ListaDobleEnlazada<Expediente> getExpedientes_Finalizados() {
        return Expedientes_Finalizados;
    }

    public static void setExpedientes_Finalizados(ListaDobleEnlazada<Expediente> Expedientes_Finalizados) {
        controlador.Expedientes_Finalizados = Expedientes_Finalizados;
    }

    public static ListaSimpleEnlazada<Dependencia> getLista_Dependencia() {
        return lista_Dependencia;
    }

    public static void setLista_Dependencia(ListaSimpleEnlazada<Dependencia> lista_Dependencia) {
        controlador.lista_Dependencia = lista_Dependencia;
    }

    
}
