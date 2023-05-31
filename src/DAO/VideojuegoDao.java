/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionBD;
import Model.Videojuego;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author simclub01
 */
public class VideojuegoDao implements DaoInterfaceVideojuego {
    ConexionBD conexion = ConexionBD.getInstance();
     ResultSet rs=null;
    @Override
    public void actualizar(Videojuego videojuego) {
        String sql = "update videojuego set cantidad = ?, precio = ? where idVideojuego = ?";
       
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement(sql);
            insertar.setInt(1,videojuego.getCantidad());
            insertar.setInt(2,videojuego.getPrecio());
            insertar.setInt(3,videojuego.getIdVideojuego());
            insertar.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Error al actualizar Videojuego"+e);
        }
        }

    @Override
    public void crear(Videojuego videojuego) {
        String sql="INSERT INTO videojuego(nombre,consola,cantidad,precio) values (?,?,?,?)";
      try{
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement(sql);
            insertar.setString(1,videojuego.getNombre());
            insertar.setString(2,videojuego.getConsola());
            insertar.setInt(3,videojuego.getCantidad());
            insertar.setInt(4,videojuego.getPrecio());
            insertar.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Error al agegar Videojuego"+e);
        }
    }
    @Override
    public void eleminar(int idVideojuego) {
          String sql = "delete from videojuego where idVideojuego = ?";
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement(sql);
             insertar.setString(1, idVideojuego + "");
            insertar.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Error al eliminar Videojuego"+e);
        }
    }

    @Override
    public Videojuego buscar(Videojuego videojuego) {
        Videojuego videojuego1=null;
        String sql = "Select* from videojuego where nombre = ? AND consola = ? ";
         try{
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement(sql);
             insertar.setString(1, videojuego.getNombre()+ "");
             insertar.setString(2, videojuego.getConsola()+ "");
             rs=insertar.executeQuery();
                if (rs.next()){
                videojuego1 = new Videojuego(
                   rs.getInt("idVideojuego"),
                   rs.getString("nombre"),
                   rs.getString("consola"),
                   rs.getInt("cantidad"),
                   rs.getInt("precio"));
            }
            
            rs.close();
            conectar.close();
            
        }catch(SQLException e){
            System.out.println("Error al buscar Videojuego"+e);
        }
        
        return videojuego1;
    }

    @Override
    public ArrayList<Videojuego> buscarTodo() {
        ArrayList<Videojuego> lista = new ArrayList<>();
         String sql = "Select* from videojuego ";
       try {
           
           Connection conectar = conexion.conectar();
           PreparedStatement insertar = conectar.prepareStatement(sql);
            ResultSet resultSet;
            rs = insertar.executeQuery(sql);
        
            while (rs.next()) {
                 Videojuego videojuego = new Videojuego(
                   rs.getInt("idVideojuego"),
                   rs.getString("nombre"),
                   rs.getString("consola"),
                   rs.getInt("cantidad"),
                   rs.getInt("precio"));
                lista.add(videojuego);
            }
            
            rs.close();
            conectar.close();
    
          
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        return lista;
    }
    
}
