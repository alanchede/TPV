package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Joselu
 */
public class GestionTPV {

    private String usuario;
    private String password;
    private String host;
    private String db;
    private Connection conexion;

    public GestionTPV(String usuario, String password, String host, String db, Connection conexion) {
        this.usuario = usuario;
        this.password = password;
        this.host = host;
        this.db = db;
        this.conexion = conexion;
    }

    //MÉTODOS PRODUCTO 
    /**
     * Método para insertar Producto 
     * @param prod
     * @return boolean
     */
    public boolean insertarProducto(Producto prod) {
        boolean res = false;
        conectar();

        try {
            Statement sentencia = conexion.createStatement();
            String sql = String.format("INSERT INTO productos (ID_Producto,Nombre_Producto,PVP,Stock,Imagen) VALUES(%s, '%s',%s,%s,NULL)",
                    prod.getIdProducto(),
                    prod.getNombreProducto(),
                    prod.getPvp(),
                    prod.getStock(),
                    prod.getImagen());
            res = sentencia.execute(sql);
            sentencia.close();
            desconectar();
        } catch (SQLException ex) {
            ex.toString();
            ex.getMessage();
        }
        return res;
    }
    /**
     *  Método para borrar Productos
     * @param prod
     * @return boolean
     */
     public boolean borrarProducto(Producto prod){
        boolean res = false;
        conectar();
        try { 
            Statement sentencia = conexion.createStatement();
            String sql = String.format("DELETE FROM productos WHERE idProducto = %s", 
                    prod.getIdProducto());
            
            res = sentencia.execute(sql);
            sentencia.close();
            desconectar();
        } catch (SQLException e) {
            e.getMessage();
        }
        return res;
    }
    
     public boolean modificarProducto(Producto prod,Producto nuevoProd){
        boolean res = false;
        conectar();
        try {
            Statement sentencia = conexion.createStatement();
            String sql = String.format("UPDATE productos SET ID_Producto = %s, "
                                        + "Nombre_Producto = '%s', "
                                        + "PVP = %s, "
                                        + "Stock = %s, "
                                        + "Imagen = NULL "
                                        + "WHERE ID_Producto = %s ;",
                                        nuevoProd.getIdProducto(), 
                                        nuevoProd.getNombreProducto(), 
                                        nuevoProd.getPvp(), 
                                        nuevoProd.getStock(), 
                                        nuevoProd.getImagen(),
                                        prod.getIdProducto());

            res = sentencia.execute(sql);
            sentencia.close(); 
            desconectar();
        } catch (SQLException e) {
            e.getMessage();
        }
        return res;
    }

    // METODOS USUARIO
    boolean validarPint(int n) {
        return false;
    }

    void insertarUsuario(Usuario u) {

    }

    void modificarUsuario(Usuario u) {

    }

    //CRUD Productos
    //CRUD Ventas
    /**
     * Método para realizar la conexión a la BD
     */
    private void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, usuario, password);
        } catch (ClassNotFoundException cnf) {
            System.out.println("Error al cargar el driver MySQL");
        } catch (SQLException ex) {
            System.out.println("Error de conexion");
        }

    }

    /**
     * Método para desconectar la conexción
     */
    private void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            ex.toString();
        }
    }

}
