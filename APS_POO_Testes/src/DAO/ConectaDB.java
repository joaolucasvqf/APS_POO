package DAO;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaDB {    
    public static Connection conectaDB() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/APS_POO", "postgres", "root");
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
            return con;      
        } 
        catch(SQLException error){
            System.out.println("foddeo");
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }

    public Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


