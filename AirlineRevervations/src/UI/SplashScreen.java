package UI; 

import java.io.File;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.image.*;


public class SplashScreen extends Application {
	public static void main(String[] args) {
		System.out.println("Launching JavaFX");
		launch(args);
		System.out.println("Finished");

	}
	
	
	
	@Override 
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Hello World");
	    BorderPane root = new BorderPane();
	    root.setPadding(new Insets(10,10,10,10));
	    Scene scene = new Scene(root, 600, 550);

	    File file = new File("/Users/benitoabadie/Eclipse Workspace/AirlineReservationProject/AirlineReservationSystem/AirlineRevervations/travel.jpg");
	    Image image = new Image(file.toURI().toString());
	    ImageView iv = new ImageView(image);
	    iv.setFitHeight(500);
	    iv.setFitWidth(500);
	    Text tx = new Text("Welcome to Cheap Travel...");
	    tx.setFont(new Font("Times New Roman", 20));
	    root.setBottom(tx);
	    
	    

	    root.getChildren().addAll(iv);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
	

}
