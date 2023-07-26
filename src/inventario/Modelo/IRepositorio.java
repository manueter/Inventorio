package inventario.Modelo;
import java.util.List;

/**
 *
 * @author mneter
 */
public interface IRepositorio <T>
{
    T Alta(T t) throws InventarioException;
    boolean Baja(int id) throws InventarioException;
    boolean Modifica(T t) throws InventarioException;
    T Buscar(int id);
    T BuscarXNombre(String nombre);
    List<T> TraerTodo();
}