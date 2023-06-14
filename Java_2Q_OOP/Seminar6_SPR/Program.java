package Seminar6_SPR;

import java.io.File;

public class Program {
    /**
     * TODO: Çàäà÷à 1. Äîìàøíÿÿ ðàáîòà. Îïòèìèçèðîâàòü ðàáîòó êëàññà Order â  ðàìêàõ ïðèíöèïà SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order("Иванов Иван Иваныч", "Зубы", 30, 5000);
        Saver saver = new Saver();
        Loader loader = new Loader();
        loader.inputFromConsole(order);
        saver.saveToJson(order);
        saver.saveToXML(order);
        saver.saveToTxt(order);
        Order order2 = new Order();
        // loader.loadFromJson(new File("/Seminar6_SPR/order2.json"), order2);
        System.out.println(order2);
    }
}