package aps_poo;

// "*" porque importa todas as classes do tipo sql
import java.sql.*;

public class Conexao       
{
    private Connection connection = null;
    
    public Conexao conexaodb() throws ClassNotFoundException, InstantiationException,
    IllegalAccessException, SQLException { 
        
        String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String senha = "root";
        String url      = "jdbc:postgresql://localhost/APS_POO";
        
        try
        {
            Class.forName(driver).newInstance();
            Connection con = null;
            con = (Connection) DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Fodeo 1");
            System.err.print(ex.getMessage());
        } 
        catch (SQLException e)
        {
            System.out.println("Fodeo no 2");
            System.err.print(e.getMessage());
        }
        return null;
    }
}