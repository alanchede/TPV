
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Joselu
 */
public class Productos {
    private ArrayList<Producto> listadoProductos;

    public Productos() {
        listadoProductos = new ArrayList<Producto>();
    }
    
    public Producto get(int pos){
        return listadoProductos.get(pos);
    }
    
    public int size(){
        return listadoProductos.size();
    }
    
    public void agregarProducto(Producto prod){
        listadoProductos.add(prod);
    }
    
    public Producto buscarProducto(int idProducto){
        Producto buscado = null;
        for (int i = 0; i < listadoProductos.size(); i++) {
            if(listadoProductos.get(i).getIdProducto() == idProducto ){
                buscado = listadoProductos.get(i);
            }
        }
        return buscado;
    }
    
    public boolean borrarEmpleado(Producto prod){
        Producto buscado;
        boolean res = false;
        buscado = buscarProducto(prod.getIdProducto());
        if(buscado != null){
            listadoProductos.remove(buscado);
            res = true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Productos{" + "listadoProductos=" + listadoProductos + '}';
    }
    
    
}
