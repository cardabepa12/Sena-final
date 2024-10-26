package com.cacharreriaexito.controller;

import com.cacharreriaexito.model.Cliente;
import com.cacharreriaexito.repository.ClienteRepository;

import java.util.List;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

public class ClienteController {
    //Instanciando la clase que tiene la logica para conectarse a la BD.
    private ClienteRepository clienteRepository = new ClienteRepository();

    public List<Cliente> getAllClientes() {
        return clienteRepository.getAllClientes();
    }

    public void addCliente(Cliente cliente) {
        clienteRepository.saveCliente(cliente);
    }

    public void delCliente(int idCliente){
        clienteRepository.deleteCliente(idCliente);
    }

    public void upCliente(int idCliente, Cliente clienteActualizado){
        clienteRepository.updateCliente(clienteActualizado);
    }

    
}
