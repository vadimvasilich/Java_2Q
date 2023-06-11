package Seminar4;

import java.util.ArrayList;
import java.util.Collection;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T o : fruits) {
            weight += o.getWeight();
        }

        return weight;
    }

    public void pour(Box<T> another) {
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addApple(T apple) {
        fruits.add(apple);
    }

    public void addOrange(T orange) {
        fruits.add(orange);
    }

    public void add(Collection<T> fruit) {
        fruits.addAll(fruit);
    }

   
    public boolean compare (Box<?> box) { 
        return Math.abs(getWeight() - box.getWeight()) < 0.0001; 
    }
   
    public void addFruits(Box<T> boxFruit) { 
        System.out.println("До пересыпания в первой коробке: " + fruits.size()); 
        System.out.println("До пересыпания во второй коробке: " + boxFruit.fruits.size()); 
        fruits.addAll(boxFruit.fruits); 
        boxFruit.fruits.clear(); 
        boxFruit.fruits.trimToSize(); 
        System.out.println("После пересыпания в первую коробку из второй: " + fruits.size()); 
        System.out.println("После пересыпания во второй коробке: " + boxFruit.fruits.size()); 
    }

    // public void addFruit(Box<Apple> appleBox2) {
    // }   
}