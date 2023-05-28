/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author simclub01
 */
public class ClienteDao implements DaoInterface{

    @Override
    public void actualizar(Cliente cliente) {
        
    }

    @Override
    public void crear(Cliente cliente) {
       
    }

    @Override
    public void eleminar(int id) {
     
    }

    @Override
    public Cliente buscar(int id) {
        Cliente cliente = null;
     return cliente; 
    }

    @Override
    public ArrayList<Cliente> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
