/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDao;
import DAO.VentaDao;
import DAO.VideojuegoDao;
import Model.Cliente;
import Model.Videojuego;
import Visual.Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author simclub01
 */
public class ControladorVenta implements ActionListener  {
    ClienteDao daoCli=new ClienteDao();
    Cliente cli= new Cliente();
    Videojuego videojuego1=null;
    Videojuego videojuego2;
    Videojuego videojuego;
    VideojuegoDao daoVid= new VideojuegoDao();
    VentaDao daoVen= new VentaDao();
    Venta vistaVenta=new Venta();
    
     public ControladorVenta(Venta v){
        
        this.vistaVenta=v;
        this.vistaVenta.buscarB.addActionListener(this);
        this.vistaVenta.generarB.addActionListener(this);

    }
    public void generarVenta(){
        
        
        daoVen.crear(videojuego1, cli);
        daoVid.actualizarCantidad(videojuego2);
    }
     
    public void validarVenta(){
        if(vistaVenta.nombretxt.getText().equals("") || vistaVenta.cantidadtxt.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Ingrese datos validos");
        }
        else if(Integer.valueOf(vistaVenta.cantidadtxt.getText())<=0){
             JOptionPane.showMessageDialog(null, "Ingrese cantidad valida");
        }else{
            String nombre=vistaVenta.nombretxt.getText();
            String consola=(String) vistaVenta.consolatxt.getSelectedItem();
            videojuego= new Videojuego(nombre,consola);
            videojuego1=daoVid.buscar(videojuego);
            if(videojuego1==null){
                JOptionPane.showMessageDialog(null, "Videojuego no encontrada");
            }
            else if(videojuego1.getCantidad()<Integer.valueOf(vistaVenta.cantidadtxt.getText())){
                JOptionPane.showMessageDialog(null, "No hay suficiente cantidad disponible");
            }
            else{
                int nuevaCantidad=videojuego1.getCantidad()-Integer.valueOf(vistaVenta.cantidadtxt.getText());
                videojuego2= new Videojuego(videojuego1.getNombre(),videojuego1.getConsola(),nuevaCantidad);
                generarVenta();
            }
        }
            
        
    }
    
    
     public void buscar(){
    
  
        if(vistaVenta.cctxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el numero de cedula");
        
        }else{
         long cc= Long.parseLong(vistaVenta.cctxt.getText()); 
        cli.setCedula(cc);
        daoCli.buscar(cli);
        vistaVenta.cctxt.setText(String.valueOf(cli.getCedula()));
       
        vistaVenta.cctxt.setEditable(false);
       
        
        }
    }
     
     
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vistaVenta.buscarB){
            buscar(); 
        }
        if(e.getSource()==vistaVenta.generarB){
            validarVenta(); 
        }
    }
    
    
    
    
}
