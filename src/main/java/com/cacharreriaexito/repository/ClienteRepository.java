package com.cacharreriaexito.repository;

import com.cacharreriaexito.database.DataBaseConnection;
import com.cacharreriaexito.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    //traer el listado de clientes en un array
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        //Consulta SQL
        String query = "SELECT * FROM Cliente";

        try (Connection connection = DataBaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            //Bucle para recorrer y traer los valores de la consulta
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String nitORut = resultSet.getString("nit_o_rut");
                String telefono = resultSet.getString("telefono");
                String ciudad = resultSet.getString("ciudad");
                String direccion = resultSet.getString("direccion");

                //Crear un nuevo objeto cliente
                clientes.add(new Cliente(nombre, nitORut, telefono, ciudad, direccion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    //Guardar datos de cliente nuevo en  la BD

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

    //Borrar datos de cliente en  la BD

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

    //Actualizar datos de cliente en  la BD

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


