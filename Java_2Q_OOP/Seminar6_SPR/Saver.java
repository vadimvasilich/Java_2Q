package Seminar6_SPR;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {

    public void saveToJson(Order order) {
        String fileName = "/Users/vadim/Desktop/Java_2Q/Java_2Q_OOP/Seminar6_SPR/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToXML (Order order){
        String fileName = "/Users/vadim/Desktop/Java_2Q/Java_2Q_OOP/Seminar6_SPR/order.xlm";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\"?>\n");
            writer.write("<order>\n");
            writer.write("  <clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("  <product>" + order.getProduct() + "</product>\n");
            writer.write("  <qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("  <price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToTxt (Order order){
        String fileName = "/Users/vadim/Desktop/Java_2Q/Java_2Q_OOP/Seminar6_SPR/order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("clientName = " + order.getClientName() + "\n");
            writer.write("product = " + order.getProduct() + "\n");
            writer.write("qnt = " + order.getQnt() + "\n");
            writer.write("price = " + order.getPrice() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}