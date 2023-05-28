/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Model.Cliente;
import java.util.ArrayList;


public interface DaoInterface {
    public void actualizar(Cliente cliente);
    public void crear(Cliente cliente);
    public void eleminar(int id);
    public Cliente buscar(int id);
    public ArrayList<Cliente> findAll();
}