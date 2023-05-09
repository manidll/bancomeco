/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bancomeco.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author egarz
 */
public class Conexion {
     public static Connection get(){
     Connection conexion = null;
     
     try{
         conexion = DriverManager.getConnection("jdbc:mysql://localhost/bancomecodb?user=root&password=1323");
     }catch (Exception ex){
         System.err.print("Ocurrio un error" + ex.getMessage());
     }
     return conexion;
    }
}
