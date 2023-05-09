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
import mx.itson.bancomeco.entidades.Usuario;

/**
 *
 * @author egarz
 */
public class UsuarioDAO {
    
    public static List<Usuario> obtener(){
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement(); 
            ResultSet rs = statement.executeQuery("SELECT * from vw_usuario");
            
            while(rs.next()){
                
                Usuario u = new Usuario();
                
                u.setId(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setTelefono(rs.getString(3));
                u.setDireccion(rs.getString(4));
                u.setEdad(rs.getInt(5));
                u.setCorreo(rs.getString(6));
                u.setEstadocivil(rs.getString(7));
                u.setTarjeta(rs.getString(8));

                usuarios.add(u);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return usuarios;
    }
    
}
