package com.company;

public class Main {

    public static void main(String[] args) {
	MyRunnable myRunnable = new MyRunnable();
	Thread thread = new Thread(myRunnable);
	//Thread threadOne = new Thread();
	//thread.start();
        thread.run();

	//threadOne.start();
       // threadOne.run();

       // for(int i = 0 ; i< 10 ; i++){
       //     System.out.println("this is Main Thread");

        //}
    }

}
