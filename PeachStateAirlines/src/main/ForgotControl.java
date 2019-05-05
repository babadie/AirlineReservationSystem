package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ForgotControl {

    String databaseURL = "jdbc:mysql://localhost:3306/myFlightApp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String databaseUsername = "root";
    String databasePassword = "1234abcd";

    @FXML
    Button mainMenu;
    @FXML
    AnchorPane anchorPaneForgot;
    @FXML
    public void mainMenuClick() throws IOException {

        AnchorPane mainMenu = FXMLLoader.load(getClass().getResource("/main.fxml"));
        anchorPaneForgot.getChildren().setAll(mainMenu);

    }

    @FXML
    public void submitForgotPassword() {

        String databaseURL = "jdbc:mysql://localhost:3306/myFlightApp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String databaseUsername = "root";
        String databasePassword = "1234abcd";
        String sql = "SELECT `pass` from `createAccount` where ";

        try {

            Connection myConn = DriverManager.getConnection(databaseURL,databaseUsername, databasePassword);
            PreparedStatement myStmt = myConn.prepareStatement(sql);

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

}
