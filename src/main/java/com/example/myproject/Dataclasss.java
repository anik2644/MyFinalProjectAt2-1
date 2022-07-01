package com.example.myproject;

import java.util.Vector;

public class Dataclasss {

    static int myfl=0;
    static Vector<Cashier> User= new Vector<>();
    static void setUsers()
    {
        Cashier Usr= new Cashier("User1","User1");
        Dataclasss. User.add(Usr);


         Usr= new Cashier("User2","Anik");
         Dataclasss. User.add(Usr);


        Usr= new Cashier("User3","User3");
        Dataclasss.User.add(Usr);

    }

    static String adminpassword="12345";



    static int CurrentCashierUser=0;



    static Vector<Item> Items = new Vector<Item>();

}
