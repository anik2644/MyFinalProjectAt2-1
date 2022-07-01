package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Vector;

public class ReceiptController {

    /*@FXML
    void BackButtonPressed(ActionEvent event) {

    }
*/

    static Vector<Sold> vec = new Vector<Sold>();
    static Vector<Sold> vec2 = new Vector<Sold>();
    //static Vector<vec> vec3 = new Vector<vec>();


    int count = 0, total = 0, temp = 0, current_product_price = 0, quantity, price, totalprice;
    String date, Seller_Name, currentproductname, name;
    int flag = 0;
    int ff = 0;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField d1;
    @FXML
    private TextField d2;
    @FXML
    private TextField d3;
    @FXML
    private TextField d4;
    @FXML
    private TextField d5;
    @FXML
    private TextField d6;
    @FXML
    private TextArea from;
    @FXML
    private TextField q1;
    @FXML
    private TextField q2;
    @FXML
    private TextField q3;
    @FXML
    private TextField q4;
    @FXML
    private TextField q5;
    @FXML
    private TextField q6;
    @FXML
    private Label t1;
    @FXML
    private Label t2;
    @FXML
    private Label t3;
    @FXML
    private Label t4;
    @FXML
    private Label t5;
    @FXML
    private Label t6;
    @FXML
    private TextArea to;
    @FXML
    private Label u1;
    @FXML
    private Label u2;
    @FXML
    private Label u3;
    @FXML
    private Label u4;
    @FXML
    private Label u5;
    @FXML
    private Label u6;

    @FXML
    void CreateClicked(ActionEvent event) throws IOException {


        count++;

        if (count == 1) {
            ReceiptController.vec.clear();


            currentproductname = d1.getText();

            if (currentproductname.isEmpty()) {

                ff = 1;
            } else {
                date = from.getText();
                int i = 0;
                flag = 0;
                while (i < Dataclasss.Items.size()) {
                    if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                        current_product_price = Dataclasss.Items.get(i).Itemprice;
                        Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q1.getText());
                        if(Dataclasss.Items.get(i).Itemquantaty<0)
                        {
                            Dataclasss.Items.get(i).Itemquantaty=0;
                        }


                        flag = 1;
                        break;
                    }
                    i++;
                }
                if (flag == 0) {
                    current_product_price = 0;
                }

                // System.out.println("done");


                temp = current_product_price * Integer.parseInt(q1.getText());
                t1.setText(Integer.toString(temp));
                t1.setVisible(true);
                u1.setText(Integer.toString(current_product_price));
                u1.setVisible(true);

                name = currentproductname;
                quantity = Integer.parseInt(q1.getText());
                price = current_product_price;
                totalprice = temp;
            }

        } else if (count == 2) {


            currentproductname = d2.getText();
            if (currentproductname.isEmpty()) {

                ff = 1;
            } else {
                int i = 0;
                flag = 0;
                while (i < Dataclasss.Items.size()) {
                    if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                        current_product_price = Dataclasss.Items.get(i).Itemprice;
                        Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q2.getText());
                        if(Dataclasss.Items.get(i).Itemquantaty<0)
                        {
                            Dataclasss.Items.get(i).Itemquantaty=0;
                        }


                        flag = 1;
                        break;
                    }
                    i++;
                }
                if (flag == 0) {
                    current_product_price = 0;
                }

                // System.out.println("done");


                temp = current_product_price * Integer.parseInt(q2.getText());
                t2.setText(Integer.toString(temp));
                t2.setVisible(true);
                u2.setText(Integer.toString(current_product_price));
                u2.setVisible(true);

                name = currentproductname;
                quantity = Integer.parseInt(q2.getText());
                price = current_product_price;
                totalprice = temp;
            }

        } else if (count == 3) {

            currentproductname = d3.getText();

            if (currentproductname.isEmpty()) {

                ff = 1;
            } else {
                name = currentproductname;
                int i = 0;
                flag = 0;
                while (i < Dataclasss.Items.size()) {
                    if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                        current_product_price = Dataclasss.Items.get(i).Itemprice;
                        Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q3.getText());
                        if(Dataclasss.Items.get(i).Itemquantaty<0)
                        {
                            Dataclasss.Items.get(i).Itemquantaty=0;
                        }

                        flag = 1;
                        break;
                    }
                    i++;
                }
                if (flag == 0) {
                    current_product_price = 0;
                }


                temp = current_product_price * Integer.parseInt(q3.getText());
                t3.setText(Integer.toString(temp));
                t3.setVisible(true);
                u3.setText(Integer.toString(current_product_price));
                u3.setVisible(true);


                name = currentproductname;
                quantity = Integer.parseInt(q3.getText());
                price = current_product_price;
                totalprice = temp;

                //d3.setVisible(true);
                // q3.setVisible(true);
            }
        } else if (count == 4) {


            currentproductname = d4.getText();
            if (currentproductname.isEmpty()) {


                ff = 1;

            } else {
                name = currentproductname;
                int i = 0;
                flag = 0;
                while (i < Dataclasss.Items.size()) {
                    if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                        current_product_price = Dataclasss.Items.get(i).Itemprice;
                        Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q4.getText());
                        if(Dataclasss.Items.get(i).Itemquantaty<0)
                        {
                            Dataclasss.Items.get(i).Itemquantaty=0;
                        }


                        flag = 1;
                        break;
                    }
                    i++;
                }
                if (flag == 0) {
                    current_product_price = 0;
                }


                temp = current_product_price * Integer.parseInt(q4.getText());
                t4.setText(Integer.toString(temp));
                t4.setVisible(true);
                u4.setText(Integer.toString(current_product_price));
                u4.setVisible(true);


                name = currentproductname;
                quantity = Integer.parseInt(q3.getText());
                price = current_product_price;
                totalprice = temp;

                //d3.setVisible(true);
                // q3.setVisible(true);
            }
        }

        if (ff == 0) {
            Sold myobj = new Sold(name, quantity, price, totalprice);


            ReceiptController.vec.add(myobj);
        }
        //ReceiptController.vec2=ReceiptController.vec;
/*
        int k=0;
        System.out.println("pr");
        while (k<ReceiptController.vec.size())
        {
            System.out.println(ReceiptController.vec2.get(k).name);
            k++;

        }
        System.out.println("pr");
*/
        //  System.out.println("donme");

        int i = 0;
        total = 0;
        while (i < ReceiptController.vec.size()) {
            total = total + ReceiptController.vec.get(i).total_price;
            i++;
        }
        Sold.totalnumberofsoldelemewnt = i;
        Purches obj = new Purches(date, i, total);
        Sold.sol.add(obj);


        root = FXMLLoader.load(getClass().getResource("Sellmemo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void MoreClicked(ActionEvent event) {
        count++;
        if (count == 1) {

            ReceiptController.vec.clear();
            currentproductname = d1.getText();

            int i = 0;
            flag = 0;
            while (i < Dataclasss.Items.size()) {
                if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                    current_product_price = Dataclasss.Items.get(i).Itemprice;
                    Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q1.getText());
                    if(Dataclasss.Items.get(i).Itemquantaty<0)
                    {
                        Dataclasss.Items.get(i).Itemquantaty=0;
                    }
                    flag = 1;
                    break;
                }
                i++;
            }
            if (flag == 0) {
                current_product_price = 0;
            }


            temp = current_product_price * Integer.parseInt(q1.getText());
            name = currentproductname;
            quantity = Integer.parseInt(q1.getText());
            price = current_product_price;
            totalprice = temp;
            date = from.getText();


            t1.setText(Integer.toString(temp));
            t1.setVisible(true);
            u1.setText(Integer.toString(current_product_price));
            u1.setVisible(true);
            d2.setVisible(true);
            q2.setVisible(true);

            //  date = to.getText();
        } else if (count == 2) {

            currentproductname = d2.getText();
            int i = 0;
            flag = 0;
            while (i < Dataclasss.Items.size()) {
                if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                    current_product_price = Dataclasss.Items.get(i).Itemprice;
                    Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q2.getText());
                    if(Dataclasss.Items.get(i).Itemquantaty<0)
                    {
                        Dataclasss.Items.get(i).Itemquantaty=0;
                    }
                    flag = 1;
                    break;
                }
                i++;
            }
            if (flag == 0) {
                current_product_price = 0;
            }


            temp = current_product_price * Integer.parseInt(q2.getText());
            name = currentproductname;
            quantity = Integer.parseInt(q2.getText());
            price = current_product_price;
            totalprice = temp;


            t2.setText(Integer.toString(temp));
            t2.setVisible(true);
            u2.setText(Integer.toString(current_product_price));
            u2.setVisible(true);
            d3.setVisible(true);
            q3.setVisible(true);
        } else if (count == 3) {

            currentproductname = d3.getText();
            int i = 0;
            flag = 0;
            while (i < Dataclasss.Items.size()) {
                if (currentproductname.equals(Dataclasss.Items.get(i).Itemname)) {
                    current_product_price = Dataclasss.Items.get(i).Itemprice;

                    Dataclasss.Items.get(i).Itemquantaty=Dataclasss.Items.get(i).Itemquantaty-Integer.parseInt(q3.getText());
                    if(Dataclasss.Items.get(i).Itemquantaty<0)
                    {
                        Dataclasss.Items.get(i).Itemquantaty=0;
                    }

                    flag = 1;
                    break;
                }
                i++;
            }
            if (flag == 0) {
                current_product_price = 0;
            }

            temp = current_product_price * Integer.parseInt(q3.getText());


            name = currentproductname;
            quantity = Integer.parseInt(q3.getText());
            price = current_product_price;
            totalprice = temp;

            t3.setText(Integer.toString(temp));
            t3.setVisible(true);
            u3.setText(Integer.toString(current_product_price));
            u3.setVisible(true);
            d4.setVisible(true);
            q4.setVisible(true);

        }

        Sold myobj = new Sold(name, quantity, price, totalprice);
        ReceiptController.vec.add(myobj);

        // System.out.println(myobj.name + " " + myobj.quantity + " " +myobj.price + " " +myobj.total_price);


    }


    @FXML
    void BackButtonPressed(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("CashierDashboard.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}