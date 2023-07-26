package inventario.Modelo;

/**
 *
 * @author mneter
 */
public class Componente 
{
    private int id;
    private String nombre;
    private String valor;
    private int vmax;
    private int cantidad;
    private float precio;
    private TipoComponente tipo;
    
    public Componente(String nombre, String valor,int vmax, TipoComponente tipo)
    {
        this.nombre=nombre;
        this.valor = valor;
        this.vmax = vmax;
        this.tipo = tipo;
    }
    public void setId(int id){this.id = id;}
    public int getId(){return id;}
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    
    public String getValor() {return valor;}
    public void setValor(String valor) {this.valor = valor;}

    public int getVmax() {return vmax;}
    public void setVmax(int vmax) {this.vmax = vmax;}
    
    public float getPrecio() {return precio;}
    public void setPrecio(float precio) {this.precio = precio;}

    public TipoComponente getTipo() {return tipo;}
    public void setTipo(TipoComponente tipo) {this.tipo = tipo;}

    public void setCantidad(int cantidad){this.cantidad=cantidad;}
    public int getCantidad() {
        return cantidad;
    }

    public boolean contieneNombre(String nombre) 
    {
        return this.nombre.toLowerCase().contains(nombre) || valor.toLowerCase().contains(nombre) || tipo.getNombre().toLowerCase().startsWith(nombre);
    }
    
    
}
