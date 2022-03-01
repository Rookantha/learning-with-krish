package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {



        HashMap<String,String> hashMap = new HashMap<String,String>();

        hashMap.put("one", "rookntha");
        hashMap.put("Two", "madhushanka");
        hashMap.put("Three", "Gunarathna");
        System.out.println(hashMap);
        System.out.println(hashMap.get("one"));
        System.out.println(hashMap.remove("one"));
        System.out.println(hashMap.size());

        // loop Print keys
        for(String i : hashMap.keySet()){
            System.out.println(i);
        }
        for(String i : hashMap.values()){
            System.out.println(i);
        }

        HashMap <String ,Integer> hashMap1 = new HashMap<String, Integer>();

        hashMap1.put("John", 32);
        hashMap1.put("Steve", 30);
        hashMap1.put("Angie", 33);

        for(String i : hashMap1.keySet()){
            System.out.println("Key" + i + "values" + hashMap1.get(i));
        }

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Volvo");
        hashSet.add("BMW");
        hashSet.add("Ford");
        hashSet.add("BMW");
        hashSet.add("Mazda");
        System.out.println(hashSet);



    }
}
