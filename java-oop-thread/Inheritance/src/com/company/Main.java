package com.company;

public class Main {

    public static void main(String[] args) {
	SubClass subClass = new SubClass();
	subClass.honk();

	System.out.println(subClass.brand + " " + subClass.modelName);
    }
}
