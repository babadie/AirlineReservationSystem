package JavaFX_ForDummies;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class ClickMe extends Application {
	public static void main(String[] args) {
		System.out.println("Launching JavaFX");
		launch(args);
		System.out.println("Finished");

	}
	
	Button btn;
	Label lbl;
	int iClickCount = 0;
	
	@Override 
	public void start(Stage primaryStage) {
		
		//Create a button
		btn = new Button();
		btn.setText("Click me please!");
		btn.setOnAction(e -> buttonClick());
		
		//Create the label
		lbl = new Label();
		lbl.setText("You have not clicked the button yet");
		
		//Add the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setTop(lbl);
		pane.setCenter(btn);
		
		//Add the layout pane to a scene
		Scene scene = new Scene(pane, 300, 250);
		
		//Finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		primaryStage.show();
	}
	
	public void buttonClick() {
		
		iClickCount++;
		if (iClickCount == 1) {
			
			lbl.setText("You have clicked once");
		}
		else {
			
			lbl.setText("You have clicked " + iClickCount + " times" );
		}
	}

}
