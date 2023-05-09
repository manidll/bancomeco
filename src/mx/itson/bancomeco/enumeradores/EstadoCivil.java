/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bancomeco.enumeradores;

/**
 *
 * @author egarz
 */
public enum EstadoCivil {
    SOLTERO(1),
    CASADO(2);
   
    
    private int numero;
    EstadoCivil(int numero ){
        this.numero = numero;
    }
}
