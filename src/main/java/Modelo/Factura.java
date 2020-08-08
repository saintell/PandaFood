/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author santiago
 */
public class Factura {
    
    private int codigo_factura;
    private Date fecha;
    private int precio_total;
    private int cedula_cliente;

    public Factura(int codigo_factura, Date fecha, int precio_total, int cedula_cliente) {
        this.codigo_factura = codigo_factura;
        this.fecha = fecha;
        this.precio_total = precio_total;
        this.cedula_cliente = cedula_cliente;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }
    
    
    
    
}
