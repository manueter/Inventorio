package inventario.Controladores;

import inventario.Modelo.TipoComponente;
import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public interface VistaAddComponente 
{
    public void mostrarTipos(ArrayList<TipoComponente> tipos);
    public void mostrarUnidades(ArrayList<String> unidades);
    public void configurarVistaXTipo(TipoComponente tipo);
    public void actualizarNombre(String nombre);
    public void error(String msg);
    public void limpiar();
    
}
