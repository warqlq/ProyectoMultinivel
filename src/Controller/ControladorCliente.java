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
    }
   
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vistacliente.RefrescarBTN){
            JOptionPane.showMessageDialog(null, "PRUEBA PRUEBA");
            mostrarTabla1(vistacliente.tablaClientes);
            vistacliente.RefrescarBTN.setEnabled(false);
        }
        if(e.getSource()==vistacrear.botonAgregarcliente){
            crear();
        }
         if(e.getSource()==vistabuscar.botonBuscarinventario){       
             buscar();
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
