package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    void ProfileClicked(ActionEvent event) throws IOException {


        root= FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void AddCashierClicked(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("AddCashier.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void CashierListClicked(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("CashierList.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void LastSupplyReceiptClicked(ActionEvent event) throws IOException {


        root= FXMLLoader.load(getClass().getResource("ProductList.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void LodOutClicked(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("startingwindow.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void additemclicked(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("AddItem.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void CashierListPressed(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("CashierList.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }




}
