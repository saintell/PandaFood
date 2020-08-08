package Modelo;

public class Cliente {

    private int cedula;
    private String nombre;
    private String apellido;
    private int puntos;
    private int codigo_factura;

    public Cliente(int cedula, String nombre, String apellido, int puntos, int codigo_factura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntos = puntos;
        this.codigo_factura = codigo_factura;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCodigo_factura() {
        return codigo_factura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCodigo_factura(int codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
