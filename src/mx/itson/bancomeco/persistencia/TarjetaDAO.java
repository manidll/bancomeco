/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bancomeco.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.bancomeco.entidades.Tarjeta;

/**
 *
 * @author egarz
 */
public class TarjetaDAO {
    
    public static List<Tarjeta> obtener(){
        
        List<Tarjeta> tarjetas = new ArrayList<>();
        
        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement(); 
            ResultSet rs = statement.executeQuery("SELECT * from vw_tarjeta");
            
            while(rs.next()){
                
                Tarjeta t = new Tarjeta();
                
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setNumero(rs.getString(3));

                tarjetas.add(t);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return tarjetas;
    }
    
}
