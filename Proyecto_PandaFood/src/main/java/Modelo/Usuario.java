/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author santiago
 */
public class Usuario {
    
    private String nom_usuario;
    private String contraseña;

    public Usuario(String nom_usuario, String contraseña) {
        this.nom_usuario = nom_usuario;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }
    
    
    
    
}
