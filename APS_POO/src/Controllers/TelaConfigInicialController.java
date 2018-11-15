package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaConfigInicialController implements Initializable {
    
    @FXML
    private TextField tfPessoas, tfPratos, tfSalada, tfCarboidrato, tfProteinas, tfSucos, tfTempoMi, tfTempoMa;
    @FXML
    private Button btnSimular, btnVoltar;
    @FXML
    private void clickSimular(ActionEvent event){
        
    }
    private void clickVoltar(ActionEvent event){
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
