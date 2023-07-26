package inventario.Control;
import inventario.Modelo.IRepositorio;
import inventario.Modelo.Componente;
import inventario.Modelo.InventarioException;
import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public class Componentes implements IRepositorio<Componente>
{
    ArrayList<Componente> componentes = new ArrayList<>();
    int ultId=0;
    
    @Override
    public Componente Alta(Componente t) throws InventarioException
    {
        Componente c = BuscarXNombre(t.getNombre());
        if(c==null)
        {
            t.setId(ultId++);
            if(componentes.add(t)) return t;
            else throw new InventarioException("Error al dar de alta");
        }
        else
        {
            c.setCantidad(c.getCantidad()+t.getCantidad());
            c.setPrecio(t.getPrecio());
            return c;
        }
    }

    @Override
    public boolean Baja(int id) throws InventarioException 
    {
        return componentes.remove(id)!=null;
        //hrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean Baja(int[] ids) throws InventarioException 
    {
        ArrayList<Componente> componentesAEliminar=TraerVarios(ids);
        for(Componente c : componentesAEliminar)
        {
            componentes.remove(c);
            //Baja(id);
        }
        return true;
    }

    @Override
    public boolean Modifica(Componente t) throws InventarioException 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Componente Buscar(int id) 
    {
        for(Componente c : componentes)
        {
            if(c.getId() == id) return c;
        }
        return null;
    }

    @Override
    public Componente BuscarXNombre(String nombre) 
    {
        for(Componente c : componentes)
        {
            if(nombre.equals(c.getNombre().toUpperCase())) return c;
        }
        return null;
    }
    
    public ArrayList<Componente> getComponentesXTipo(String tipo) 
    {
        ArrayList<Componente> componentesOut=new ArrayList<>();
        for(Componente componente: componentes)
        {
            if(componente.getTipo().getNombre().toLowerCase().equals(tipo))componentesOut.add(componente);
        }
        return componentesOut;
    }
    

    @Override
    public ArrayList<Componente> TraerTodo() 
    {
        return componentes;
    }
    
    public ArrayList<Componente> TraerVarios(int[] ids) 
    {
        ArrayList<Componente> componentesOut=new ArrayList ();
        for(int id: ids)
        {
            componentesOut.add(Buscar(id));
        }
        return componentesOut;
    }
}
