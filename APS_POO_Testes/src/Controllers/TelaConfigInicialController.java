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
import javafx.scene.control.TextField;

public class TelaConfigInicialController implements Initializable {
    
    @FXML
    private TextField tfPessoas, tfPratos, tfSalada, tfCarboidrato, tfProteinas, tfSucos, tfTempoMi, tfTempoMa;
    @FXML
    private Button btnSimular, btnVoltar;
    @FXML
    private void clickSimular(ActionEvent event) throws IOException{
        //Falta adicionar as funções do banco
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/TelaResultados.fxml"));
        Scene scene = new Scene(root);
        Main.myStage.setScene(scene);
    }
    @FXML
    private void clickVoltar(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/TelaInicial.fxml"));
        Scene scene = new Scene(root);
        Main.myStage.setScene(scene);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
