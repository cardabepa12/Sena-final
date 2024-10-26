package com.cacharreriaexito.repository;

import com.cacharreriaexito.database.DataBaseConnection;
import com.cacharreriaexito.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM Cliente";

        try (Connection connection = DataBaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String nitORut = resultSet.getString("nit_o_rut");
                String telefono = resultSet.getString("telefono");
                String ciudad = resultSet.getString("ciudad");
                String direccion = resultSet.getString("direccion");

                clientes.add(new Cliente(nombre, nitORut, telefono, ciudad, direccion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void saveCliente(Cliente cliente) {
        String query = "INSERT INTO Cliente (nombre, nit_o_rut, telefono, ciudad, direccion) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getNitORut());
            preparedStatement.setString(3, cliente.getTelefono());
            preparedStatement.setString(4, cliente.getCiudad());
            preparedStatement.setString(5, cliente.getDireccion());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCliente(int idCliente) {
        String query = "DELETE FROM Cliente WHERE id_cliente = ?";
        try (Connection connection = DataBaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, idCliente);
                preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(Cliente cliente) {
        String query = "UPDATE Cliente SET nombre = ?, nit_o_rut = ?, telefono = ?, ciudad = ?, direccion = ? WHERE id_cliente = ?";
        try (Connection connection = DataBaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, cliente.getNombre());
                preparedStatement.setString(2, cliente.getNitORut());
                preparedStatement.setString(3, cliente.getTelefono());
                preparedStatement.setString(4, cliente.getCiudad());
                preparedStatement.setString(5, cliente.getDireccion());
                preparedStatement.setInt(6, cliente.getIdCliente());
                preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


