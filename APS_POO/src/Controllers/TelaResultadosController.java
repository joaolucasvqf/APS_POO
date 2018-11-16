package Controllers;

import aps_poo.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaResultadosController implements Initializable {
    
    @FXML
    private Label lblPessoas, lblPratos, lblSalada, lblCarboidratos, lblProteinas, lblSuco, lblMinimo, lblMaximo, lblTotal, lblMedio;
    @FXML
    private Button btnSalvar, btnVoltar;
    @FXML
    private void clickSalvar(ActionEvent event){
        //Inserir funções do banco
    }
    @FXML
    private void clickVoltar(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/TelaInicial.fxml"));
        Scene scene = new Scene(root);
        Main.myStage.setScene(scene);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
