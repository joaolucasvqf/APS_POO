package controllers;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TelaConsultaResultController implements Initializable {
    
    @FXML
    private TableView tvResult;
    @FXML
    private TableColumn tcPessoas, tcPratos, tcSalada, tcCarboidrato, tcProteina, tcSuco, tcTotal, tcMedio;
    @FXML
    private Button btnVoltar;
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
