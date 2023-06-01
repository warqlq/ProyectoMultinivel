/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;


import Model.Videojuego;
import java.util.ArrayList;

/**
 *
 * @author simclub01
 */
public interface DaoInterfaceVideojuego {
    public void actualizar(Videojuego videojuego);
    public void actualizarCantidad(Videojuego videojuego);
    public void crear(Videojuego videojuego);
    public void eleminar(int idVideojuego);
    public Videojuego buscar(Videojuego videojuego);
   // public int disponibilidad(Videojuego videojuego);
    public ArrayList<Videojuego> buscarTodo();
}
