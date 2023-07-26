package inventario.Controladores;

import inventario.Modelo.Componente;
import inventario.Modelo.InventarioException;
import inventario.Modelo.SistemaInventario;
import inventario.Observador.Observable;
import inventario.Observador.Observador;
import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public class ControladorInicio implements Observador 
{
    private VistaInicio vista;
    private SistemaInventario sistema = SistemaInventario.getInstancia();
    private ArrayList<Componente> componentes = new ArrayList<>();
    
    public ControladorInicio(VistaInicio vista)
    {
        this.vista = vista;
        sistema.agregarObservador(this);
        componentes = sistema.getComponentes();
        mostrarComponentes(componentes); 
    }
    
    private void mostrarComponentes(ArrayList<Componente> comps_in)
    {
        if(!comps_in.isEmpty())
        {
            vista.mostrarComponentes(comps_in);
        }
    }
    
    public void filtrarXNombre(String nombre)
    {
        if(nombre.equals("")) vista.mostrarComponentes(componentes);
        ArrayList<Componente> componentesOut = new ArrayList<>();
        for(Componente c:componentes)
        {
            if(c.contieneNombre(nombre.toLowerCase()))
             componentesOut.add(c);
        }
        vista.mostrarComponentes(componentesOut); 
    }
    public void filtrarXTipos(ArrayList<String> tipos) 
    {
        if(tipos.isEmpty()){mostrarComponentes(componentes); }
        else
        {
            ArrayList<Componente> componentesOut = new ArrayList<>();
            
            
            for(String tipo : tipos)
            {
                componentesOut.addAll(sistema.getComponentesXTipo(tipo));
            }
            vista.mostrarComponentes(componentesOut); 
        }
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) 
    {
        //agregar evento y logica
        if(evento.equals(SistemaInventario.eventos.cambioListaComponentes))
        {
            componentes = sistema.getComponentes();
            mostrarComponentes(componentes); 
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void quitarCompontentes(int[] componentesAEliminar) 
    {
        try {
            sistema.quitarComponentes(componentesAEliminar);
            mostrarComponentes(componentes);
        } catch (InventarioException ex) {
            vista.error(ex.getMessage());
            //Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
