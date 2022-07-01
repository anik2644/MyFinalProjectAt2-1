package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class ChangePasswordController {


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField passwordbar;

    @FXML
    void BackClicked(ActionEvent event) throws IOException {


        root= FXMLLoader.load(getClass().getResource("adminDashboard.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void DoneClicked(ActionEvent event) throws IOException {

        Dataclasss.adminpassword=passwordbar.getText();

        root= FXMLLoader.load(getClass().getResource("adminDashboard.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
