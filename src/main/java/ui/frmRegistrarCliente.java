/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ux.ConexionBD;

/**
 *
 * @author Martinez
 */
public class frmRegistrarCliente extends javax.swing.JFrame {
    
    /**
     * Creates new form frmRegistrarUsuario
     */
    public frmRegistrarCliente() {
        initComponents();
        setLocationRelativeTo(null);
        
        imgCancelar.requestFocusInWindow();
        
        // Agregar un FocusListener
        txtNombres.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNombres.getText().equals("Nombre(s)")) {
                    txtNombres.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNombres.getText().isEmpty()) {
                    txtNombres.setText("Nombre(s)");
                }
            }
        });
        
        // Agregar un FocusListener
        txtApPaterno.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtApPaterno.getText().equals("Apellido Paterno")) {
                    txtApPaterno.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtApPaterno.getText().isEmpty()) {
                    txtApPaterno.setText("Apellido Paterno");
                }
            }
        });
        
        // Agregar un FocusListener
        txtApMaterno.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtApMaterno.getText().equals("Apellido Materno")) {
                    txtApMaterno.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtApMaterno.getText().isEmpty()) {
                    txtApMaterno.setText("Apellido Materno");
                }
            }
        });
        
        // Agregar un FocusListener
        txtCalle.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCalle.getText().equals("Calle")) {
                    txtCalle.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCalle.getText().isEmpty()) {
                    txtCalle.setText("Calle");
                }
            }
        });
        
        // Agregar un FocusListener
        txtCodigoPostal.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCodigoPostal.getText().equals("Codigo Postal")) {
                    txtCodigoPostal.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCodigoPostal.getText().isEmpty()) {
                    txtCodigoPostal.setText("Codigo Postal");
                }
            }
        });
        
        // Agregar un FocusListener
        txtNoExterior.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNoExterior.getText().equals("No. Exterior")) {
                    txtNoExterior.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNoExterior.getText().isEmpty()) {
                    txtNoExterior.setText("No. Exterior");
                }
            }
        });
        
        // Agregar un FocusListener
        txtColonia.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtColonia.getText().equals("Colonia")) {
                    txtColonia.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtColonia.getText().isEmpty()) {
                    txtColonia.setText("Colonia");
                }
            }
        });
        
        // Agregar un FocusListener
        txtFechaNacimiento.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtFechaNacimiento.getText().equals("Fecha de Nacimiento (aaaa/mm/dd)")) {
                    txtFechaNacimiento.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtFechaNacimiento.getText().isEmpty()) {
                    txtFechaNacimiento.setText("Fecha de Nacimiento (aaaa/mm/dd)");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombres = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNoExterior = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        imgAceptar = new javax.swing.JLabel();
        imgCancelar = new javax.swing.JLabel();
        pnlMove1 = new javax.swing.JPanel();
        imgCerrar1 = new javax.swing.JLabel();
        imgMinimizar1 = new javax.swing.JLabel();
        passfContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtNombres.setBackground(new java.awt.Color(0, 51, 51));
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setText("Nombre(s)");

        txtApPaterno.setBackground(new java.awt.Color(0, 51, 51));
        txtApPaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApPaterno.setText("Apellido Paterno");

        txtApMaterno.setBackground(new java.awt.Color(0, 51, 51));
        txtApMaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApMaterno.setText("Apellido Materno");

        txtCodigoPostal.setBackground(new java.awt.Color(0, 51, 51));
        txtCodigoPostal.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoPostal.setText("Codigo Postal");

        txtCalle.setBackground(new java.awt.Color(0, 51, 51));
        txtCalle.setForeground(new java.awt.Color(255, 255, 255));
        txtCalle.setText("Calle");

        txtNoExterior.setBackground(new java.awt.Color(0, 51, 51));
        txtNoExterior.setForeground(new java.awt.Color(255, 255, 255));
        txtNoExterior.setText("No. Exterior");

        txtColonia.setBackground(new java.awt.Color(0, 51, 51));
        txtColonia.setForeground(new java.awt.Color(255, 255, 255));
        txtColonia.setText("Colonia");

        txtFechaNacimiento.setBackground(new java.awt.Color(0, 51, 51));
        txtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setText("Fecha de Nacimiento (aaaa/mm/dd)");

        imgAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        imgAceptar.setText("Aceptar");
        imgAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAceptarMouseClicked(evt);
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

        pnlMove1.setBackground(new java.awt.Color(0, 51, 51));

        imgCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        imgCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrar1MouseClicked(evt);
            }
        });

        imgMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        imgMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMove1Layout = new javax.swing.GroupLayout(pnlMove1);
        pnlMove1.setLayout(pnlMove1Layout);
        pnlMove1Layout.setHorizontalGroup(
            pnlMove1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMove1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgMinimizar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCerrar1))
        );
        pnlMove1Layout.setVerticalGroup(
            pnlMove1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgMinimizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        passfContraseña.setBackground(new java.awt.Color(0, 51, 51));
        passfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        passfContraseña.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMove1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCalle)
                    .addComponent(txtCodigoPostal)
                    .addComponent(txtApPaterno)
                    .addComponent(txtNombres)
                    .addComponent(txtApMaterno)
                    .addComponent(txtNoExterior)
                    .addComponent(txtColonia)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgAceptar))
                    .addComponent(passfContraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMove1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgAceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrar1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmLogin login = new frmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_imgCerrar1MouseClicked

    private void imgMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizar1MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizar1MouseClicked

    private void imgCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmLogin login = new frmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_imgCancelarMouseClicked

    private void imgAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAceptarMouseClicked
        // TODO add your handling code here:
        String nombres = txtNombres.getText();
        String apellidoPaterno = txtApPaterno.getText();
        String apellidoMaterno = txtApMaterno.getText();
        String calle = txtCalle.getText();
        String codigoPostal = txtCodigoPostal.getText();
        String noExterior = txtNoExterior.getText();
        String colonia = txtColonia.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
        String contraseña = new String(passfContraseña.getPassword());
        
        try{
            Connection conexion = ConexionBD.openConnection();
            conexion.setAutoCommit(false);
            String script = "INSERT INTO Clientes (nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, contraseña) VALUES (?, ?, ?, ?, ?)";
            
            try{
                PreparedStatement pstm = conexion.prepareStatement(script, Statement.RETURN_GENERATED_KEYS);
                pstm.setString(1, nombres);
                pstm.setString(2, apellidoPaterno);
                pstm.setString(3, apellidoMaterno);
                pstm.setString(4, fechaNacimiento);
                pstm.setString(5, contraseña);
                
                int filasInsertadas = pstm.executeUpdate();
                if(filasInsertadas > 0){
                    ResultSet genKeys = pstm.getGeneratedKeys();
                    if(genKeys.next()){
                        int id_cliente =  genKeys.getInt(1);
                        
                        String scriptDireccion = "INSERT INTO Domicilios (calle, codigoPostal, noExterior, colonia, id_cliente) VALUES (?,?,?,?,?)";
                        
                        try{
                            PreparedStatement pstmDireccion = conexion.prepareStatement(scriptDireccion);
                            pstmDireccion.setString(1, calle);
                            pstmDireccion.setString(2, codigoPostal);
                            pstmDireccion.setString(3, noExterior);
                            pstmDireccion.setString(4, colonia);
                            pstmDireccion.setInt(5, id_cliente);
                            
                            int filasInsertadasDireccion = pstmDireccion.executeUpdate();   
                            if(filasInsertadasDireccion > 0){
                                conexion.commit();
                                JOptionPane.showMessageDialog(this, "Su ID es el siguiente: " + id_cliente);
                            }
                            else{
                                System.out.println("Error al registrar domicilio.");
                            }
                            
                        }
                        catch(SQLException e){
                            JOptionPane.showMessageDialog(this, "Error al registar domicilio en la base de datos. " + e.getMessage());
                        }
                    }
                }
                else{
                    System.out.println("Error al registrar cliente.");
                }
            }
            catch(SQLException e){
                System.out.println("Error al ejecutar la consulta." + e.getMessage());
                conexion.rollback();
            } 
            finally{
                ConexionBD.closeConnection(conexion);
                this.dispose();
                frmLogin login = new frmLogin();
                login.setVisible(true);
            }
        }
        catch(SQLException e){
            System.out.println("Error al establecer la conexion a la base de datos." + e.getMessage());
        }
    }//GEN-LAST:event_imgAceptarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgAceptar;
    private javax.swing.JLabel imgCancelar;
    private javax.swing.JLabel imgCerrar1;
    private javax.swing.JLabel imgMinimizar1;
    private javax.swing.JPasswordField passfContraseña;
    private javax.swing.JPanel pnlMove1;
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
