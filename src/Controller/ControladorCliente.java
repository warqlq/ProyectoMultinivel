/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.ClienteDao;
import Model.Cliente;
import Visual.BuscarClienteCliente;
import Visual.Clientes;
import Visual.CrearCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class ControladorCliente implements ActionListener{

    ClienteDao dao=new ClienteDao();
    Cliente cli= new Cliente();
    CrearCliente vistacrear= new CrearCliente();
    BuscarClienteCliente vistabuscar = new BuscarClienteCliente();
    Clientes vistacliente = new Clientes();
    DefaultTableModel modelo2=new DefaultTableModel();

    public ControladorCliente(CrearCliente v) {
        this.vistacrear = v;
        this.vistacrear.botonAgregarcliente.addActionListener(this);
        
    }
   
   public ControladorCliente(BuscarClienteCliente b) {
        this.vistabuscar = b;
        this.vistabuscar.botonBuscarinventario.addActionListener(this);
    }
    
    public ControladorCliente(Clientes b) {
        this.vistacliente = b;
        this.vistacliente.RefrescarBTN.addActionListener(this);
        this.vistacliente.EliminarBTN.addActionListener(this);
        this.vistacliente.botonDescargarreporte.addActionListener(this);
        mostrarTabla1(vistacliente.tablaClientes);
    }
   
    public void limpiarTabla(){
        for(int i=0;i<vistacliente.tablaClientes.getRowCount();i++){
            modelo2.removeRow(i);
            i=i-1;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vistacliente.RefrescarBTN){
            //JOptionPane.showMessageDialog(null, "PRUEBA PRUEBA");
            limpiarTabla();
            mostrarTabla1(vistacliente.tablaClientes);
           
        }
        if(e.getSource()==vistacrear.botonAgregarcliente){
            crear();
        }
         if(e.getSource()==vistabuscar.botonBuscarinventario){       
             buscar();
        }
         
         if(e.getSource()==vistacliente.EliminarBTN){       
             
             eliminar();
             limpiarTabla();
             mostrarTabla1(vistacliente.tablaClientes);
        }
         
          if(e.getSource()==vistacliente.botonDescargarreporte){       
              
             
              JOptionPane.showMessageDialog(null, "PRUEBA PRUEBA");
              descargarCSV();
              
             
        }
          
        
    }
    
    
    /*
    
    public void GenerarCSV(int id,String fecha,String hora,String tipoGasolina,float galones,int precioTotal,String nombreArchivo){
        String[] datos = {String.valueOf(id),fecha,hora,tipoGasolina, String.valueOf(galones),String.valueOf(precioTotal)};
          Path path = Paths.get(nombreArchivo);
 
        boolean archivoExiste = Files.exists(path);
        
        try {
            
            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            if (!archivoExiste) {
                // Escribir el encabezado en el archivo si se está creando uno nuevo
                //fileWriter.append("Id,Nombre Mascota ,Especie,Nombre Dueño,Descripción,Diagnostico\n");
            }
           
            fileWriter.append(String.join(",", datos));
            fileWriter.append("\n");
            fileWriter.flush();
            fileWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        
    }
    */
    
    public void descargarCSV(){
    
        ArrayList<Cliente>lista3=dao.MostrarTodo();
      
       // String pru=lista3.toString();
        
       
        
    try {
            try ( BufferedWriter escribir = new BufferedWriter(new FileWriter("ReporteClientes.csv", true))) {
                
                 String[] datos =new String[vistacliente.tablaClientes.getColumnCount()];
                 
                String texto = vistacliente.tablaClientes.getValueAt(0,0).toString()+vistacliente.tablaClientes.getValueAt(0,1).toString();
                escribir.write(texto);
                escribir.newLine();
                escribir.close();
                JOptionPane.showMessageDialog(null, "Registro exitoso del csv.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar los datos del csv.");
        }
    
    
    }
    
    
    
    
    
    public void eliminar(){
        
        int fila=vistacliente.tablaClientes.getSelectedRow();
              
             if(fila==-1){
                 JOptionPane.showMessageDialog(null, "Seleccione un cliente");
             }else{
                 long cc= Long.parseLong((String)vistacliente.tablaClientes.getValueAt(fila,0).toString());
                 dao.eliminar(cc);
                 JOptionPane.showMessageDialog(null, "Usuario eliminado");
             }
    
    
    }
    
    
    public void crear(){
        
         if(vistacrear.nombreTextfield.getText().equals("") || vistacrear.CCTextfield1.getText().equals("") 
                 || vistacrear.telefonoTextfield2.getText().equals("") || vistacrear.correoTextfield3.getText().equals("") ){
            
             JOptionPane.showMessageDialog(null, "Campos sin completar");
                   
         }else{
            String nombre=vistacrear.nombreTextfield.getText();
           long cc=Long.parseLong(vistacrear.CCTextfield1.getText());
           long telefono=Long.parseLong(vistacrear.telefonoTextfield2.getText());
           String correo=vistacrear.correoTextfield3.getText();

           cli.setCedula(cc);
           cli.setNombre(nombre);
           cli.setTelefono(telefono);
           cli.setCorreoElectronico(correo);
           dao.crear(cli);



           vistacrear.nombreTextfield.setText("");
          vistacrear.CCTextfield1.setText("");
           vistacrear.telefonoTextfield2.setText("");
           vistacrear.correoTextfield3.setText("");
         
         }
        
        
            
    }
    
    public void buscar(){
    
        
        if(vistabuscar.CC2Textfield1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el numero de cedula");
        
        }else{
         long cc= Long.parseLong(vistabuscar.CC2Textfield1.getText()); 
        cli.setCedula(cc);
        dao.buscar(cli);
        
        vistabuscar.nombreTextfield5.setText(cli.getNombre());
        vistabuscar.correoTextfield7.setText(cli.getCorreoElectronico());
        vistabuscar.telefonoTextfield6.setText(String.valueOf(cli.getTelefono()));
    
    }
    
}
    
     public void mostrarTabla1(JTable tabla) {
        modelo2=(DefaultTableModel)tabla.getModel();
        ArrayList<Cliente>lista=dao.MostrarTodo();
        Object[]object= new Object[4];
        for(int i=0;i<lista.size();i++){
            object[0]=lista.get(i).getCedula();
            object[1]=lista.get(i).getNombre();
            object[2]=lista.get(i).getTelefono();
            object[3]=lista.get(i).getCorreoElectronico();
            modelo2.addRow(object);
        }
        vistacliente.tablaClientes.setModel(modelo2);
    }
    
  

}
