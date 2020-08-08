package Modelo;

public class Cliente {

    private int cedula;
    private String nombre;
    private String apellido;
    private int puntos;

    public Cliente(int cedula, String nombre, String apellido, int puntos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntos = puntos;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
