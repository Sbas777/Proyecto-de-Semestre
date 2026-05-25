package com.elahorro.modelo;

/**
 *
 * @author famil
 */
public class Cliente {
    private int idCliente;
    private String documento;
    private String nombre;
    private String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String documento, String nombre, String email) {
        this.idCliente = idCliente;
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
