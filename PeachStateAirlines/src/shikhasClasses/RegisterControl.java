package shikhasClasses;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterControl {

    @FXML
    Button mainMenu;
    @FXML
    AnchorPane anchorPaneRegister;
    @FXML
    TextField firstNameInput, lastNameInput,addressInput,zipInput,stateInput,usernameInput,questionInput,answerInput,ssnInput,passwordInput;

    @FXML
    public void mainMenuClick() throws IOException {

        AnchorPane mainMenu = FXMLLoader.load(getClass().getResource("/main.fxml"));
        anchorPaneRegister.getChildren().setAll(mainMenu);

    }

    @FXML
    public void registerButtonClick() {

        String databaseURL = "jdbc:mysql://localhost:3306/flight_app?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String databaseUsername = "root";
        String databasePassword = "1234abcd";
        String sql = "insert into `createAccount` (`firstName`, `lastName`, `address`, `zipcode`, `state`, `username`, `pass`, `ssn`, `question`, `answer`)"
                + "values (?,?,?,?,?,?,?,?,?,?)";
        try {

            Connection myConn = DriverManager.getConnection(databaseURL,databaseUsername, databasePassword);
            PreparedStatement myStmt = myConn.prepareStatement(sql);

            //set parameter values
            myStmt.setString(1, firstNameInput.getText());
            myStmt.setString(2, lastNameInput.getText());
            myStmt.setString(3, addressInput.getText());
            myStmt.setString(4, zipInput.getText());
            myStmt.setString(5, stateInput.getText());
            myStmt.setString(6, usernameInput.getText());
            myStmt.setString(7, passwordInput.getText());
            myStmt.setString(8, ssnInput.getText());
            myStmt.setString(9, questionInput.getText());
            myStmt.setString(10, answerInput.getText());

            //execute query
            myStmt.executeUpdate();

            //show new page with login button


        }

        catch (Exception ex) {

            ex.printStackTrace();

        }

    }
}
