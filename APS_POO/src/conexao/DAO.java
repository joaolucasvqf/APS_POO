package conexao;

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
            System.out.println("Conectado");
        }
        

    Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
