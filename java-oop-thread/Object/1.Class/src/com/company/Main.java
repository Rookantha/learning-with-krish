package com.company;

public class Main {
    int classVariable= 5;
    public static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");

    }


    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();

        System.out.println("-----------Multiple Objects--------");

        System.out.println(myObj1.classVariable);
        System.out.println(myObj2.classVariable);

        System.out.println();
        System.out.println("-----------Class Attributes--------");

        myClassFirst myClassFirst = new myClassFirst();

        System.out.println();
        System.out.println("Access Class attribute "+ myClassFirst.SecondClassVariable);

        System.out.println();
        System.out.println("---------Modify Class Attribute----------");
        myClassFirst.SecondClassVariable = 10;
        System.out.println("Modify Class attribute "+ myClassFirst.SecondClassVariable);

        System.out.println();
        System.out.println("---------Final Class Attribute----------");
        System.out.println("Final Class attribute "+ myClassFirst.finalValue);

        System.out.println();
        System.out.println("---------Multiple Class Attribute----------");

        System.out.println("Multiple Class attribute "+ myClassFirst.fName +"" + myClassFirst.lName + "" + myClassFirst.myAge);

        System.out.println();
        System.out.println("---------static Method----------");
        myStaticMethod();

        System.out.println();
        System.out.println("---------public Method----------");
        myClassFirst.myPublicMethod();

        System.out.println();
        System.out.println("---------Constructor----------");
        ConstroutorEx constroutorEx=new ConstroutorEx("rookantha", "madhushanka");
        System.out.println(constroutorEx.fName +"  " + constroutorEx.lName);


    }
}
