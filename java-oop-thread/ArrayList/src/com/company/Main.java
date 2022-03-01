package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String [] rookanthaArray = {"one" , "two", "three", "four"};

	System.out.println("Array Length is = " + rookanthaArray.length);

	for(int i= 0; i < rookanthaArray.length; i++){
	    System.out.println(rookanthaArray[i]);

    }
	int[][] myNum ={{1,2,3}, {5,6,7}};
	int x = myNum[1][2];

	System.out.println("Access the element of the array " + x);

	for(int i = 0; i < myNum.length; ++i){
		for (int j = 0; j < myNum[i].length; ++j){
			System.out.println(myNum[i][j]);
		}
	}

		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("One");
		myArrayList.add("two");
		myArrayList.add("three");
		myArrayList.add("four");
		myArrayList.add("five");

		System.out.println("--- Array List -----------");
		System.out.println(myArrayList);
		System.out.println(myArrayList.get(0));
		myArrayList.set(0, "first");
		System.out.println(myArrayList);
		myArrayList.remove(0);
		System.out.println(myArrayList);
		myArrayList.add(0,"One");
		System.out.println(myArrayList);

		for (int k = 0; k < myArrayList.size(); k ++){
			System.out.println(myArrayList.get(k));
		}

		HashMap<String ,String> myHashMap = new HashMap<String ,String >();
				myHashMap.put("one", "fName" );
				myHashMap.put("two", "lName" );
				myHashMap.put("three", "age" );
				myHashMap.put("four", "address" );
				System.out.println("Hash Map items "+myHashMap);
				System.out.println(myHashMap.get("one"));
				System.out.println(myHashMap.size());

				for(String p: myHashMap.keySet()){
					System.out.println(p);
				}
		HashMap <String, Integer> dHashmap = new HashMap<String,Integer>();
				dHashmap.put("John", 32);
				dHashmap.put("Steve", 30);
				dHashmap.put("Angie", 33);

				for(String i : dHashmap.keySet()){
					System.out.println("Name" + i + "Age " + dHashmap.get(i));
				}






    }
}
