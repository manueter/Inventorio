package inventario.Inicio;

import inventario.Interfaz.Inicio;

/**
 *
 * @author mneter
 */
public class Inventario {

    public static void main(String[] args) 
    {
        Precarga.cargarTipos();
        new Inicio().setVisible(true);
    }
    
}
