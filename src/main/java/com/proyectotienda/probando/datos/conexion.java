/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectotienda.probando.datos;
import com.proyectotienda.probando.model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author calin10
 */
public class conexion {

    private Connection conexion = null;
    
    private final String url = "jdbc:mysql://localhost:3306/punto_venta";
    
    private final String user = "newuser";

    private final String password = "password";
    
    public void conectando(){
        try {
           conexion = DriverManager.getConnection(url, user, password);
           System.out.println("Coneccion establecida");
        } catch (SQLException ex) {
           System.out.println(ex);
           System.out.println("Error al conectar a la base de datos");
        }
    }
    
    public void crearUsuario(Usuario usuario){
        String query = "INSERT INTO CLIENTE(cui, nombres, apellidos, direccion, fecha_nacimiento) VALUES(?,?,?,?,?)";
        try (var preparedstatement = conexion.prepareStatement(query)){
            preparedstatement.setInt(1, usuario.getCui());
            preparedstatement.setString(2, usuario.getNombres());
            preparedstatement.setString(3, usuario.getApellidos());
            preparedstatement.setString(4, usuario.getDireccion());
            preparedstatement.setString(5, usuario.getFechanacimiento());
            preparedstatement.executeUpdate();
            System.out.println("Usuario insertado");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public List<Usuario> listaCliente(){
        String query = "SELECT * FROM CLIENTE";
        List<Usuario> usuarios = new ArrayList<>();
        
        try (var statement = conexion.createStatement();
            var resultset = statement.executeQuery(query);) {
            
            
            while (resultset.next()) {
                Usuario userend = new Usuario(
                        resultset.getInt("cui"),
                        resultset.getString("nombres"),
                        resultset.getString("apellidos"),
                        resultset.getString("direccion"),
                        resultset.getString("fecha_nacimiento")
                );
                usuarios.add(userend);
            }
            statement.close();
            resultset.close();
                    
        } catch (SQLException ex) {
            System.out.println("Error al realizar consulta");
        }
        return usuarios;
    }
    
    public void desconectar(){
        if(conexion != null){
            try {
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("No de logro desconectar la base de datos");
            }
        }
    }
    
}
