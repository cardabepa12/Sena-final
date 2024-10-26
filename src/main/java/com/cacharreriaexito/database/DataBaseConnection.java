package com.cacharreriaexito.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Configuracion de conexion a BD
public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/cacharreria_exito";
    private static final String USER = "root";
    private static final String PASSWORD = "Abcd*1234";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
