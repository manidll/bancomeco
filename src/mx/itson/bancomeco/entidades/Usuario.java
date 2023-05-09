/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bancomeco.entidades;


/**
 *
 * @author egarz
 */
public class Usuario {

    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private int edad;
    private String correo;
    private String estadocivil;
    private String tarjeta;
    
    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    /**
     * @return the estadocivil
     */
    public String getEstadocivil() {
        return estadocivil;
    }

    /**
     * @param estadocivil the estadocivil to set
     */
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
