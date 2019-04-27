package UI;

import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.layout.GridPane;


public class UserLoginPage extends Application {
	
	public static void main(String[] args) {
		
		launch(args); 
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button LoginButton = new Button("Login"); 
		Label UserName = new Label("Username"); 
		TextField fnInput = new TextField(); 
		Label Password = new Label("Password"); 
		TextField lnInput = new TextField(); 
		
		

		GridPane layout = new GridPane();
		layout.setPadding(new Insets(10,10,10,10));
		layout.setVgap(8);
		layout.setHgap(10);
		
		GridPane.setConstraints(UserName, 0, 0);
		GridPane.setConstraints(fnInput, 1, 0);
		GridPane.setConstraints(Password, 0, 1);
		GridPane.setConstraints(lnInput, 1, 1);
		
		GridPane.setConstraints(LoginButton, 0, 9); 
		
		layout.getChildren().addAll(UserName, fnInput, Password, lnInput,
				
				LoginButton);
		
		Scene scene = new Scene(layout,700,700); 

		primaryStage.setTitle("Login");
		primaryStage.setScene(scene); 
		primaryStage.show();
			
	}
	
	

}
