package ДЗ_семинар5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь 
// несколько телефонов. Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addNumber(String name, ArrayList<String> phoneNumbers) {
        phoneBook.put(name, phoneNumbers);
    }
    
    public ArrayList<String> searchPerson(String lastName) {
        ArrayList<String> find = new ArrayList<>();
        for (String name : phoneBook.keySet()) {
            if (name.split(" ")[1].equals(lastName)) {
                find.addAll(phoneBook.get(name));
            }
        }
        return find;
    }


    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> phones = new ArrayList<>();
        System.out.println("Введите фамилию и номер телефона для создания записи: "); 
        // Вводим фамилию и номер телефона через пробел, чтоб пройти дальше вводим пустую строку
        String input = scanner.nextLine();

        while (!input.equals("")) {
            String[] data = input.split(" ");
            String name = data[0] + " " + data[1];
            for (int i = 2; i < data.length; i++) {
                phones.add(data[i]);
            }

            book.addNumber(name, phones);
            phones = new ArrayList<>();
            System.out.println("Введите фамилию и номер телефона для добавления в книгу: ");
            input = scanner.nextLine();
        }

        System.out.println("Введите фамилию для поиска: ");
        String lastName = scanner.nextLine();

        ArrayList<String> searchResalt = book.searchPerson(lastName);

            if (searchResalt.isEmpty()) {
                System.out.println("Фамилия не найдена");
            }
            else {
                for (String phone : searchResalt) {
                    System.out.println(lastName + phone);
                }
            }
    }
}