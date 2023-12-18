package com.example.projectpattern;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Hyperlink forgotpass;

    @FXML
    private ImageView image;

    @FXML
    private Button loginBut;

    @FXML
    private PasswordField password;

    @FXML
    private Button registerBut;

    @FXML
    private CheckBox rememberMe;

    @FXML
    private TextField user;
    private Stage stage1;
    Parent root;

    @FXML
    void initialize()  {
        registerBut.setOnAction(event ->{
            try {
                root= FXMLLoader.load(getClass().getResource("SignInUp.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.show();
        } );
        loginBut.setOnAction(event ->{
            try {
                root= FXMLLoader.load(getClass().getResource("AfterLog.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.show();
        } );
    }

}
