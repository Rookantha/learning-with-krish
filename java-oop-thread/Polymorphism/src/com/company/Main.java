package com.company;

public class Main {


    public static void main(String[] args) {

        firstClass myFirstClass = new firstClass();
        firstClass myScondClass = new SecundClass();
        firstClass myThordClass = new ThardClass();

        myFirstClass.method();
        myScondClass.method();
        myThordClass.method();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(outerClass.outerClass + " " + innerClass.innerClass);


    }
}
