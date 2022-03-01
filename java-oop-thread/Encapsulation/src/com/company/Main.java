package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PersonClass myObj = new PersonClass();
        myObj.setName("Rookantha");
        System.out.println(myObj.getName());

        System.out.println("Import Java APIs and Java Packages");
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter your Name");

        String userName = myObj2.nextLine();
        System.out.println("User Name is : " + userName);

    }

}
