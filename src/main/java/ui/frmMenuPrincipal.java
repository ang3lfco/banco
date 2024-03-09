/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import ux.Conversiones;

/**
 *
 * @author Martinez
 */
public class frmMenuPrincipal extends javax.swing.JFrame {
    private String idClienteEnSesion;
    private Conversiones obtenerCliente;

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal(String id) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.idClienteEnSesion = id;
        this.obtenerCliente = new Conversiones();
        String nombreCliente = obtenerCliente.obtenerNombreCliente(idClienteEnSesion);
        if(nombreCliente != null){
            lblCliente.setText(nombreCliente);
        }
        else{
            lblCliente.setText("cliente desconocido");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlRetirar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlCuentas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlHistorial = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnlPerfil = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        pnlTransferir = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnlMove3 = new javax.swing.JPanel();
        imgCerrar3 = new javax.swing.JLabel();
        imgMinimizar3 = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlRegistrar.setBackground(new java.awt.Color(0, 51, 51));
        pnlRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegistrarMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\registrar-cuenta.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrar Cuenta");

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlRetirar.setBackground(new java.awt.Color(0, 51, 51));
        pnlRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRetirarMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\retiro-de-efectivo.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Retirar");

        javax.swing.GroupLayout pnlRetirarLayout = new javax.swing.GroupLayout(pnlRetirar);
        pnlRetirar.setLayout(pnlRetirarLayout);
        pnlRetirarLayout.setHorizontalGroup(
            pnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetirarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pnlRetirarLayout.setVerticalGroup(
            pnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetirarLayout.createSequentialGroup()
                .addGroup(pnlRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRetirarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8))
                    .addGroup(pnlRetirarLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlCuentas.setBackground(new java.awt.Color(0, 51, 51));
        pnlCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCuentasMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\consulta.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mis Cuentas");

        javax.swing.GroupLayout pnlCuentasLayout = new javax.swing.GroupLayout(pnlCuentas);
        pnlCuentas.setLayout(pnlCuentasLayout);
        pnlCuentasLayout.setHorizontalGroup(
            pnlCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuentasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlCuentasLayout.setVerticalGroup(
            pnlCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuentasLayout.createSequentialGroup()
                .addGroup(pnlCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCuentasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel12))
                    .addGroup(pnlCuentasLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel13)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlHistorial.setBackground(new java.awt.Color(0, 51, 51));
        pnlHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHistorialMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\historial.png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Historial");

        javax.swing.GroupLayout pnlHistorialLayout = new javax.swing.GroupLayout(pnlHistorial);
        pnlHistorial.setLayout(pnlHistorialLayout);
        pnlHistorialLayout.setHorizontalGroup(
            pnlHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistorialLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHistorialLayout.setVerticalGroup(
            pnlHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistorialLayout.createSequentialGroup()
                .addGroup(pnlHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHistorialLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel14))
                    .addGroup(pnlHistorialLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel15)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlPerfil.setBackground(new java.awt.Color(0, 51, 51));
        pnlPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPerfilMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\perfil.png")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Perfil");

        javax.swing.GroupLayout pnlPerfilLayout = new javax.swing.GroupLayout(pnlPerfil);
        pnlPerfil.setLayout(pnlPerfilLayout);
        pnlPerfilLayout.setHorizontalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPerfilLayout.setVerticalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addGroup(pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPerfilLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel16))
                    .addGroup(pnlPerfilLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel17)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\bienvenidos.png")); // NOI18N

        lblCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(0, 51, 51));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("cliente");

        pnlTransferir.setBackground(new java.awt.Color(0, 51, 51));
        pnlTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTransferirMouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\transferir (1).png")); // NOI18N

        jLabel23.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Transferir");

        javax.swing.GroupLayout pnlTransferirLayout = new javax.swing.GroupLayout(pnlTransferir);
        pnlTransferir.setLayout(pnlTransferirLayout);
        pnlTransferirLayout.setHorizontalGroup(
            pnlTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransferirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlTransferirLayout.setVerticalGroup(
            pnlTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransferirLayout.createSequentialGroup()
                .addGroup(pnlTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransferirLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel22))
                    .addGroup(pnlTransferirLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel23)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlMove3.setBackground(new java.awt.Color(0, 51, 51));

        imgCerrar3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\cerrar.png")); // NOI18N
        imgCerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrar3MouseClicked(evt);
            }
        });

        imgMinimizar3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martinez\\Desktop\\proyectoBanco\\src\\main\\java\\resources\\minimizar.png")); // NOI18N
        imgMinimizar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMove3Layout = new javax.swing.GroupLayout(pnlMove3);
        pnlMove3.setLayout(pnlMove3Layout);
        pnlMove3Layout.setHorizontalGroup(
            pnlMove3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMove3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMinimizar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCerrar3))
        );
        pnlMove3Layout.setVerticalGroup(
            pnlMove3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCerrar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgMinimizar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblCerrarSesion.setForeground(new java.awt.Color(0, 51, 51));
        lblCerrarSesion.setText("Cerrar Sesion");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMove3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pnlRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pnlHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pnlCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCerrarSesion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlMove3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrarSesion)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCuentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrar3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_imgCerrar3MouseClicked

    private void imgMinimizar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizar3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizar3MouseClicked

    private void pnlRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseClicked
        // TODO add your handling code here:
        frmCrearCuenta crearCuenta = new frmCrearCuenta(idClienteEnSesion);
        crearCuenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlRegistrarMouseClicked

    private void pnlCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCuentasMouseClicked
        // TODO add your handling code here:
        frmConsultarCuentas cuentas = new frmConsultarCuentas(idClienteEnSesion);
        cuentas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlCuentasMouseClicked

    private void pnlRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRetirarMouseClicked
        // TODO add your handling code here:
        frmRetiroTipo tipoDeRetiro = new frmRetiroTipo(idClienteEnSesion);
        tipoDeRetiro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlRetirarMouseClicked

    private void pnlHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHistorialMouseClicked
        // TODO add your handling code here:
        frmHistorial historial = new frmHistorial(idClienteEnSesion);
        historial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlHistorialMouseClicked

    private void pnlTransferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTransferirMouseClicked
        // TODO add your handling code here:
        frmTransferencia transferencia = new frmTransferencia(idClienteEnSesion);
        transferencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlTransferirMouseClicked

    private void pnlPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPerfilMouseClicked
        // TODO add your handling code here:
        frmPerfil perfil = new frmPerfil(idClienteEnSesion);
        perfil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlPerfilMouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmLogin login = new frmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgCerrar3;
    private javax.swing.JLabel imgMinimizar3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JPanel pnlCuentas;
    private javax.swing.JPanel pnlHistorial;
    private javax.swing.JPanel pnlMove3;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlRetirar;
    private javax.swing.JPanel pnlTransferir;
    // End of variables declaration//GEN-END:variables
}
