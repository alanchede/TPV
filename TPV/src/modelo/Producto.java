
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Joselu
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private float pvp;
    private int stock;
    private ImageIcon imagen;

    public Producto(int idProducto, String nombreProducto, float pvp,int stock, ImageIcon imagen) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.pvp = pvp;
        this.stock = stock;
        this.imagen = imagen;
    }
    
    public Producto() {
        this.idProducto = 0;
        this.nombreProducto = "";
        this.pvp = 0.0f;
        this.stock = 0;
        this.imagen = null;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", pvp=" + pvp + ", stock=" + stock + ", imagen=" + imagen + '}';
    }

    
    
    
    
}
