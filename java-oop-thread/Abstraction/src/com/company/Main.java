package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public  class Main {

    public static void main(String[] args) {
	SubClass subClass = new SubClass();
	subClass.abstractMethod();
	subClass.regularMethod();

	InheriteFromFirstInterface inheriteFromFirstInterface =new InheriteFromFirstInterface();
	inheriteFromFirstInterface.InterfaceMethodOne();
	inheriteFromFirstInterface.InterfaceMethodTwo();

	multipleInterface multipleInterface =new multipleInterface();
	multipleInterface.InterfaceMethodOne();
	multipleInterface.InterfaceMethodTwo();
	multipleInterface.InterfaceTwoMethodOne();
	multipleInterface.InterfaceTwoMethodTwo();

		System.out.println();
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");

		// String input
		String name = myObj.nextLine();

		// Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();

		// Output input by user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		LocalDate myDate = LocalDate.now();
		LocalTime myTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println(myDate);
		System.out.println(myTime);
		System.out.println(localDateTime);

    }
}
