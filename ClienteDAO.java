package com.elahorro.modelo;

/**
 *
 * @author famil
 */
import com.elahorro.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public boolean registrarCliente(Cliente cliente) {
    String sql = "INSERT INTO cliente (documento, nombre, email) VALUES (?, ?, ?)";
    
    Connection cn = Conexion.conectar();
    
    try {
        PreparedStatement ps = cn.prepareStatement(sql);
        
        ps.setString(1, cliente.getDocumento()); 
        ps.setString(2, cliente.getNombre());   
        ps.setString(3, cliente.getEmail());  
        
        ps.executeUpdate();
        return true;
        
    } catch (SQLException e) {
        System.out.println("Error al registrar cliente: " + e.getMessage());
        return false;
    } finally {
        try {
            if (cn != null) cn.close();
        } catch (SQLException e) {
        }
    }
    }

    public java.util.List<com.elahorro.modelo.Cliente> listarClientes() {
    java.util.List<com.elahorro.modelo.Cliente> lista = new java.util.ArrayList<>();
    
    String sql = "SELECT id_cliente, documento, nombre, email, puntos_acumulados FROM cliente";
    
    Connection cn = Conexion.conectar();
    
    try {
        PreparedStatement ps = cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            com.elahorro.modelo.Cliente c = new com.elahorro.modelo.Cliente();
            c.setIdCliente(rs.getInt("id_cliente"));
            c.setDocumento(rs.getString("documento"));
            c.setNombre(rs.getString("nombre")); 
            c.setEmail(rs.getString("email")); 
            c.setPuntosAcumulados(rs.getInt("puntos_acumulados"));
            
            lista.add(c);
        }
    } catch (SQLException e) {
        System.out.println("Error al listar clientes: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
        } catch (SQLException e) {
        }
    }
    return lista;
    }

    public boolean actualizarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET documento = ?, nombre = ?, email = ? WHERE id_cliente = ?";
        
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, cliente.getDocumento());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getEmail());
            ps.setInt(4, cliente.getIdCliente());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(int idCliente) {
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setInt(1, idCliente);
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
            return false;
        }
    }
}
