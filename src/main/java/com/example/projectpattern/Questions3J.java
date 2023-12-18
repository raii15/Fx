package com.example.projectpattern;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Questions3J {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agr1;

    @FXML
    private Button agr2;

    @FXML
    private Button agr3;

    @FXML
    private Button agr4;

    @FXML
    private Button back;

    @FXML
    private Button dis1;

    @FXML
    private Button dis2;

    @FXML
    private Button dis3;

    @FXML
    private Button dis4;

    @FXML
    private TextField email;

    @FXML
    private Button help;

    @FXML
    private Button home;

    @FXML
    private Button next;

    @FXML
    private Button setting;

    @FXML
    private Button takeTest;

    @FXML
    private Button types;

    private Stage stage1;
    Parent root;

    @FXML
    void initialize() {
        next.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("Question4.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.show();
        });
        home.setOnAction(event ->{
            try {
                root= FXMLLoader.load(getClass().getResource("Home.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.show();
        } );
        setting.setOnAction(event ->{
            try {
                root= FXMLLoader.load(getClass().getResource("Questions1.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.show();
        } );
        types.setOnAction(event ->{
            try {
                root= FXMLLoader.load(getClass().getResource("PersTypes.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.show();
        } );
        back.setOnAction(event ->{
            try {
                root= FXMLLoader.load(getClass().getResource("Questins2.fxml"));
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