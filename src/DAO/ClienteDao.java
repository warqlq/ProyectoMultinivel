/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

//import Conexion.ConexionBD;
import Conexion.ConexionBD;
import Model.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author simclub01
 */
public class ClienteDao implements DaoInterfaceCliente{
 
    ConexionBD conexion = ConexionBD.getInstance();
  
    
   /* @Override
    public void actualizar(Cliente cliente) {
        
       
    }
*/
    @Override
    public void crear(Cliente cliente) {
       
        
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("insert into cliente values (?,?,?,?)");
            insertar.setLong(1,cliente.getCedula());
            insertar.setString(2,cliente.getNombre());
            insertar.setString(3,cliente.getCorreoElectronico());
            insertar.setLong(4,cliente.getTelefono());
            insertar.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("error:"+e);
        }
        
        
    }

    @Override
    public void buscar(Cliente cliente) {
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from cliente where cedula= ?");
            buscar.setLong(1, cliente.getCedula());
            ResultSet consulta = buscar.executeQuery();
            
            if(consulta.next()){
              cliente.setCedula(Long.parseLong(consulta.getString("Cedula")));
              cliente.setNombre(consulta.getString("Nombre"));
              cliente.setCorreoElectronico(consulta.getString("correoElectronico"));
              cliente.setTelefono(Long.parseLong(consulta.getString("telefono")));
              JOptionPane.showMessageDialog(null, "Registro encontrado");
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra registrado");
            }
            
            
        }catch(SQLException e){
        
        }
    }

    
    
    /*@Override
    public void eleminar(Cliente cliente) {
     
    }
*/
    
    
    
    
    
   /* @Override
    public ArrayList<Cliente> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    */
}
