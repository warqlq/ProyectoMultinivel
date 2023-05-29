/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.ClienteDao;
import Model.Cliente;
import Visual.BuscarClienteCliente;
import Visual.CrearCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ControladorCliente implements ActionListener{

    ClienteDao dao=new ClienteDao();
    Cliente cli= new Cliente();
    CrearCliente vistacrear= new CrearCliente();
    BuscarClienteCliente vistabuscar = new BuscarClienteCliente();

    public ControladorCliente(CrearCliente v) {
        this.vistacrear = v;
        this.vistacrear.botonAgregarcliente.addActionListener(this);
    }
   
   public ControladorCliente(BuscarClienteCliente b) {
        this.vistabuscar = b;
        this.vistabuscar.botonBuscarinventario.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vistacrear.botonAgregarcliente){
            crear();
        }
    }
    
    public void crear(){
        
        String nombre=vistacrear.nombreTextfield.getText();
        long cc=Long.parseLong(vistacrear.CCTextfield1.getText());
        long telefono=Long.parseLong(vistacrear.telefonoTextfield2.getText());
        String correo=vistacrear.correoTextfield3.getText();
        
        cli.setCedula(cc);
        cli.setNombre(nombre);
        cli.setTelefono(telefono);
        cli.setCorreoElectronico(correo);
        dao.crear(cli);
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        
        vistacrear.nombreTextfield.setText("");
       vistacrear.CCTextfield1.setText("");
        vistacrear.telefonoTextfield2.setText("");
        vistacrear.correoTextfield3.setText("");
            
    }
    
    public void buscar(){
    
         //ClienteDao cliente_dao = new ClienteDao();
        //Cliente cliente =new Cliente();
        
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

}
