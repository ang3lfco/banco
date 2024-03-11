/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ux.ConexionBD;
import ux.Conversiones;

/**
 *
 * @author Martinez
 */
public class frmTransferencia extends javax.swing.JFrame {
    private String idClienteEnSesion;
    
    /**
     * Creates new form frmTransferencia
     */
    public frmTransferencia(String id) {
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

        cmbCuentas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtCuentaDestino = new javax.swing.JTextField();
        imgCancelar = new javax.swing.JLabel();
        imgAceptar = new javax.swing.JLabel();
        pnlMove3 = new javax.swing.JPanel();
        imgCerrar3 = new javax.swing.JLabel();
        imgMinimizar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        cmbCuentas.setBackground(new java.awt.Color(0, 51, 51));
        cmbCuentas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cmbCuentas.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Cuenta de Origen:");

        txtMonto.setBackground(new java.awt.Color(0, 51, 51));
        txtMonto.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(255, 255, 255));
        txtMonto.setText("Monto");

        txtCuentaDestino.setBackground(new java.awt.Color(0, 51, 51));
        txtCuentaDestino.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtCuentaDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtCuentaDestino.setText("Cuenta de Destino");

        imgCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/boton-eliminar.png"))); // NOI18N
        imgCancelar.setText("Cancelar");
        imgCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCancelarMouseClicked(evt);
            }
        });

        imgAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aceptar.png"))); // NOI18N
        imgAceptar.setText("Aceptar");
        imgAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAceptarMouseClicked(evt);
            }
        });

        pnlMove3.setBackground(new java.awt.Color(0, 51, 51));

        imgCerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cerrar.png"))); // NOI18N
        imgCerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrar3MouseClicked(evt);
            }
        });

        imgMinimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimizar.png"))); // NOI18N
        imgMinimizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMove3Layout = new javax.swing.GroupLayout(pnlMove3);
        pnlMove3.setLayout(pnlMove3Layout);
        pnlMove3Layout.setHorizontalGroup(
            pnlMove3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMove3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgMinimizar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCerrar3))
        );
        pnlMove3Layout.setVerticalGroup(
            pnlMove3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCerrar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgMinimizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMove3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCuentaDestino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgAceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlMove3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgCancelar)
                    .addComponent(imgAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal(idClienteEnSesion);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_imgCancelarMouseClicked

    private void imgCerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrar3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal(idClienteEnSesion);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_imgCerrar3MouseClicked

    private void imgMinimizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizar2MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizar2MouseClicked

    private void imgAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAceptarMouseClicked
        // TODO add your handling code here:
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        String fechaOperacion = currentDate.format(formatter);
        String tipoOperacion = "Transferencia";
        String cuentaOrigen = cmbCuentas.getSelectedItem().toString();
        String cuentaDestino = txtCuentaDestino.getText();
        double monto = Double.parseDouble(txtMonto.getText());
        String id = idClienteEnSesion;
        String numeroCuenta = cuentaOrigen;
        
        try{
            Connection conexion = ConexionBD.openConnection();
            conexion.setAutoCommit(false);
            
            String verificacionOrigen = "SELECT saldo FROM Cuentas WHERE numeroCuenta=?";
            PreparedStatement pstmVerificarOrigen = conexion.prepareStatement(verificacionOrigen);
            pstmVerificarOrigen.setString(1, cuentaOrigen);
            ResultSet rsOrigen = pstmVerificarOrigen.executeQuery();

            String verificacionDestino = "SELECT saldo FROM Cuentas WHERE numeroCuenta=?";
            PreparedStatement pstmVerificarDestino = conexion.prepareStatement(verificacionDestino);
            pstmVerificarDestino.setString(1, cuentaDestino);
            ResultSet rsDestino = pstmVerificarDestino.executeQuery();
            
            if(rsOrigen.next() && rsDestino.next()){
                double salgoOrigen = rsOrigen.getDouble("saldo");
                double saldoDestino = rsDestino.getDouble("saldo");

                if(salgoOrigen >= monto){
                    double nuevoSaldoOrigen = salgoOrigen - monto;
                    double nuevoSaldoDestino = saldoDestino + monto;
                    
                    String actualizarSaldoOrigen = "UPDATE Cuentas SET saldo=? WHERE numeroCuenta=?";
                    PreparedStatement pstmRestarOrigen = conexion.prepareStatement(actualizarSaldoOrigen);
                    pstmRestarOrigen.setDouble(1, nuevoSaldoOrigen);
                    pstmRestarOrigen.setString(2, cuentaOrigen);
                    int filasActualizadasOrigen = pstmRestarOrigen.executeUpdate();

                    String actualizarSaldoDestino = "UPDATE Cuentas SET saldo=? WHERE numeroCuenta=?";
                    PreparedStatement pstmSumarDestino = conexion.prepareStatement(actualizarSaldoDestino);
                    pstmSumarDestino.setDouble(1, nuevoSaldoDestino);
                    pstmSumarDestino.setString(2, cuentaDestino);
                    int filasActualizadasDestino = pstmSumarDestino.executeUpdate();


                    if(filasActualizadasOrigen > 0 && filasActualizadasDestino > 0){
                        String transferencia = "INSERT INTO Operaciones (fechaOperacion, tipoOperacion, cuentaOrigen, cuentaDestino, monto, id, numeroCuenta) VALUES (?,?,?,?,?,?,?)";
                        PreparedStatement pstm = conexion.prepareStatement(transferencia);
                        pstm.setString(1, fechaOperacion);
                        pstm.setString(2, tipoOperacion);
                        pstm.setString(3, cuentaOrigen);
                        pstm.setString(4, cuentaDestino);
                        pstm.setDouble(5, monto);
                        pstm.setString(6, id);
                        pstm.setString(7, numeroCuenta);
                        
                        int filasInsertadas = pstm.executeUpdate();
                        if(filasInsertadas > 0){
                            conexion.commit();
                            JOptionPane.showMessageDialog(this, "Transferencia realizada con exito.");
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Error al momento de transferir.");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Saldo insuficiente en la cuenta de origen.");
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, "" + e.getMessage());
        }
    }//GEN-LAST:event_imgAceptarMouseClicked
    
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
    private javax.swing.JLabel imgCancelar;
    private javax.swing.JLabel imgCerrar3;
    private javax.swing.JLabel imgMinimizar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlMove3;
    private javax.swing.JTextField txtCuentaDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
