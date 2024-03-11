/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ux;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Martinez
 */
public class Conversiones {
    
    public List<List<Object>> obtenerCuentasCliente(String id){
        List<List<Object>> cuentas = new ArrayList<>();
        try{
            Connection conexion = ConexionBD.openConnection();
            String consulta = "SELECT * FROM Cuentas WHERE id=?";
            try{
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                pstm.setString(1, id);
                ResultSet rs = pstm.executeQuery();
                while(rs.next()){
                    List<Object> cuenta = new ArrayList<>();
                    cuenta.add(rs.getLong("numeroCuenta"));
                    cuenta.add(rs.getDouble("saldo"));
                    cuentas.add(cuenta);
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al cargar las cuentas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar las cuentas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cuentas;
    }
    
    public String obtenerNombreCliente(String id){
        String nombreCliente = null;
        try{
            Connection conexion = ConexionBD.openConnection();
            String consulta = "SELECT nombres FROM Clientes WHERE id=?";
            try{
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                pstm.setString(1, id);
                ResultSet rs = pstm.executeQuery();
                if(rs.next()){
                    nombreCliente = rs.getString("nombres");
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al obtener el nombre del cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al ejecutar su consulta. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return nombreCliente;
    }
    
    public List<List<Object>> obtenerHistorialOperaciones(String idCliente){
        List<List<Object>> historialOperaciones = new ArrayList<>();
        try {
            Connection conexion = ConexionBD.openConnection();
            String consulta = "SELECT folio, fechaOperacion, tipoOperacion, cuentaOrigen, cuentaDestino, monto FROM Operaciones WHERE id=?";
            try {
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                pstm.setString(1, idCliente);
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    List<Object> operacion = new ArrayList<>();
                    operacion.add(rs.getInt("folio"));
                    operacion.add(rs.getDate("fechaOperacion"));
                    operacion.add(rs.getString("tipoOperacion"));
                    operacion.add(rs.getInt("cuentaOrigen"));
                    operacion.add(rs.getInt("cuentaDestino"));
                    operacion.add(rs.getDouble("monto"));
                    historialOperaciones.add(operacion);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el historial. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el historial." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return historialOperaciones;
    }
}
