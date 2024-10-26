package com.cacharreriaexito;

import com.cacharreriaexito.controller.ClienteController;
import com.cacharreriaexito.model.Cliente;

public class Main {
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();

        // Agregar un nuevo cliente
        clienteController.addCliente(new Cliente("Tienda 34", "326799923", "123-4567", "Buga", "Calle 7489"));
        
        // Listar todos los clientes
        for (Cliente cliente : clienteController.getAllClientes()) {
            System.out.println(cliente.getNombre());
        }
    }
}

