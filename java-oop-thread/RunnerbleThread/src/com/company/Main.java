package com.company;

public class Main {

    public static void main(String[] args) {
	MyRunnerble runnerble = new MyRunnerble();
	Thread thread = new Thread(runnerble);
	thread.start();
		for (int i=0; i < 10 ; i++){
			System.out.println("Main Thread");

		}
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("rookanhta");
		System.out.println(Thread.currentThread().getName());




    }
}
