package com.cacharreriaexito;

import com.cacharreriaexito.controller.ClienteController;
import com.cacharreriaexito.model.Cliente;

public class Main {
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();

        // Agregar un nuevo cliente
        clienteController.addCliente(new Cliente("Tienda 34", "326799923", "123-4567", "Buga", "Calle 7489"));
        clienteController.addCliente(new Cliente("Tienda 35", "326795656", "123-4232", "Palmira", "Calle 77#74"));

        //Actualizar Cliente
        Cliente clienteParaActualizar = new Cliente("Tienda 34 Actualizada", "326799999", "123-0000", "Buga", "Calle 8000");       
        clienteController.upCliente(6, clienteParaActualizar);

        //Eliminar cliente
        clienteController.delCliente(3);

        
        // Listar todos los clientes
        for (Cliente cliente : clienteController.getAllClientes()) {
            System.out.println(cliente.getNombre());
        }
    }
}

