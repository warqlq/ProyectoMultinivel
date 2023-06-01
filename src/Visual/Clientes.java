/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Controller.ControladorCliente;

/**
 *
 * @author simclub01
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Clientes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonBuscarinventario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        botonBuscarcliente = new javax.swing.JButton();
        botonDescargarreporte = new javax.swing.JButton();
        botonVolver7 = new javax.swing.JButton();
        botonBuscarcliente1 = new javax.swing.JButton();
        RefrescarBTN = new javax.swing.JButton();

        botonBuscarinventario.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscarinventario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonBuscarinventario.setForeground(new java.awt.Color(255, 204, 0));
        botonBuscarinventario.setText("Buscar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Video Juegos");

        tablaClientes.setBackground(new java.awt.Color(102, 102, 102));
        tablaClientes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaClientes.setForeground(new java.awt.Color(255, 204, 0));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CC", "Nombre", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaClientes.setToolTipText("");
        jScrollPane1.setViewportView(tablaClientes);

        botonBuscarcliente.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscarcliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonBuscarcliente.setForeground(new java.awt.Color(255, 204, 0));
        botonBuscarcliente.setText("Buscar Cliente");
        botonBuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarclienteActionPerformed(evt);
            }
        });

        botonDescargarreporte.setBackground(new java.awt.Color(102, 102, 102));
        botonDescargarreporte.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonDescargarreporte.setForeground(new java.awt.Color(255, 204, 0));
        botonDescargarreporte.setText("Descargar Reporte");

        botonVolver7.setBackground(new java.awt.Color(102, 102, 102));
        botonVolver7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonVolver7.setForeground(new java.awt.Color(255, 204, 0));
        botonVolver7.setText("Volver");
        botonVolver7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolver7ActionPerformed(evt);
            }
        });

        botonBuscarcliente1.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscarcliente1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonBuscarcliente1.setForeground(new java.awt.Color(255, 204, 0));
        botonBuscarcliente1.setText("Crear Cliente");
        botonBuscarcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarcliente1ActionPerformed(evt);
            }
        });

        RefrescarBTN.setBackground(new java.awt.Color(102, 102, 102));
        RefrescarBTN.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        RefrescarBTN.setForeground(new java.awt.Color(255, 204, 0));
        RefrescarBTN.setText("Refrescar Tabla");
        RefrescarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrescarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(botonBuscarcliente)
                                .addGap(59, 59, 59)
                                .addComponent(botonBuscarcliente1)
                                .addGap(86, 86, 86)
                                .addComponent(botonDescargarreporte)
                                .addGap(61, 61, 61)
                                .addComponent(botonVolver7))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(RefrescarBTN)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RefrescarBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarcliente)
                    .addComponent(botonBuscarcliente1)
                    .addComponent(botonDescargarreporte)
                    .addComponent(botonVolver7))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarclienteActionPerformed
        
        BuscarClienteCliente ve=new BuscarClienteCliente();
       ControladorCliente c=new ControladorCliente(ve);
       ve.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_botonBuscarclienteActionPerformed

    private void botonVolver7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolver7ActionPerformed
       
        PantallaPrincipal pant =new PantallaPrincipal();
        pant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolver7ActionPerformed

    private void botonBuscarcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarcliente1ActionPerformed
        
        
        CrearCliente v=new CrearCliente();
       ControladorCliente c=new ControladorCliente(v);
       v.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_botonBuscarcliente1ActionPerformed

    private void RefrescarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrescarBTNActionPerformed
       
        Clientes aggIn =new Clientes();
        ControladorCliente c=new ControladorCliente(aggIn);
        aggIn.setVisible(true);
        //this.dispose();
        
    }//GEN-LAST:event_RefrescarBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton RefrescarBTN;
    private javax.swing.JButton botonBuscarcliente;
    private javax.swing.JButton botonBuscarcliente1;
    private javax.swing.JButton botonBuscarinventario;
    private javax.swing.JButton botonDescargarreporte;
    private javax.swing.JButton botonVolver7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
