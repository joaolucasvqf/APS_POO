package interfaces;

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

public class TelaInicialController implements Initializable {

    @FXML
    private Button btnIniciar;
    @FXML
    private Button btnResult;
    @FXML
    private void clickIniciar(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/TelaConfigInicial.fxml"));
        Scene scene = new Scene(root);
        Main.myStage.setScene(scene);
    }
    @FXML
    private void clickResult(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/TelaConsultaResult.fxml"));
        Scene scene = new Scene(root);
        Main.myStage.setScene(scene);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
