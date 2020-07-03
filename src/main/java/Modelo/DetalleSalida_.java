package Modelo;

/**
 *
 * @author santiago
 */
public class DetalleSalida_ {

    private int codigo_salida;
    private int codigo_planta;
    private int cantidad;
    private int costo;
    private int total;

    public DetalleSalida_(int codigo_salida, int codigo_planta, int cantidad, int costo, int total) {
        this.codigo_salida = codigo_salida;
        this.codigo_planta = codigo_planta;
        this.cantidad = cantidad;
        this.costo = costo;
        this.total = total;
    }

    public int getCodigo_salida() {
        return codigo_salida;
    }

    public void setCodigo_salida(int codigo_salida) {
        this.codigo_salida = codigo_salida;
    }

    public int getCodigo_planta() {
        return codigo_planta;
    }

    public void setCodigo_planta(int codigo_planta) {
        this.codigo_planta = codigo_planta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
