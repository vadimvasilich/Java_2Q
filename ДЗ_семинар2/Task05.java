package ДЗ_семинар2;

/*
 *  Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл
String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";
 */

import java.io.*;
import java.net.URL;
import java.util.logging.Logger;

public class Task05 {
    public class FileDownloader {
        private static final Logger logger = Logger.getLogger(FileDownloader.class.getName());
        public static void main(String[] args) throws IOException {
            String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

        // Скачиваем и читаем файл
        URL url = new URL(fileUrl);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }

        reader.close();

        String fileContent = stringBuilder.toString();

        // Заменяем маску "%s" на ваше имя
        fileContent = fileContent.replaceAll("%s", "Ваше имя");

        // Создаем и записываем файл
        FileWriter writer = new FileWriter("example.txt");
        writer.write(fileContent);

        writer.close();

        // Читаем и выводим содержимое файла
        BufferedReader fileReader = new BufferedReader(new FileReader("example.txt"));

        while ((line = fileReader.readLine()) != null) {
            logger.info(line);
        }

        fileReader.close();

        // Удаляем файл
        File file = new File("example.txt");
        file.delete();
    }
}
}
