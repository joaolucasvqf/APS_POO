package aps_poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private Connection connection = null;
        public DAO () throws ClassNotFoundException, InstantiationException,
        IllegalAccessException, SQLException {
        String databaseURL = "jdbc:postgresql://localhost/APS_POO";
        String usuario = "postgres";
        String senha = "root";
        String driverName = "org.postgresql.Driver";
        //Carrega o driver
        Class.forName(driverName).newInstance();
        //Conecta o BD
        connection = DriverManager.getConnection(databaseURL, usuario, senha);
        }
}
