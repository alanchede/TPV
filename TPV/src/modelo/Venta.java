/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Joselu
 */
public class Venta {
    private int idVenta;
    private Usuario vendedor;
    private int cantidad;
    private Date fechaVenta;
    private Producto producto;

    public Venta(int idVenta, Usuario vendedor, int cantidad, Date fechaVenta, Producto producto) {
        this.idVenta = idVenta;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
        this.producto = producto;
    }
    
    public Venta() {
        this.idVenta = 0;
        this.vendedor = new Usuario();
        this.cantidad = 0;
        this.fechaVenta = null;
        this.producto = new Producto();
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    } 

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", vendedor=" + vendedor + ", cantidad=" + cantidad + ", fechaVenta=" + fechaVenta + ", producto=" + producto + '}';
    }
    
    
}
