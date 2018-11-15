package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private void clickVoltar(ActionEvent event){
        
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
