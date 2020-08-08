package Modelo;

public class Detalle_factura {

    int cedula_cliente;
    int codigo_factura;

    public Detalle_factura(int cedula_cliente, int codigo_factura) {
        this.cedula_cliente = cedula_cliente;
        this.codigo_factura = codigo_factura;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

}
