/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.VideojuegoDao;
import Model.Videojuego;
import Visual.ActualizarVideojuego;
import Visual.AgregarInventario;
import Visual.BuscarInventario;
import Visual.Inventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author simclub01
 */
public class ControladorVideojuego implements ActionListener {
    Videojuego videojuego1=null;
    Videojuego videojuego;
    VideojuegoDao dao= new VideojuegoDao();
    Inventario vistaInventario=new Inventario();
    DefaultTableModel modelo=new DefaultTableModel();
    AgregarInventario vistaAgregar=new AgregarInventario();
    BuscarInventario vistaBuscar=new BuscarInventario();
    ActualizarVideojuego vistaActualizar=new ActualizarVideojuego(0);
    
    public ControladorVideojuego(Inventario v){
        
        this.vistaInventario=v;
        this.vistaInventario.botonEliminar.addActionListener(this);
        mostrarTabla(vistaInventario.tablaInventario);
    }
    
    public ControladorVideojuego(AgregarInventario v){
        
        this.vistaAgregar=v;
        this.vistaAgregar.bAgregar.addActionListener(this);
    }
    
    public ControladorVideojuego(BuscarInventario v){
        
        this.vistaBuscar=v;
        this.vistaBuscar.buscarb.addActionListener(this);
        this.vistaBuscar.bActualizar.addActionListener(this);
    }
    
    public ControladorVideojuego(ActualizarVideojuego v){
        
        this.vistaActualizar=v;
        this.vistaActualizar.actualizarb.addActionListener(this);
        
    }
    
    
    public void eliminar(){
        int fila=vistaInventario.tablaInventario.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar el videojuego que quiere eliminar");
        }else{
          int id=Integer.parseInt((String)vistaInventario.tablaInventario.getValueAt(fila, 0).toString());
          int respuesta= JOptionPane.showConfirmDialog(null, "¿Esta seguro de elimiar el videojuego?", "Eliminar", JOptionPane.YES_NO_OPTION);
              if(respuesta==JOptionPane.YES_OPTION){
                  dao.eleminar(id);
                  JOptionPane.showMessageDialog(null, "Se elimino el videojuego seleccionado");
                }  
        }
      
  
        
    }
    
    public void limpiarTabla(){
        for(int i=0;i<vistaInventario.tablaInventario.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }  
    public void mostrarTabla(JTable tabla) {
        modelo=(DefaultTableModel)tabla.getModel();
        ArrayList<Videojuego>lista=dao.buscarTodo();
        Object[]object= new Object[5];
        for(int i=0;i<lista.size();i++){
            object[0]=lista.get(i).getIdVideojuego();
            object[1]=lista.get(i).getConsola();
            object[2]=lista.get(i).getNombre();
            object[3]=lista.get(i).getCantidad();
            object[4]=lista.get(i).getPrecio();
            modelo.addRow(object);
        }
        vistaInventario.tablaInventario.setModel(modelo);
    }
    public void agregar(){
        String nombre=vistaAgregar.nombretxt.getText();
        String consola=(String) vistaAgregar.consolatxt.getSelectedItem();
        int cantidad=Integer.valueOf(vistaAgregar.cantidadtxt.getText());
        int precio=Integer.valueOf(vistaAgregar.preciotxt.getText());
   
        
        Videojuego videojuego = new Videojuego(nombre,consola,cantidad,precio);
                   
                  
        dao.crear(videojuego);
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        
        vistaAgregar.nombretxt.setText("");
        vistaAgregar.cantidadtxt.setText("");
        vistaAgregar.preciotxt.setText("");
        
    }
    
     public void buscar(){
        
        String nombre=vistaBuscar.nombretxt.getText();
        String consola=(String) vistaBuscar.consolatxt.getSelectedItem();
        
        if(vistaBuscar.nombretxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del video juego");
        
        }else{
   
        
        Videojuego videojuego = new Videojuego(nombre,consola);
                   
                  
        videojuego1=dao.buscar(videojuego);
        
       
        if(videojuego1==null){
           JOptionPane.showMessageDialog(null, "No se encontro ninguno videojuego");
        }else {
            
        vistaBuscar.videojuegotxt.setText(
        videojuego1.getNombre()+" "+ videojuego1.getConsola()+
                " "+ videojuego1.getPrecio()+
                " "+videojuego1.getCantidad()
        
        );
        vistaBuscar.idtxt.setText(String.valueOf(videojuego1.getIdVideojuego()));
        }
       
    }
        
        vistaBuscar.nombretxt.setText("");
        
    }
     
     public void actualizar(){
         
         int cantidad=Integer.valueOf(vistaActualizar.cantidadtxt.getText());
        int precio=Integer.valueOf(vistaActualizar.preciotxt.getText());
         Videojuego videojuego2 = new Videojuego(vistaActualizar.id,cantidad,precio);
        dao.actualizar(videojuego2);
        JOptionPane.showMessageDialog(null, "Se actualizo el videojuego");
     }
     
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vistaInventario.botonEliminar){
           eliminar();
           limpiarTabla();
           mostrarTabla(vistaInventario.tablaInventario);
        }
        if(e.getSource()==vistaAgregar.bAgregar){
            agregar();
        }
        if(e.getSource()==vistaBuscar.buscarb){
            buscar();
        }
        if(e.getSource()==vistaActualizar.actualizarb){
            actualizar();
        }
        
        
    }
}
