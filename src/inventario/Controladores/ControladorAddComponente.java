package inventario.Controladores;

import inventario.Modelo.Componente;
import inventario.Modelo.InventarioException;
import inventario.Modelo.SistemaInventario;
import inventario.Modelo.TipoComponente;
import inventario.Observador.Observable;
import inventario.Observador.Observador;
import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public class ControladorAddComponente implements Observador 
{

    VistaAddComponente vista;
    SistemaInventario sistema = SistemaInventario.getInstancia();
    TipoComponente tipo_seleccionado;
    
    public ControladorAddComponente(VistaAddComponente vista)
    {
        this.vista = vista;
        sistema.agregarObservador(this);
    }
    
    public void cargarTipos()
    {
        ArrayList<TipoComponente> tipos = sistema.getTipos();
        if(!tipos.isEmpty()) vista.mostrarTipos(tipos);
    }
    
    public void agregarComponente(String nombre, String valor,float precio,int cantidad)
    {
        if(tipo_seleccionado==null){vista.error("Debe seleccionar un tipo");return;}
        Componente nuevo = new Componente(nombre,valor,0,tipo_seleccionado);
        nuevo.setCantidad(cantidad);
        nuevo.setPrecio(precio);
        try
        {
            Componente c = sistema.agregarComponente(nuevo);
            if(c!=null)
            {
                sistema.avisar(SistemaInventario.eventos.cambioListaComponentes);
            }
        }
        catch(InventarioException e)
        {
            vista.error(e.getMessage());
        }
        
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) 
    {
        vista.limpiar();
    }

    public ArrayList<String> obtenerUnidades() 
    {
        return sistema.getUnidades();
    }

    public void seleccionarTipo(String tipo_string) 
    {
        tipo_seleccionado = sistema.getTipoXNombre(tipo_string);
        vista.configurarVistaXTipo(tipo_seleccionado);
    }

    public void generarNombre(String valor, String unidad) 
    {
        String nombre_out="";
        nombre_out += tipo_seleccionado.getNombre().charAt(0);
        nombre_out += valor;
        nombre_out +=unidad;
        
        vista.actualizarNombre(nombre_out);
    }
}
