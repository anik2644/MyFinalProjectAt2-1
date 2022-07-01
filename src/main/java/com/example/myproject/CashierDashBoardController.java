package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CashierDashBoardController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private int flag=-1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;


    @FXML
    private TextArea textarea;

    @FXML
    void met(ActionEvent event) {
        int i,n;
        int quantity,price;
        String date,show;
        n=Sold.sol.size();

        if(n==1)
        {
            quantity=Sold.sol.get(0).totalproduct;
            price=Sold.sol.get(0).totalocost;
            date=Sold.sol.get(0).date;

            show= date+"   "+quantity+"   "+price;
            l1.setText(show);

        }
        if(n==2)
        {
            quantity=Sold.sol.get(0).totalproduct;
            price=Sold.sol.get(0).totalocost;
            date=Sold.sol.get(0).date;

            show= date+"   "+quantity+"   "+price;
            l1.setText(show);



            quantity=Sold.sol.get(1).totalproduct;
            price=Sold.sol.get(1).totalocost;
            date=Sold.sol.get(1).date;

            show= date+"   "+quantity+"   "+price;
            l2.setText(show);

        }

        if(n==3)
        {
            quantity=Sold.sol.get(0).totalproduct;
            price=Sold.sol.get(0).totalocost;
            date=Sold.sol.get(0).date;

            show= date+"   "+quantity+"   "+price;
            l1.setText(show);



            quantity=Sold.sol.get(1).totalproduct;
            price=Sold.sol.get(1).totalocost;
            date=Sold.sol.get(1).date;

            show= date+"   "+quantity+"   "+price;
            l2.setText(show);



            quantity=Sold.sol.get(2).totalproduct;
            price=Sold.sol.get(2).totalocost;
            date=Sold.sol.get(2).date;

            show= date+"   "+quantity+"   "+price;
            l3.setText(show);

        }

        if(n>3)
        {
            n--;
            quantity=Sold.sol.get(n-0).totalproduct;
            price=Sold.sol.get(n-0).totalocost;
            date=Sold.sol.get(n-0).date;

            show= date+"   "+quantity+"   "+price;
            l1.setText(show);



            quantity=Sold.sol.get(n-1).totalproduct;
            price=Sold.sol.get(n-1).totalocost;
            date=Sold.sol.get(n-1).date;

            show= date+"   "+quantity+"   "+price;
            l2.setText(show);



            quantity=Sold.sol.get(n-2).totalproduct;
            price=Sold.sol.get(n-2).totalocost;
            date=Sold.sol.get(n-2).date;

            show= date+"   "+quantity+"   "+price;
            l3.setText(show);



            quantity=Sold.sol.get(n-3).totalproduct;
            price=Sold.sol.get(n-3).totalocost;
            date=Sold.sol.get(n-3).date;

            show= date+"   "+quantity+"   "+price;
            l4.setText(show);

        }
    }
    @FXML
    void backbuttonpressed(ActionEvent event) throws IOException {


        if(StartingWindowController.flag==1)
        {

            root= FXMLLoader.load(getClass().getResource("admin_user_selection.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene= new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        else
        {
            root= FXMLLoader.load(getClass().getResource("cashier_user_selection.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene= new Scene(root);
            stage.setScene(scene);
            stage.show();

        }


    }
    @FXML
    void profileButtonclicked(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("profile.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void riceptButtonClick(ActionEvent event) throws IOException {

       // Sold.SetItems();

        root= FXMLLoader.load(getClass().getResource("receipt.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    @FXML
    void lastreceiptClicked(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("Sellmemo.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }



    @FXML
    void logoutpressed(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("startingwindow.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
