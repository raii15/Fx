package com.example.projectpattern;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Questions1J {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    private TextField email;

    @FXML
    private Button help;

    @FXML
    private Button home;

    @FXML
    private Button next;

    @FXML
    private Button q1Agree;

    @FXML
    private Button q1Disagree;

    @FXML
    private Button q2Agree;

    @FXML
    private Button q2dgree;

    @FXML
    private Button q3Agree;

    @FXML
    private Button q3dgree;

    @FXML
    private Button q4Agree;

    @FXML
    private Button q4Dgree;

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
                root = FXMLLoader.load(getClass().getResource("Questins2.fxml"));
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

