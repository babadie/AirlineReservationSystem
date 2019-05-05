package User_Interface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class RegisterMain extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("registerInput.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("table1.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
