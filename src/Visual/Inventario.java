/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Controller.ControladorVideojuego;

/**
 *
 * @author simclub01
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Inventario() {
       
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inventario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        botonAgregarinventario = new javax.swing.JButton();
        botonBuscarinventario = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tablaInventario.setBackground(new java.awt.Color(102, 102, 102));
        tablaInventario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaInventario.setForeground(new java.awt.Color(255, 204, 0));
        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Consola", "Nombre", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaInventario.setToolTipText("");
        jScrollPane1.setViewportView(tablaInventario);

        botonAgregarinventario.setBackground(new java.awt.Color(102, 102, 102));
        botonAgregarinventario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonAgregarinventario.setForeground(new java.awt.Color(255, 204, 0));
        botonAgregarinventario.setText("Agregar");
        botonAgregarinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarinventarioActionPerformed(evt);
            }
        });

        botonBuscarinventario.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscarinventario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonBuscarinventario.setForeground(new java.awt.Color(255, 204, 0));
        botonBuscarinventario.setText("Buscar");
        botonBuscarinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarinventarioActionPerformed(evt);
            }
        });

        botonVolver.setBackground(new java.awt.Color(102, 102, 102));
        botonVolver.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(255, 204, 0));
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Video Juegos");

        botonEliminar.setBackground(new java.awt.Color(102, 102, 102));
        botonEliminar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 204, 0));
        botonEliminar.setText("Eliminar");

        refrescar.setBackground(new java.awt.Color(102, 102, 102));
        refrescar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        refrescar.setForeground(new java.awt.Color(255, 204, 0));
        refrescar.setText("Refrescar Tabla");
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(refrescar)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(botonAgregarinventario)
                .addGap(90, 90, 90)
                .addComponent(botonBuscarinventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminar)
                .addGap(100, 100, 100)
                .addComponent(botonVolver)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarinventario)
                    .addComponent(botonBuscarinventario)
                    .addComponent(botonEliminar)
                    .addComponent(botonVolver))
                .addGap(33, 33, 33))
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

    private void botonAgregarinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarinventarioActionPerformed
        
        AgregarInventario agg=new AgregarInventario();
        ControladorVideojuego c=new ControladorVideojuego(agg);
        agg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAgregarinventarioActionPerformed

    private void botonBuscarinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarinventarioActionPerformed
       
        BuscarInventario aggIn =new BuscarInventario();
        ControladorVideojuego c=new ControladorVideojuego(aggIn);
        aggIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBuscarinventarioActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        
        PantallaPrincipal pant =new PantallaPrincipal();
        pant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refrescarActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
       Inventario v=new Inventario();
        ControladorVideojuego c=new ControladorVideojuego(v);
       v.setVisible(true);
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonAgregarinventario;
    public javax.swing.JButton botonBuscarinventario;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton refrescar;
    public javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables
}
