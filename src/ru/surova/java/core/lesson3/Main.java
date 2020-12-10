package ru.surova.java.core.lesson3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //task 1
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        printFruits(fruits);
        swap(fruits,0, 1);
        printFruits(fruits);

        //task 2
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        System.out.println("Apple box weight: " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        System.out.println("Boxes are equal: " + appleBox.compare(orangeBox));

        Box<Apple> secondAppleBox = new Box<>();
        secondAppleBox.add(new Apple());
        secondAppleBox.add(new Apple());
        System.out.println("Second apple box weight: " + secondAppleBox.getWeight());

        secondAppleBox.pour(appleBox);
        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Second apple box weight: " + secondAppleBox.getWeight());
        System.out.println("Boxes are equal: " + appleBox.compare(orangeBox));

    }

    //task 1

    public static void swap(ArrayList<Fruit> fruits, int i, int j){
        Fruit temp = fruits.get(i);
        fruits.set(i, fruits.get(j));
        fruits.set(j, temp);
    }

    public static void printFruits(ArrayList<Fruit> fruits){
        for (int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i).getName());
        }
    }
}
