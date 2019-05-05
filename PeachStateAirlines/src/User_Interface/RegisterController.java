package User_Interface;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;


public class RegisterController implements Initializable {
	
    TextField firstName, lastName,address,zipcode,state,username,password,email,ssn,securityQuestion, answer;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		try {
			Connection con = DBConnector.getConnection();
			//ResultSet rs = con.createStatement().executeQuery("select * from data");
			
			String sql = "insert into `createAccount` (`firstName`, `lastName`, `address`, `zipcode`, `state`, `username`, `password`, `email`, `ssn`, `securityQuestion`, `answer`)"
		                + "values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement myStmt = con.prepareStatement(sql);
			
			
			//set parameter values
            myStmt.setString(1, firstName.getText());
            myStmt.setString(2, lastName.getText());
            myStmt.setString(3, address.getText());
            myStmt.setString(4, zipcode.getText());
            myStmt.setString(5, state.getText());
            myStmt.setString(6, username.getText());
            myStmt.setString(7, password.getText());
            myStmt.setString(8, email.getText());
            myStmt.setString(9, ssn.getText());
            myStmt.setString(10, securityQuestion.getText());
            myStmt.setString(11, answer.getText());

            //execute query
            myStmt.executeUpdate();

            //show new page with login button
			
			
			
			
			
		} catch (Exception ex) {

            ex.printStackTrace();

        }
	}
}

