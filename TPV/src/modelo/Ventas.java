
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Joselu
 */
public class Ventas {
    private ArrayList<Venta> listadoVentas;

    public Ventas() {
        listadoVentas = new ArrayList<Venta>();
    }
    
    public Venta get(int pos){
        return listadoVentas.get(pos);
    }
    
    public int size(){
        return listadoVentas.size();
    }
    
    public void agregarVenta(Venta venta){
        listadoVentas.add(venta);
    }
    
    public Venta buscarVenta(int idVenta){
        Venta buscado = null;
        for (int i = 0; i < listadoVentas.size(); i++) {
            if(listadoVentas.get(i).getIdVenta()== idVenta ){
                buscado = listadoVentas.get(i);
            }
        }
        return buscado;
    }
    
    public boolean borrarVenta(Venta venta){
        Venta buscado;
        boolean res = false;
        buscado = buscarVenta(venta.getIdVenta());
        if(buscado != null){
            listadoVentas.remove(buscado);
            res = true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Ventas{" + "listadoVentas=" + listadoVentas + '}';
    }
}
