package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InformationController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextArea textarea;

    @FXML
    private Label l;

    @FXML
    void backButtonPresed(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("startingwindow.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void MouseEntered(ActionEvent event) {

        String output= new String("\n");


        try {
            File myObj = new File("C:\\Users\\Anik\\IdeaProjects\\demo7\\src\\main\\resources\\com\\example\\myproject\\Information.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                output=output+data+"\n";
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        textarea.setText(output);
        // System.out.println("i am");
        // l.setVisible(true);

    }

}
