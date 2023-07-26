package inventario.Modelo;

import inventario.Control.Componentes;
import inventario.Control.TiposComponente;
import inventario.Observador.Observable;
import java.util.ArrayList;
import static java.util.Arrays.asList;

/**
 *
 * @author mneter
 */
public class SistemaInventario extends Observable
{
    private Componentes componentes = new Componentes();
    private TiposComponente tipos = new TiposComponente();
    private ArrayList<String> unidades = new ArrayList<>(asList("M","K","-","µ","n","p"));
    
    private SistemaInventario(){}
    private static SistemaInventario instancia = new SistemaInventario();
    public static SistemaInventario getInstancia(){return instancia;}

    public ArrayList<String> getUnidades() 
    {
        return unidades;
    }

    public TipoComponente getTipoXNombre(String tipo_string) 
    {
        return tipos.BuscarXNombre(tipo_string);
    }

    public void quitarComponentes(int[] componentesAEliminar) throws InventarioException 
    {
        componentes.Baja(componentesAEliminar);
    }
    
    public enum eventos{cambioListaComponentes};
    
    public TipoComponente agregarTipo(TipoComponente nuevo) throws InventarioException
    {
        return tipos.Alta(nuevo);
    }
    public ArrayList<TipoComponente> getTipos()
    {
        return tipos.TraerTodo();
    }
    
    public Componente agregarComponente(Componente nuevo) throws InventarioException
    {
        return componentes.Alta(nuevo);
    }
    public ArrayList<Componente> getComponentes()
    {
        return componentes.TraerTodo();
    }
    public Componente getComponenteXNombre(String nombre)
    {
        return componentes.BuscarXNombre(nombre);
    }
    public ArrayList<Componente> getComponentesXTipo(String tipo)
    {
        return componentes.getComponentesXTipo(tipo);
    }
}
