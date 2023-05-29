/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Controller.ControladorCliente;
import DAO.ClienteDao;
import Model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author simclub01
 */
public class BuscarClienteCliente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarCliente
     */
    public BuscarClienteCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Buscar Cliente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTextfield3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonBuscarinventario = new javax.swing.JButton();
        botonVolver7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CC2Textfield1 = new javax.swing.JTextField();
        nombreTextfield5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefonoTextfield6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correoTextfield7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        botonVolver8 = new javax.swing.JButton();

        nombreTextfield3.setBackground(new java.awt.Color(102, 102, 102));
        nombreTextfield3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        nombreTextfield3.setForeground(new java.awt.Color(255, 204, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Video Juegos");

        botonBuscarinventario.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscarinventario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonBuscarinventario.setForeground(new java.awt.Color(255, 204, 0));
        botonBuscarinventario.setText("Buscar");
        botonBuscarinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarinventarioActionPerformed(evt);
            }
        });

        botonVolver7.setBackground(new java.awt.Color(102, 102, 102));
        botonVolver7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonVolver7.setForeground(new java.awt.Color(255, 204, 0));
        botonVolver7.setText("Volver");
        botonVolver7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolver7ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Ingrese CC");

        CC2Textfield1.setBackground(new java.awt.Color(102, 102, 102));
        CC2Textfield1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CC2Textfield1.setForeground(new java.awt.Color(255, 204, 0));

        nombreTextfield5.setBackground(new java.awt.Color(102, 102, 102));
        nombreTextfield5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        nombreTextfield5.setForeground(new java.awt.Color(255, 204, 0));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Nombre");

        telefonoTextfield6.setBackground(new java.awt.Color(102, 102, 102));
        telefonoTextfield6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        telefonoTextfield6.setForeground(new java.awt.Color(255, 204, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Correo");

        correoTextfield7.setBackground(new java.awt.Color(102, 102, 102));
        correoTextfield7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        correoTextfield7.setForeground(new java.awt.Color(255, 204, 0));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Telefono");

        botonVolver8.setBackground(new java.awt.Color(102, 102, 102));
        botonVolver8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonVolver8.setForeground(new java.awt.Color(255, 204, 0));
        botonVolver8.setText("Limpiar");
        botonVolver8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolver8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CC2Textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonBuscarinventario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telefonoTextfield6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(correoTextfield7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonVolver8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVolver7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CC2Textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botonBuscarinventario)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTextfield5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(correoTextfield7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTextfield6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver7)
                    .addComponent(botonVolver8))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolver7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolver7ActionPerformed
       
        Clientes cli =new Clientes();
        cli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolver7ActionPerformed

    private void botonBuscarinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarinventarioActionPerformed
        
        ClienteDao cliente_dao = new ClienteDao();
        Cliente cliente =new Cliente();
       
        if(CC2Textfield1.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Ingrese el numero de cedula");
        
        }else{
         long cc= Long.parseLong(CC2Textfield1.getText()); 
       cliente.setCedula(cc);
        cliente_dao.buscar(cliente);
         
        nombreTextfield5.setText(cliente.getNombre());
        correoTextfield7.setText(cliente.getCorreoElectronico());
        telefonoTextfield6.setText(String.valueOf(cliente.getTelefono()));
        
        }
        
    }//GEN-LAST:event_botonBuscarinventarioActionPerformed

    private void botonVolver8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolver8ActionPerformed
       
        nombreTextfield5.setText("");
         correoTextfield7.setText("");
         telefonoTextfield6.setText("");
         CC2Textfield1.setText("");
    }//GEN-LAST:event_botonVolver8ActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarClienteCliente().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CC2Textfield1;
    public javax.swing.JButton botonBuscarinventario;
    public javax.swing.JButton botonVolver7;
    public javax.swing.JButton botonVolver8;
    public javax.swing.JTextField correoTextfield7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTextfield3;
    public javax.swing.JTextField nombreTextfield5;
    public javax.swing.JTextField telefonoTextfield6;
    // End of variables declaration//GEN-END:variables
}
