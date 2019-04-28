package UI;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class RegistrationWindow extends Application {
	
	public static void main(String[] args) {
		
		launch(args); 
		
	}
	
	Button registerButton;
	Label firstName, lastName, address, zipcode, state, username, password, ssn, securityQuestion, securityAnswer; 
	TextField fnInput, lnInput, addressInput, zipInput, stateInput, userInput, questionInput, answerInput; 
	PasswordField passwordInput, ssnInput;  
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		registerButton = new Button("Create Account"); 
		firstName = new Label("First Name: "); 
		fnInput = new TextField(); 
		lastName = new Label("Last Name: "); 
		lnInput = new TextField(); 
		address = new Label("Address: ");
		addressInput = new TextField(); 
		zipcode = new Label("Zipcode: ");
		zipInput = new TextField(); 
		state = new Label("State: "); 
		stateInput = new TextField(); 
		username = new Label("Username: "); 
		userInput = new TextField(); 
		password = new Label("Password: "); 
		passwordInput = new PasswordField(); 
		ssn = new Label("Social Security Number: "); 
		ssnInput = new PasswordField(); 
		ssnInput.setPromptText("xxx-xx-xxxx"); 
		securityQuestion = new Label("Security Question: ");
		questionInput = new TextField(); 
		securityAnswer = new Label("Answer to Security Question: "); 
		answerInput = new TextField(); 

		GridPane layout = new GridPane();
		layout.setPadding(new Insets(30,30,15,30));
		layout.setVgap(15);
		layout.setHgap(12);
		
		GridPane.setConstraints(firstName, 1, 0);
		GridPane.setConstraints(fnInput, 2, 0);
		GridPane.setConstraints(lastName, 1, 1);
		GridPane.setConstraints(lnInput, 2, 1);
		GridPane.setConstraints(address, 1, 2);
		GridPane.setConstraints(addressInput, 2, 2);
		GridPane.setConstraints(zipcode, 1, 3);
		GridPane.setConstraints(zipInput, 2, 3);
		GridPane.setConstraints(state, 1, 4);
		GridPane.setConstraints(stateInput, 2, 4);
		GridPane.setConstraints(username, 1, 5);
		GridPane.setConstraints(userInput, 2, 5);
		GridPane.setConstraints(password, 1, 6);
		GridPane.setConstraints(passwordInput, 2, 6);
		GridPane.setConstraints(ssn, 1, 7);
		GridPane.setConstraints(ssnInput, 2, 7);
		GridPane.setConstraints(securityQuestion, 1, 8);
		GridPane.setConstraints(questionInput, 2, 8);
		GridPane.setConstraints(securityAnswer, 1, 9);
		GridPane.setConstraints(answerInput, 2, 9);
		
		layout.getChildren().addAll(firstName, fnInput, lastName, lnInput, address, addressInput, zipcode, zipInput,
				state, stateInput, username, userInput, password, passwordInput, ssn, ssnInput, securityQuestion, questionInput, securityAnswer, answerInput);
		layout.setAlignment(Pos.BASELINE_CENTER);
		
		HBox buttonMenu = new HBox(15); 
		buttonMenu.getChildren().add(registerButton);
		buttonMenu.setAlignment(Pos.BASELINE_CENTER);
		buttonMenu.setPadding(new Insets(5, 15, 30, 15));
		
		BorderPane borderPane = new BorderPane(); 
		borderPane.setCenter(layout);
		borderPane.setBottom(buttonMenu);
		
		Scene scene = new Scene(borderPane,500,530); 

		primaryStage.setTitle("Create Account");
		primaryStage.setScene(scene); 
		primaryStage.show();
		
		// after user clicks create account
		StackPane layout2 = new StackPane(); 
		Label accCreated = new Label("Account Created!");
		Button login = new Button("Login"); 
		layout2.getChildren().addAll(accCreated, login); 
		Scene scene2 = new Scene(layout2,300,300); 
		
		registerButton.setOnAction(e -> {
			
			if (validateZip(zipInput, zipInput.getText()) && validateState(stateInput, stateInput.getText()) && 
					validateSSN(ssnInput, ssnInput.getText())) {
				registerButtonClick() ;
				primaryStage.setScene(scene2);
			}
			else {
				
				Stage invalidInput = new Stage(); 

				invalidInput.initModality(Modality.APPLICATION_MODAL); 
				invalidInput.setTitle("Invalid Input");
				
				Label label = new Label("Please input a valid state, zipcode, and social security number"); 
				
				VBox invalidInputLayout = new VBox(10); 
				invalidInputLayout.getChildren().addAll(label); 
				invalidInputLayout.setAlignment(Pos.CENTER); 
				
				Scene invalidInputScene = new Scene(invalidInputLayout,500,300); 
				invalidInput.setScene(invalidInputScene); 
				invalidInput.showAndWait(); 
				
			}
		});
			
	}
	
	private boolean validateZip(TextField input, String message) {
		
		if (input.getLength() != 5) 
			return false; 
		
		try {
			
			Integer.parseInt(input.getText()); 
			return true; 
			
		} catch (NumberFormatException e) {
			
			return false; 
			
		}
		
	}
	
	private boolean validateState(TextField input, String message) {
		
		if (input.getLength() == 2) {
			for (int i = 0; i < 2; i++) {
				if (Character.isLetter(input.getText().charAt(i)) == false)
					return false; 
			}
			return true; 
		}
		
		else 
			return false; 
		
	}
	
	private boolean validateSSN(TextField input, String message) {
		
		if (input.getText().matches("^(\\d{3}-?\\d{2}-?\\d{4})$"))
			return true; 
		else 
			return false; 

	}
	
	private void registerButtonClick() {
		
		String databaseURL = "jdbc:mysql://localhost:3306/flight_app?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String databaseUsername = "root";
		String databasePassword = "1234abcd";
		String sql = "insert into `flightAppUser` (`firstName`, `lastName`, `address`, `zipcode`, `state`, `username`, `pass`, `ssn`, `question`, `answer`)" 
					+ "values (?,?,?,?,?,?,?,?,?,?)"; 
		
		try {
			
			Connection myConn = DriverManager.getConnection(databaseURL,databaseUsername, databasePassword);
			PreparedStatement myStmt = myConn.prepareStatement(sql); 
			
			//set parameter values 
			myStmt.setString(1, fnInput.getText());
			myStmt.setString(2, lnInput.getText());
			myStmt.setString(3, addressInput.getText());
			myStmt.setString(4, zipInput.getText());
			myStmt.setString(5, stateInput.getText());
			myStmt.setString(6, userInput.getText());
			myStmt.setString(7, passwordInput.getText());
			myStmt.setString(8, ssnInput.getText());
			myStmt.setString(9, questionInput.getText());
			myStmt.setString(10, answerInput.getText());
			
			//execute query 
			myStmt.executeUpdate(); 
			
		}
		
		catch (Exception ex) {
			
			ex.printStackTrace();
			
		}
		
	}

}
