package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainControl {

    @FXML
    private AnchorPane anchorPaneMain;

    @FXML
    private void createAccount() throws IOException {

        //open create account window

        AnchorPane createAccount = FXMLLoader.load(getClass().getResource("/register.fxml"));
        anchorPaneMain.getChildren().setAll(createAccount);

    }

    @FXML
    private void forgotPasswordClick() throws IOException {

        //open forgot password window

        AnchorPane forgotPassword = FXMLLoader.load(getClass().getResource("/forgot.fxml"));
        anchorPaneMain.getChildren().setAll(forgotPassword);

    }

    @FXML
    static TextField mainUsernameInput;
    @FXML
    static PasswordField mainPasswordInput;

    @FXML
    private void userLogInClick() {

        try {

            if (verifyUsernamePassword(mainUsernameInput, mainPasswordInput)) {

                AnchorPane flightWindow = FXMLLoader.load(getClass().getResource("/flight.fxml"));
                anchorPaneMain.getChildren().setAll(flightWindow);

            } else {

                AnchorPane invalid = FXMLLoader.load(getClass().getResource("/invalid.fxml"));
                anchorPaneMain.getChildren().setAll(invalid);

            }

        } catch (Exception e){

            e.printStackTrace();

        }

    }


    private static boolean verifyUsernamePassword(TextField username, PasswordField password) throws Exception {

        try {

            Connection myConn = getDBConnection();
            String sql = "SELECT `username`,`pass` FROM `flightAppUser` where `username`= ? and `pass` = ?";
            PreparedStatement myStmt = myConn.prepareStatement(sql);

            myStmt.setString(1, username.getText());
            myStmt.setString(2, password.getText());

            ResultSet rs = myStmt.executeQuery();

            String dbUsername = username.getText();
            String dbPassword = password.getText();

            if(rs.next()) {
                if (dbUsername.equals(rs.getString(1))){
                    if (dbPassword.equals(rs.getString(2))) {
                        return true;
                    }
                    else
                        return false;
                }
                else
                    return false;
            } else
                return false;


        } catch (SQLException ex){

            ex.printStackTrace();
            return false;
        }

    }

    private static Connection getDBConnection() throws Exception {

        String databaseURL = "jdbc:mysql://localhost:3306/flight_app";
        String databaseUsername = "root";
        String databasePassword = "1234abcd";
        return DriverManager.getConnection(databaseURL,databaseUsername, databasePassword);

    }
}