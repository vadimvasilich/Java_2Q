package Seminar4;

public class Program {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(); 
        Box<Orange> orangeBox = new Box<>(); 
        Box<Apple> appleBox2 = new Box<>(); 

        //кладем в каждую коробку по 3 фрукта 
        for (int i = 0; i < 3; i++) { 
            orangeBox.addOrange(new Orange()); 
            appleBox.addApple(new Apple()); 
            appleBox2.addApple(new Apple()); 
        }

        appleBox.addApple(new Apple()); 
        appleBox.addApple(new Apple()); 
        appleBox2.addApple(new Apple()); 

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight()); 
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight()); 
        System.out.println("Коробки равны?: " + appleBox.compare(orangeBox)); 
        System.out.println("----------------------------------------------"); 

        appleBox.addFruits(appleBox2);
    }
}