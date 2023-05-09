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
import mx.itson.bancomeco.entidades.Movimiento;

/**
 *
 * @author egarz
 */
public class MovimientoDAO {
    
    public static List<Movimiento> obtener(){
        
        List<Movimiento> movimientos = new ArrayList<>();
        
        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement(); 
            ResultSet rs = statement.executeQuery("SELECT * from movimiento");
            
            while(rs.next()){
                
                Movimiento m = new Movimiento();
                
                m.setId(rs.getInt(1));
                m.setDescripcion(rs.getString(2));
                m.setFecha(rs.getDate(3));
                m.setEstablecimiento(rs.getString(4));
                m.setTipo(rs.getString(5));
                m.setCantidad(rs.getDouble(6));
                m.setTotal(rs.getDouble(7));

                movimientos.add(m);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return movimientos;
    }
    
}
