package aps_poo;

import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static Scene SCENE;
    public static Stage myStage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/TelaInicial.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        myStage = stage;
        stage.show();
    }
    
    
    public static void main(String[] args)  throws ClassNotFoundException,
InstantiationException, IllegalAccessException, SQLException {
        DAO connection = new DAO();
        
        launch(args);
    }       
}
