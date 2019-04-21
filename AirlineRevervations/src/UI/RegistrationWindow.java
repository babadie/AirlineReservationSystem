package UI;

import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.layout.GridPane;


public class RegistrationWindow extends Application {
	
	public static void main(String[] args) {
		
		launch(args); 
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button registerButton = new Button("Create Account"); 
		Label firstName = new Label("First Name"); 
		TextField fnInput = new TextField(); 
		Label lastName = new Label("Last Name"); 
		TextField lnInput = new TextField(); 
		Label address = new Label("Address");
		TextField addressInput = new TextField(); 
		Label zipcode = new Label("Zipcode");
		TextField zipInput = new TextField(); 
		Label state = new Label("State"); 
		TextField stateInput = new TextField(); 
		Label username = new Label("Username"); 
		TextField userInput = new TextField(); 
		Label ssn = new Label("Social Security Number"); 
		TextField ssnInput = new TextField(); 
		Label securityQuestion = new Label("Security Question");
		TextField questionInput = new TextField(); 
		Label securityAnswer = new Label("Answer to Security Question"); 
		TextField answerInput = new TextField(); 

		GridPane layout = new GridPane();
		layout.setPadding(new Insets(10,10,10,10));
		layout.setVgap(8);
		layout.setHgap(10);
		
		GridPane.setConstraints(firstName, 0, 0);
		GridPane.setConstraints(fnInput, 1, 0);
		GridPane.setConstraints(lastName, 0, 1);
		GridPane.setConstraints(lnInput, 1, 1);
		GridPane.setConstraints(address, 0, 2);
		GridPane.setConstraints(addressInput, 1, 2);
		GridPane.setConstraints(zipcode, 0, 3);
		GridPane.setConstraints(zipInput, 1, 3);
		GridPane.setConstraints(state, 0, 4);
		GridPane.setConstraints(stateInput, 1, 4);
		GridPane.setConstraints(username, 0, 5);
		GridPane.setConstraints(userInput, 1, 5);
		GridPane.setConstraints(ssn, 0, 6);
		GridPane.setConstraints(ssnInput, 1, 6);
		GridPane.setConstraints(securityQuestion, 0, 7);
		GridPane.setConstraints(questionInput, 1, 7);
		GridPane.setConstraints(securityAnswer, 0, 8);
		GridPane.setConstraints(answerInput, 1, 8);
		GridPane.setConstraints(registerButton, 0, 9); 
		
		layout.getChildren().addAll(firstName, fnInput, lastName, lnInput, address, addressInput, zipcode, zipInput,
				state, stateInput, username, userInput, ssn, ssnInput, securityQuestion, questionInput, securityAnswer, answerInput,
				registerButton);
		
		Scene scene = new Scene(layout,700,700); 

		primaryStage.setTitle("Create Account");
		primaryStage.setScene(scene); 
		primaryStage.show();
			
	}
	
	

}
