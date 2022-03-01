package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File myFile = new File("D:\\myCord\\Java\\OOP\\javaFile\\Rookantha.txt");

            if(myFile.createNewFile()){
                System.out.println("File Create " + myFile.getName());

            }else{
                System.out.println("File Already Exists");

            }
        } catch (IOException e) {
            System.out.println("File Already Exists");
            e.printStackTrace();
        }
        try {
            FileWriter myFileWriter = new FileWriter("D:\\myCord\\Java\\OOP\\javaFile\\Rookantha.txt");
            myFileWriter.write("Files in Java might be tricky, but it is fun enough!");
            myFileWriter.close();
            System.out.println("Successfully wrote to the file.");
            File myFile = new File("D:\\myCord\\Java\\OOP\\javaFile\\Rookantha.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        


    }
}
