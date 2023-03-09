/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectotienda.probando;

import com.proyectotienda.probando.datos.conexion;
import com.proyectotienda.probando.model.Usuario;
import java.util.List;


/**
 *
 * @author calin10
 */
public class Probando {

    public static void main(String[] args){
        conexion conectar = new conexion();
        conectar.conectando();
        
        Usuario usuario =new Usuario();
        usuario.setCui(2131314131);
        usuario.setNombres("Mario");
        usuario.setApellidos("Zunil");
        usuario.setDireccion("quiche");
        usuario.setFechanacimiento("2001-05-03");
        
        //conectar.crearUsuario(usuario);
        
        List<Usuario> usuarios = conectar.listaCliente();
        for (Usuario userend : usuarios) {
            System.out.println(userend);
        }
        conectar.desconectar();
    }
    
}
