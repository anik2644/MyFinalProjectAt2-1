package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CashierListController {


    int usr=0;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label c1;

    @FXML
    private Label c2;

    @FXML
    private Label c3;

    @FXML
    private Label c4;

    @FXML
    private Label c5;

    @FXML
    void BackClicked(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("adminDashboard.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void NameClickeed(ActionEvent event) {

        int check= Dataclasss.User.size();
        if(check>0)
        c1.setText(Dataclasss.User.get(0).name);
        if(check>1)
        c2.setText(Dataclasss.User.get(1).name);
        if(check>2)
        c3.setText(Dataclasss.User.get(2).name);
        if(check>3)
        c4.setText(Dataclasss.User.get(3).name);
        if(check>4)
        c5.setText(Dataclasss.User.get(4).name);

    }

}
