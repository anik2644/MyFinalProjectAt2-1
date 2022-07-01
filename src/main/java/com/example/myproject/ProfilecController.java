package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfilecController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    String gettext;
    int op=0,ok1=0;


    @FXML
    private Button okbutton;


    @FXML
    private Label Name;

    @FXML
    private Label Set;

    @FXML
    private Label mylabel;


    @FXML
    private TextField TextField;

    @FXML
    void BackCLicked(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("CashierDashboard.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    @FXML
    void MouseEntered(MouseEvent event) {
        String name= Dataclasss.User.get(0).name;
        if(Dataclasss.CurrentCashierUser==1)
        {
            name=Dataclasss.User.get(0).name;
        }
        else if(Dataclasss.CurrentCashierUser==2)
        {
            name=Dataclasss.User.get(1).name;
        }
        else if(Dataclasss.CurrentCashierUser==3)
        {
            name=Dataclasss.User.get(2).name;
        }
       // System.out.println("i am");

        Name.setText(name);
        Name.setVisible(true);

    }

    @FXML
    void ChangeNameClicked(ActionEvent event) {
        op=1;
        Set.setText("New Name");
        TextField.setVisible(true);
        Set.setVisible(true);
        okbutton.setVisible(true);
      //  gettext= TextField.getText();
    }

    @FXML
    void ChangePassClicked(ActionEvent event) {

        op=2;
        Set.setText("New Password");
        TextField.setVisible(true);
        Set.setVisible(true);
        okbutton.setVisible(true);
      //  gettext= TextField.getText();


    }

    @FXML
    void OkClicked(ActionEvent event) {
        String name;
        ok1++;
       // System.out.println(ok1);
        if(ok1==1) {
            if (op == 1) {

                gettext = TextField.getText();
               //  System.out.println(gettext);
                if(Dataclasss.CurrentCashierUser==1)
                {
                    Dataclasss.User.get(0).name=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==2)
                {
                    Dataclasss.User.get(1).name=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==3)
                {
                    Dataclasss.User.get(2).name=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==4)
                {
                    Dataclasss.User.get(3).name=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==5)
                {
                    Dataclasss.User.get(4).name=gettext;
                }
            } else if (op == 2) {
                gettext = TextField.getText();
                //System.out.println(gettext);
              //  Dataclasss.User1 = gettext;
                if(Dataclasss.CurrentCashierUser==1)
                {
                    Dataclasss.User.get(0).password=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==2)
                {
                    Dataclasss.User.get(1).password=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==3)
                {
                    Dataclasss.User.get(2).password=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==4)
                {
                    Dataclasss.User.get(3).password=gettext;
                }
                else if(Dataclasss.CurrentCashierUser==5)
                {
                    Dataclasss.User.get(4).password=gettext;
                }

            }
        }
       else if(ok1==2)
        {

            TextField.setVisible(false);
            Set.setVisible(false);
            mylabel.setText("Updated");
            mylabel.setVisible(true);
        }
        else if(ok1>2)
        {

            TextField.setVisible(false);
            Set.setVisible(false);
            //mylabel.setText("Updated");
            mylabel.setVisible(false);
            okbutton.setVisible(false);
        }


    }


}
