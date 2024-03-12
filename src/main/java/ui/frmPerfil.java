/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ux.ConexionBD;

/**
 *
 * @author Martinez
 */
public class frmPerfil extends javax.swing.JFrame {
    private String idClienteEnSesion;
    /**
     * Creates new form frmPerfil
     */
    public frmPerfil(String id) {
        initComponents();
        setLocationRelativeTo(null);
        this.idClienteEnSesion = id;
        cargarDatosCliente();
    }
    
    private void cargarDatosCliente(){
        String nombres;
        String apellidoPaterno;
        String apellidoMaterno;
        String calle;
        String codigoPostal;
        int NoExterior;
        String colonia;
        String fechaNacimiento;
        String contraseña;
        
        try{
            Connection conexion = ConexionBD.openConnection();
            String consulta = "SELECT * FROM Clientes WHERE id=?";
            PreparedStatement pstm = conexion.prepareStatement(consulta);
            pstm.setString(1, idClienteEnSesion);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                nombres = rs.getString("nombres");
                apellidoPaterno = rs.getString("apellidoPaterno");
                apellidoMaterno = rs.getString("apellidoMaterno");
                fechaNacimiento = rs.getString("fechaNacimiento");
                contraseña = rs.getString("contraseña");
                txtNombres.setText(nombres);
                txtApPaterno.setText(apellidoPaterno);
                txtApMaterno.setText(apellidoMaterno);
                txtFechaNacimiento.setText(fechaNacimiento);
                passfContraseña.setText(contraseña);
                
                String consultaDomicilio = "SELECT * FROM Domicilios WHERE id_cliente=?";
                PreparedStatement pstmDomicilio = conexion.prepareStatement(consultaDomicilio);
                pstmDomicilio.setString(1, idClienteEnSesion);
                ResultSet rsDomicilio = pstmDomicilio.executeQuery();
                if(rsDomicilio.next()){
                    calle = rsDomicilio.getString("calle");
                    codigoPostal = rsDomicilio.getString("codigoPostal");
                    NoExterior = rsDomicilio.getInt("noExterior");
                    colonia = rsDomicilio.getString("Colonia");
                    
                    txtCalle.setText(calle);
                    txtCodigoPostal.setText(codigoPostal);
                    txtNoExterior.setText(Integer.toString(NoExterior));
                    txtColonia.setText(colonia);
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, "");
        }
    }
    
    private void actualizarDatosCliente() {
        String nombres = txtNombres.getText();
        String apellidoPaterno = txtApPaterno.getText();
        String apellidoMaterno = txtApMaterno.getText();
        String calle = txtCalle.getText();
        String codigoPostal = txtCodigoPostal.getText();
        int noExterior = Integer.parseInt(txtNoExterior.getText());
        String colonia = txtColonia.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
        String contraseña = new String(passfContraseña.getPassword());

        try {
            Connection conexion = ConexionBD.openConnection();
            // Actualizar Clientes
            String updateCliente = "UPDATE Clientes SET nombres=?, apellidoPaterno=?, apellidoMaterno=?, fechaNacimiento=?, contraseña=? WHERE id=?";
            PreparedStatement pstmCliente = conexion.prepareStatement(updateCliente);
            pstmCliente.setString(1, nombres);
            pstmCliente.setString(2, apellidoPaterno);
            pstmCliente.setString(3, apellidoMaterno);
            pstmCliente.setString(4, fechaNacimiento);
            pstmCliente.setString(5, contraseña);
            pstmCliente.setString(6, idClienteEnSesion);
            pstmCliente.executeUpdate();

            // Actualizar Domicilios
            String updateDomicilio = "UPDATE Domicilios SET calle=?, codigoPostal=?, noExterior=?, colonia=? WHERE id_cliente=?";
            PreparedStatement pstmDomicilio = conexion.prepareStatement(updateDomicilio);
            pstmDomicilio.setString(1, calle);
            pstmDomicilio.setString(2, codigoPostal);
            pstmDomicilio.setInt(3, noExterior);
            pstmDomicilio.setString(4, colonia);
            pstmDomicilio.setString(5, idClienteEnSesion);
            pstmDomicilio.executeUpdate();

            JOptionPane.showMessageDialog(this, "Los datos se han actualizado correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos del cliente: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtNoExterior = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        imgActualizar = new javax.swing.JLabel();
        imgCancelar = new javax.swing.JLabel();
        passfContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N

        txtNombres.setBackground(new java.awt.Color(0, 51, 51));
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setText("Nombre(s)");

        txtApPaterno.setBackground(new java.awt.Color(0, 51, 51));
        txtApPaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApPaterno.setText("Apellido Paterno");

        txtApMaterno.setBackground(new java.awt.Color(0, 51, 51));
        txtApMaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApMaterno.setText("Apellido Materno");

        txtCalle.setBackground(new java.awt.Color(0, 51, 51));
        txtCalle.setForeground(new java.awt.Color(255, 255, 255));
        txtCalle.setText("Calle");

        txtCodigoPostal.setBackground(new java.awt.Color(0, 51, 51));
        txtCodigoPostal.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoPostal.setText("Codigo Postal");

        txtNoExterior.setBackground(new java.awt.Color(0, 51, 51));
        txtNoExterior.setForeground(new java.awt.Color(255, 255, 255));
        txtNoExterior.setText("No. Exterior");

        txtColonia.setBackground(new java.awt.Color(0, 51, 51));
        txtColonia.setForeground(new java.awt.Color(255, 255, 255));
        txtColonia.setText("Colonia");

        txtFechaNacimiento.setBackground(new java.awt.Color(0, 51, 51));
        txtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setText("Fecha de Nacimiento (aaaa/mm/dd)");

        imgActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        imgActualizar.setText("Actualizar");
        imgActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgActualizarMouseClicked(evt);
            }
        });

        imgCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        imgCancelar.setText("Cancelar");
        imgCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCancelarMouseClicked(evt);
            }
        });

        passfContraseña.setBackground(new java.awt.Color(0, 51, 51));
        passfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        passfContraseña.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passfContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCalle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoExterior, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColonia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgCancelar)
                    .addComponent(imgActualizar))
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

    private void imgActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgActualizarMouseClicked
        // TODO add your handling code here:
        actualizarDatosCliente();
    }//GEN-LAST:event_imgActualizarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgActualizar;
    private javax.swing.JLabel imgCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passfContraseña;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNoExterior;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
