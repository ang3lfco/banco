/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ux.Conversiones;

/**
 *
 * @author Martinez
 */
public class frmHistorial extends javax.swing.JFrame {
    private String idClienteEnSesion;

    /**
     * Creates new form frmHistorial
     */
    public frmHistorial(String id) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.idClienteEnSesion = id;
        imgVolver.requestFocusInWindow();
        cargarHistorial();
        
        // Agregar un FocusListener
        txtFechaDesde.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtFechaDesde.getText().equals("desde (aaaa/mm/dd)")) {
                    txtFechaDesde.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtFechaDesde.getText().isEmpty()) {
                    txtFechaDesde.setText("desde (aaaa/mm/dd)");
                }
            }
        });
        
        // Agregar un FocusListener
        txtFechaHasta.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtFechaHasta.getText().equals("hasta (aaaa/mm/dd)")) {
                    txtFechaHasta.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtFechaHasta.getText().isEmpty()) {
                    txtFechaHasta.setText("hasta (aaaa/mm/dd)");
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

        txtFechaDesde = new javax.swing.JTextField();
        txtFechaHasta = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        lblConsultarPeriodo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlMove2 = new javax.swing.JPanel();
        imgCerrar2 = new javax.swing.JLabel();
        imgMinimizar2 = new javax.swing.JLabel();
        imgVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtFechaDesde.setBackground(new java.awt.Color(0, 51, 51));
        txtFechaDesde.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaDesde.setText("desde (aaaa/mm/dd)");

        txtFechaHasta.setBackground(new java.awt.Color(0, 51, 51));
        txtFechaHasta.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaHasta.setText("hasta (aaaa/mm/dd)");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tblHistorial.setBackground(new java.awt.Color(0, 51, 51));
        tblHistorial.setForeground(new java.awt.Color(255, 255, 255));
        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHistorial.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(tblHistorial);

        lblConsultarPeriodo.setText("Consultar por periodo");

        pnlMove2.setBackground(new java.awt.Color(0, 51, 51));

        imgCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        imgCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrar2MouseClicked(evt);
            }
        });

        imgMinimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        imgMinimizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMove2Layout = new javax.swing.GroupLayout(pnlMove2);
        pnlMove2.setLayout(pnlMove2Layout);
        pnlMove2Layout.setHorizontalGroup(
            pnlMove2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMove2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgMinimizar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCerrar2))
        );
        pnlMove2Layout.setVerticalGroup(
            pnlMove2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCerrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgMinimizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        imgVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        imgVolver.setText("Volver");
        imgVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMove2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imgVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsultarPeriodo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultar))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlMove2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsultarPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnConsultar)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrar2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_imgCerrar2MouseClicked

    private void imgMinimizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizar2MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizar2MouseClicked

    private void imgVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgVolverMouseClicked
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal(idClienteEnSesion);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_imgVolverMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String fechaDesde = txtFechaDesde.getText();
        String fechaHasta = txtFechaHasta.getText();
        Date desde = null;
        Date hasta = null;
        
        try{
            desde = new SimpleDateFormat("yyyy-MM-dd").parse(fechaDesde);
            hasta = new SimpleDateFormat("yyyy-MM-dd").parse(fechaHasta);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Error en Fechas, capture el formato correcto: yyyy/mm/dd", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        HistorialPorPeriodo(desde, hasta);
    }//GEN-LAST:event_btnConsultarActionPerformed
    
    private void HistorialPorPeriodo(Date desde, Date hasta){
        Conversiones conversiones = new Conversiones();
        List<List<Object>> historial = conversiones.obtenerHistorialPorPeriodo(idClienteEnSesion, desde, hasta);
        if(historial != null && !historial.isEmpty()){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Folio");
            model.addColumn("Fecha de Operacion");
            model.addColumn("Tipo de Operacion");
            model.addColumn("Cuenta Origen");
            model.addColumn("Cuenta Destino");
            model.addColumn("Monto");
            for(List<Object> fila : historial){
                model.addRow(fila.toArray());
            }
            tblHistorial.setModel(model);
        }
        else {
            JOptionPane.showMessageDialog(null, "El historial esta vacio. ", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void cargarHistorial() {
        Conversiones conversiones = new Conversiones();
        List<List<Object>> historial = conversiones.obtenerHistorialOperaciones(idClienteEnSesion);
        if (historial != null && !historial.isEmpty()) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Folio");
            model.addColumn("Fecha de Operacion");
            model.addColumn("Tipo de Operacion");
            model.addColumn("Cuenta Origen");
            model.addColumn("Cuenta Destino");
            model.addColumn("Monto");
            for (List<Object> fila : historial) {
                model.addRow(fila.toArray());
            }
            tblHistorial.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "El historial esta vacio. ", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel imgCerrar2;
    private javax.swing.JLabel imgMinimizar2;
    private javax.swing.JLabel imgVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConsultarPeriodo;
    private javax.swing.JPanel pnlMove2;
    private javax.swing.JTable tblHistorial;
    private javax.swing.JTextField txtFechaDesde;
    private javax.swing.JTextField txtFechaHasta;
    // End of variables declaration//GEN-END:variables
}
