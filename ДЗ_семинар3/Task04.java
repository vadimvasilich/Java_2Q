package ДЗ_семинар3;
/*
 * Реализовать алгоритм сортировки слиянием
 */

import java.util.Arrays;
 
public class Task04 {
    // Объединяем два отсортированных подмассива `arr[low…mid]` и `arr[mid+1…high]`
    public static void merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        int k = low, i = low, j = mid + 1;
 
        // Пока есть элементы в левом и правом прогонах
        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
            }
        }
 
        // Копируем оставшиеся элементы
        while (i <= mid) {
            aux[k++] = arr[i++];
        }
 
        // Вторую половину копировать не нужно (поскольку остальные элементы
        // уже находятся на своем правильном месте во вспомогательном массиве)
 
        // копируем обратно в исходный массив, чтобы отразить порядок сортировки
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }
    }
 
    // Сортируем массив `arr[low…high]`, используя вспомогательный массив `aux`
    public static void mergesort(int[] arr, int[] aux, int low, int high)
    {
        // Базовый вариант
        if (high == low) {        // если размер прогона == 1
            return;
        }
 
        // найти середину
        int mid = (low + ((high - low) >> 1));
 
        // рекурсивное разделение выполняется на две половины до тех пор, пока размер выполнения не станет == 1,
        // затем объединяем их и возвращаемся вверх по цепочке вызовов
 
        mergesort(arr, aux, low, mid);          // разделить/объединить левую половину
        mergesort(arr, aux, mid + 1, high);     // разделить/объединить правую половину
 
        merge(arr, aux, low, mid, high);        // объединяем две половинки
    }
 
    // Функция для проверки, отсортирован ли arr в порядке возрастания или нет
    public static boolean isSorted(int[] arr)
    {
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (prev > arr[i])
            {
                System.out.println("MergeSort Fails!!");
                return false;
            }
            prev = arr[i];
        }
 
        return true;
    }
 
    // Реализация алгоритма сортировки слиянием
    public static void main(String[] args)
    {
        int[] arr = { -56, 4, 21, 86, 2, 0, 48, 33, -5, 1 };
        int[] aux = Arrays.copyOf(arr, arr.length);
 
        // сортируем массив `arr`, используя вспомогательный массив `aux`
        mergesort(arr, aux, 0, arr.length - 1);
 
        if (isSorted(arr)) {
            System.out.println(Arrays.toString(arr));
        }
    }
}