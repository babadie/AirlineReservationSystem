package UI; 

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginWindow extends Application {
	
	Button userLogin, adminLogin, createAccount, forgotPassword; 
	Label username, password; 
	TextField usernameInput; 
	PasswordField passwordInput; 
	GridPane layout; 
	Scene scene; 
	
	public static void main(String[] args) {
		
		launch(args); 
		
	}

	@Override
	public void start(Stage window) throws Exception {
		
		window.setTitle("Main Menu");
		
		username = new Label("Username: "); 
		password = new Label("Password: "); 
		usernameInput = new TextField(); 
		passwordInput = new PasswordField(); 
		userLogin = new Button("User Login");
		adminLogin = new Button("Admin Login"); 
		createAccount = new Button("Create Account"); 
		forgotPassword = new Button("Forgot Password?"); 
		createAccount.setOnAction(e -> {
			
			RegistrationWindow rw = new RegistrationWindow(); 
			Stage registrationStage = new Stage(); 
			try {
				
				rw.start(registrationStage); 
				registrationStage.show(); 
				
			} catch (Exception e2) {
				
				e2.printStackTrace();
				
			}
		}); 	
		
		layout = new GridPane(); 
		layout.setPadding(new Insets(30,30,10,30));
		layout.setVgap(30);
		layout.setHgap(30);
		layout.setAlignment(Pos.BASELINE_CENTER);
		GridPane.setConstraints(username, 0, 0);
		GridPane.setConstraints(usernameInput, 1, 0);
		GridPane.setConstraints(password, 0, 1);
		GridPane.setConstraints(passwordInput, 1, 1);

		layout.getChildren().addAll(username, usernameInput, password, 
				passwordInput);
		
		HBox buttonMenu = new HBox(15); 
		buttonMenu.getChildren().addAll(userLogin, adminLogin, createAccount, forgotPassword);
		buttonMenu.setAlignment(Pos.BASELINE_CENTER);
		buttonMenu.setPadding(new Insets(10,30,50,30));
		
		BorderPane borderPane = new BorderPane(); 
		borderPane.setCenter(layout); 
		borderPane.setBottom(buttonMenu);
		
		scene = new Scene(borderPane, 550, 250); 
		window.setScene(scene); 
		window.show();

	}

}