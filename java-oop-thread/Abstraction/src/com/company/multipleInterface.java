package com.company;

public class multipleInterface  implements InterFaceFirst,InterFaceTwo{

    @Override
    public void InterfaceMethodOne() {
        // The body of animalSound() is provided here
        System.out.println("First Interface Method One");
    }

    @Override
    public void InterfaceMethodTwo() {
        // The body of animalSound() is provided here
        System.out.println("First Interface Method Two");

    }

    @Override
    public void InterfaceTwoMethodOne() {
        // The body of animalSound() is provided here
        System.out.println("Second Interface Method One");

    }

    @Override
    public void InterfaceTwoMethodTwo() {
        // The body of animalSound() is provided here
        System.out.println("Second Interface Method Two");

    }
}
