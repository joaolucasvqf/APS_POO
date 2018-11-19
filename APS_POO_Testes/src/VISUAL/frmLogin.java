package VISUAL;

import java.sql.*;
import DAO.ConectaDB;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmLogin extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public frmLogin() throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        con = ConectaDB.conectaDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmLogin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
