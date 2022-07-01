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

public class ProductListController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Label l;

    @FXML
    void BackClicked(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("adminDashboard.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ProductClicked(ActionEvent event) {

        String Show,output= new String("\n");
        int i = 0;
        while (i < Dataclasss.Items.size()) {
            Show=Dataclasss.Items.get(i).Itemname + "   " + Dataclasss.Items.get(i).Itemquantaty + "   " + Dataclasss.Items.get(i).Itemprice;
            output=Show+"\n"+output;
            i++;

        }

        l.setText(output);

    }
}
