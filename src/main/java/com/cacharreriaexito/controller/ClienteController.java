package com.cacharreriaexito.controller;

import com.cacharreriaexito.model.Cliente;
import com.cacharreriaexito.repository.ClienteRepository;

import java.util.List;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

public class ClienteController {
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

    public void upCliente(Cliente cliente){
        clienteRepository.updateCliente(cliente);
    }

    
}
