package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
		HashMap<String ,Integer> word = new HashMap();

		word.put("one", 1);
		word.put("two", 2);
		word.put("three", 3);
		word.put("four", 4);
		word.put("five", 5);

		System.out.println(word.get("three"));

		System.out.println(word.values());
		System.out.println(word.keySet());

		System.out.println(word.remove("four"));

    }
}
