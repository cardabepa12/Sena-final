package com.cacharreriaexito.model;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String nitORut;
    private String telefono;
    private String ciudad;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String nitORut, String telefono, String ciudad, String direccion) {
        this.nombre = nombre;
        this.nitORut = nitORut;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    // Getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNitORut() {
        return nitORut;
    }

    public void setNitORut(String nitORut) {
        this.nitORut = nitORut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

