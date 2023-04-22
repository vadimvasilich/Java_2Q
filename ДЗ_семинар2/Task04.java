package ДЗ_семинар2;

/*
 * Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
Требуется перехватить все возможные ошибки и вывести их в логгер.
После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task04 {
    public class WriteByteToFile {
        public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        
        try {
        // Создаем файл для записи
        File file = new File("result.txt");
        FileOutputStream fos = new FileOutputStream(file);
        
        // Считываем число
        System.out.println("Введите число в формате byte:");
        byte b = Byte.parseByte(System.console().readLine());
        
        // Записываем число в файл
        fos.write(b);
        
        // Закрываем поток для записи
        fos.close();
        } 
        catch (NumberFormatException e) {
        // Обработка ошибок при вводе некорректного числа
        logger.warning("Некорректный формат числа: " + e.getMessage());
        } 
        catch (IOException e) {
        // Обработка ошибок при записи в файл
        logger.warning("Ошибка при записи числа в файл: " + e.getMessage());
        } 
        catch (Exception e) {
        // Обработка всех других ошибок
        logger.warning("Неизвестная ошибка: " + e.getMessage());
        }
        
        // Настройка логгера
        try {
        fh = new FileHandler("logFile.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        } 
        catch (IOException e) {
        System.out.println("Ошибка при настройке логгера: " + e.getMessage());
        }
        }
        }
}
