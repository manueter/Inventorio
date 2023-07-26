package inventario.Inicio;

import inventario.Modelo.Componente;
import inventario.Modelo.InventarioException;
import inventario.Modelo.SistemaInventario;
import inventario.Modelo.TipoComponente;

/**
 *
 * @author mneter
 */
public class Precarga 
{
    static SistemaInventario fachada = SistemaInventario.getInstancia();
    public static void cargarTipos()
    {
        TipoComponente resistencia = new TipoComponente("Resistencia");
        TipoComponente capacitor = new TipoComponente("Capacitor");
        TipoComponente diodo = new TipoComponente("Diodo");
        TipoComponente transistor = new TipoComponente("Transistor");
        TipoComponente led = new TipoComponente("Led");
        TipoComponente ic = new TipoComponente("IC");
        TipoComponente potenciometro = new TipoComponente("Potenciometro");
        TipoComponente pushbutton = new TipoComponente("PushButton");        
        TipoComponente cable = new TipoComponente("Cable");
        TipoComponente otro = new TipoComponente("Otro");
        
        Componente resist1 = new Componente("R10K","10K",0,resistencia);
        Componente resist2 = new Componente("R1K","1K",0,resistencia);
        Componente resist3 = new Componente("R100K","100K",0,resistencia);
        Componente resist4 = new Componente("R20K","20K",0,resistencia);
        
        resist1.setPrecio(6);
        resist2.setPrecio(6);
        resist3.setPrecio(6);
        resist4.setPrecio(6);
        
        resist1.setCantidad(5);resist2.setCantidad(5);
        resist4.setCantidad(5);resist3.setCantidad(5);
        
        Componente cap1 = new Componente("C10","10",0,capacitor);
        Componente cap2 = new Componente("C1","1",0,capacitor);
        Componente cap3 = new Componente("C4,7","4,7",0,capacitor);
        Componente cap4 = new Componente("C100","100",0,capacitor);
        
        cap1.setCantidad(5);cap2.setCantidad(6);
        cap3.setCantidad(3);cap4.setCantidad(7);
        cap1.setPrecio(10);cap2.setPrecio(15);
        cap3.setPrecio(10);cap4.setPrecio(15);
        
        Componente ic2 = new Componente("NE555","",0,ic);
        Componente ic3 = new Componente("CD40106","",0,ic);
        Componente ic1 = new Componente("LM385","",0,ic);
        
        ic2.setPrecio(5);ic1.setPrecio(20);
        ic2.setCantidad(5);ic1.setCantidad(15);
        ic3.setCantidad(25);ic3.setPrecio(105);
        
        Componente pot2 = new Componente("P10K","10K",0,potenciometro);
        Componente pot3 = new Componente("P50K","50K",0,potenciometro);
        Componente pot1 = new Componente("P1K","1K",0,potenciometro);
        Componente pot4 = new Componente("P100K","100K",0,potenciometro);
        Componente pot5 = new Componente("P500K","500K",0,potenciometro);
        Componente pot6 = new Componente("P1M","1M",0,potenciometro);
        
        pot2.setCantidad(7);pot2.setPrecio(85);
        pot3.setCantidad(5);pot3.setPrecio(85);
        pot1.setCantidad(5);pot1.setPrecio(70);
        pot4.setCantidad(2);pot4.setPrecio(70);
        pot5.setCantidad(1);pot5.setPrecio(100);
        pot6.setCantidad(1);pot6.setPrecio(100);
        try
        {
            fachada.agregarTipo(resistencia);
            fachada.agregarTipo(capacitor);
            fachada.agregarTipo(diodo);
            fachada.agregarTipo(transistor);
            fachada.agregarTipo(led);
            fachada.agregarTipo(ic);
            fachada.agregarTipo(potenciometro);
            fachada.agregarTipo(pushbutton);
            fachada.agregarTipo(cable);
            fachada.agregarTipo(otro);
        
            fachada.agregarComponente(resist1);
            fachada.agregarComponente(resist2);
            fachada.agregarComponente(resist3);
            fachada.agregarComponente(resist4);        
            fachada.agregarComponente(cap1);
            fachada.agregarComponente(cap2);
            fachada.agregarComponente(cap3);
            fachada.agregarComponente(cap4);
            
            fachada.agregarComponente(ic1);
            fachada.agregarComponente(ic2);
            fachada.agregarComponente(ic3);
            
            fachada.agregarComponente(pot1);
            fachada.agregarComponente(pot2);
            fachada.agregarComponente(pot3);
            fachada.agregarComponente(pot4);
            fachada.agregarComponente(pot5);
            fachada.agregarComponente(pot6);
            
            fachada.agregarComponente(ic2);
            fachada.agregarComponente(ic3);
        }
        catch(InventarioException e){System.out.println(e.getMessage());}
        
    }
    
}
