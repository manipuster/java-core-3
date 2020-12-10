package ru.surova.java.core.lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    ArrayList<T> fruits = new ArrayList<T>();

    public void add (T fruit){
        fruits.add(fruit);
    }

    public float getWeight (){
        if(fruits.size() != 0){
            return fruits.get(0).getWeight() * fruits.size();
        }
        return 0;
    }

    public boolean compare(Box<? extends Fruit> box){
        return this.getWeight() == box.getWeight();
    }

    public void pour(Box<T> box){
        for(int i = 0; i < fruits.size(); i++){
            box.add(fruits.get(i));
        }
        fruits.clear();
    }


}
