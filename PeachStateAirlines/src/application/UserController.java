package application;

import java.net.URL;
import java.sql.Connection;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;


public class UserController implements Initializable {
	
	@FXML
	private TableView<User> table; 
	
	@FXML
	private TableColumn<User, String> col_firstName;
	
	@FXML
	private TableColumn<User, String> col_lastName;
	
	@FXML
	private TableColumn<User, String> col_address;
	
	@FXML
	private TableColumn<User, String> col_zipcode;
	
	@FXML
	private TableColumn<User, String> col_state;
	
	@FXML
	private TableColumn<User, String> col_username;
	
	@FXML
	private TableColumn<User, String> col_password;
	
	@FXML
	private TableColumn<User, String> col_email;
	
	@FXML
	private TableColumn<User, String> col_ssn;
	
	@FXML
	private TableColumn<User, String> col_securityQuestion;
	
	@FXML
	private TableColumn<User, String> col_answer;
	
	ObservableList<User> oblist = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		try {
			Connection con = DBConnector.getConnection();
			ResultSet rs = con.createStatement().executeQuery("select * from user");
			
			while (rs.next()) {
				oblist.add(new User(rs.getString("firstName"),
						            rs.getString("lastName"),
						            rs.getString("address"),
						            rs.getString("zipcode"),
						            rs.getString("state"),
						            rs.getString("username"),
						            rs.getString("password"),
						            rs.getString("email"),
						            rs.getString("ssn"),
						            rs.getString("securityQuestion"),
						            rs.getString("answer")));			
				}
			
			
		} catch (SQLException ex) {
			Logger.getLogger(TableController.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		col_firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		col_lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
		col_zipcode.setCellValueFactory(new PropertyValueFactory<>("zipcode"));
		col_state.setCellValueFactory(new PropertyValueFactory<>("state"));
		col_username.setCellValueFactory(new PropertyValueFactory<>("username"));
		col_password.setCellValueFactory(new PropertyValueFactory<>("password"));
		col_email.setCellValueFactory(new PropertyValueFactory<>("email"));
		col_ssn.setCellValueFactory(new PropertyValueFactory<>("ssn"));
		col_securityQuestion.setCellValueFactory(new PropertyValueFactory<>("securityQuestion"));
		col_answer.setCellValueFactory(new PropertyValueFactory<>("answer"));
		
		
		table.setItems(oblist);

		
	}

}
