package inventario.Controladores;

import inventario.Modelo.Componente;
import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public interface VistaInicio 
{
    public void mostrarComponentes(ArrayList<Componente> componentes);
    public void error(String error);
    public void msg(String msg);
}
