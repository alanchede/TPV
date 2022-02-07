
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Joselu
 */
public class Usuarios {
    private ArrayList<Usuario> listadoUsuarios;

    public Usuarios() {
        listadoUsuarios = new ArrayList<Usuario>();
    }
        
    public Usuario get(int pos){
        return listadoUsuarios.get(pos);
    }
    
    public int size(){
        return listadoUsuarios.size();
    }
    
    public void agregarUsuario(Usuario us){
        listadoUsuarios.add(us);
    }
    
    public Usuario buscarUsuario(String nombreUsuario,String apeUsuario){
        Usuario buscado = null;
        for (int i = 0; i < listadoUsuarios.size(); i++) {
            if(listadoUsuarios.get(i).getNombre().equals(nombreUsuario) && 
               listadoUsuarios.get(i).getApellidos().equals(apeUsuario)){
                buscado = listadoUsuarios.get(i);
            }
        }
        return buscado;
    }
    
    public boolean borrarUsuario(Usuario us){
        Usuario buscado;
        boolean res = false;
        buscado = buscarUsuario(us.getNombre(),us.getApellidos());
        if(buscado != null){
            listadoUsuarios.remove(buscado);
            res = true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "listadoUsuarios=" + listadoUsuarios + '}';
    }
}
