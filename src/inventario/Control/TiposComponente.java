/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.Control;

import inventario.Modelo.IRepositorio;
import inventario.Modelo.InventarioException;
import inventario.Modelo.TipoComponente;
import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public class TiposComponente implements IRepositorio<TipoComponente>
{
    ArrayList<TipoComponente> tipos = new ArrayList<>();
    @Override
    public TipoComponente Alta(TipoComponente tc) throws InventarioException
    {
        TipoComponente tipo = BuscarXNombre(tc.getNombre());
        if(tipo!=null) throw new InventarioException("Ya existe un tipo con ese nombre");
        if(tipos.add(tc)) return tc;
        else{throw new InventarioException("Error en el alta.");}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Baja(int id) throws InventarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modifica(TipoComponente t) throws InventarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoComponente Buscar(int id) 
    {
    
        for(TipoComponente t : tipos)
        {
            if(t.getId()==id) return t;
        }
        return null;
    }
    
    @Override
    public TipoComponente BuscarXNombre(String nombre) 
    {
        for(TipoComponente t : tipos)
        {
            if(nombre.equals(t.getNombre())) return t;
        }
        return null;
    }

    @Override
    public ArrayList<TipoComponente> TraerTodo() 
    {
        return tipos;
    }
{
    
}}
