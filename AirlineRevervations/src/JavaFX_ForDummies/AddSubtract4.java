package JavaFX_ForDummies;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract4 extends Application  {

	public static void main(String[] args) {
		launch(args);
	}
	
	Button btnAdd;  
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;
	
	@Override 
	public void start(Stage primaryStage) {
		
		// Create a ClickHandler instance
		
		//Create the Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(e -> 
		{
			iCounter++;
			lbl.setText(Integer.toString(iCounter));	
		});
		
		//Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");				
		btnSubtract.setOnAction(e -> 
		{
			iCounter--;
			lbl.setText(Integer.toString(iCounter));	
		});
		
		//Create the label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
		
		// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
		
		//Add the layout pane to a scene
		Scene scene = new Scene(pane, 300, 250);
		
		//Finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
		}
	}





