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

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import java.util.Date;

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
                    List<Object> fila = new ArrayList<>();
                    fila.add(rs.getInt("folio"));
                    fila.add(rs.getDate("fechaOperacion"));
                    fila.add(rs.getString("tipoOperacion"));
                    fila.add(rs.getInt("cuentaOrigen"));
                    fila.add(rs.getInt("cuentaDestino"));
                    fila.add(rs.getDouble("monto"));
                    historialOperaciones.add(fila);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar el historial. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el historial." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return historialOperaciones;
    }

    public List<List<Object>> obtenerHistorialPorPeriodo(String idCliente, Date desde, Date hasta){
        List<List<Object>> historialPeriodo = new ArrayList<>();
        try{
            Connection conexion = ConexionBD.openConnection();
            String consulta = "SELECT * FROM Operaciones WHERE id=? AND fechaOperacion BETWEEN ? AND ?";
            PreparedStatement pstm = conexion.prepareStatement(consulta);
            pstm.setString(1, idCliente);
            pstm.setDate(2, new java.sql.Date(desde.getTime()));
            pstm.setDate(3, new java.sql.Date(hasta.getTime()));
            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                List<Object> fila = new ArrayList<>();
                fila.add(rs.getInt("folio"));
                fila.add(rs.getDate("fechaOperacion"));
                fila.add(rs.getString("tipoOperacion"));
                fila.add(rs.getInt("cuentaOrigen"));
                fila.add(rs.getInt("cuentaDestino"));
                fila.add(rs.getDouble("monto"));
                historialPeriodo.add(fila);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar el historial por periodo." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return historialPeriodo;
    }
}
