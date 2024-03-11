/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JFrame;
import ux.Conversiones;

/**
 *
 * @author Martinez
 */
public class frmRetiroCuentaPropia extends javax.swing.JFrame {
    private String idClienteEnSesion;
    /**
     * Creates new form frmRetiroCuentaPropia
     */
    public frmRetiroCuentaPropia(String id) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.idClienteEnSesion = id;
        cargarCuentasCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMove1 = new javax.swing.JPanel();
        imgCerrar1 = new javax.swing.JLabel();
        imgMinimizar = new javax.swing.JLabel();
        cmbCuentas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        imgCancelar2 = new javax.swing.JLabel();
        imgAceptar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlMove1.setBackground(new java.awt.Color(0, 51, 51));

        imgCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cerrar.png"))); // NOI18N
        imgCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrar1MouseClicked(evt);
            }
        });

        imgMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimizar.png"))); // NOI18N
        imgMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMove1Layout = new javax.swing.GroupLayout(pnlMove1);
        pnlMove1.setLayout(pnlMove1Layout);
        pnlMove1Layout.setHorizontalGroup(
            pnlMove1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMove1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCerrar1))
        );
        pnlMove1Layout.setVerticalGroup(
            pnlMove1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cmbCuentas.setBackground(new java.awt.Color(0, 51, 51));
        cmbCuentas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cmbCuentas.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Cuenta de Origen:");

        jTextField1.setBackground(new java.awt.Color(0, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Monto");

        imgCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/boton-eliminar.png"))); // NOI18N
        imgCancelar2.setText("Cancelar");
        imgCancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgCancelar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCancelar2MouseClicked(evt);
            }
        });

        imgAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aceptar.png"))); // NOI18N
        imgAceptar.setText("Aceptar");
        imgAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMove1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgCancelar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgAceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlMove1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgCancelar2)
                    .addComponent(imgAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrar1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal(idClienteEnSesion);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_imgCerrar1MouseClicked

    private void imgMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizarMouseClicked

    private void imgCancelar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCancelar2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal(idClienteEnSesion);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_imgCancelar2MouseClicked

    private void cargarCuentasCliente(){
        cmbCuentas.removeAllItems();
        Conversiones conversiones = new Conversiones();
        List<List<Object>> cuentasCliente = conversiones.obtenerCuentasCliente(idClienteEnSesion);
        
        for(List<Object> cuenta : cuentasCliente){
            String numeroCuenta = cuenta.get(0).toString();
            cmbCuentas.addItem(numeroCuenta);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCuentas;
    private javax.swing.JLabel imgAceptar;
    private javax.swing.JLabel imgCancelar2;
    private javax.swing.JLabel imgCerrar1;
    private javax.swing.JLabel imgMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlMove1;
    // End of variables declaration//GEN-END:variables
}
