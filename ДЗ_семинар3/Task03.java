package ДЗ_семинар3;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке.

 */


public class Task03 {
    public static void main(String[] args) {
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", 
                            "Нептун", "Плутон", "Земля", "Сатурн", "Меркурий", "Юпитер"};

        for (int i = 0; i < planets.length; i++) {
            String planet = planets[i];
            int count = 1; // количество повторений текущей планеты в списке

            for (int j = i + 1; j < planets.length; j++) {

                if (planet.equals(planets[j])) {
                    count++;
                    planets[j] = null; // удаляем повторяющийся элемент
                }
             }
            if (planet != null) {
                System.out.println(planet + " - " + count);
            }
        }
    }
}