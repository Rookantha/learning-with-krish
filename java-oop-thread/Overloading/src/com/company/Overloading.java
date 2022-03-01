package com.company;

public class Overloading {
    public void Display(int num){
        System.out.println("Num is " +num);
    }
    public void Display(String name){
        System.out.println("your Name is " + name);
    }
    public void Display(String newName, int age){
        System.out.println("your newName is " + newName + "age is " +age);
        //System.out.println("your Name is " + age);
    }
}
