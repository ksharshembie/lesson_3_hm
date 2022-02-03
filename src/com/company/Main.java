package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
        Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа
        и вывести его на экран (8, -2, -4, 2, 3, 6) =  11/3
         */
        double[] numbers = {10.2, 9.3, 5.3, -2.6, 13.9, 5.4, -7.2, 13.5, 2.3, 9.2, 6.45, 3.6, -6.0, 13.7, 16.4};
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Количество чисел в массиве: " + numbers.length);
        double sum = 0;
        int a = 0, b = 0;
        for (double id : numbers) {
            if (id < 0 || b > 0) {
                b++;
                if (id > 0) {
                    sum = id + sum;
                    a++;
                }
            }
        }
        System.out.println("Сумма положительных чисел после первой отрицательной: " + (float) sum);
        System.out.println("Количество положительных чисел после первой отрицательной: " + a);
        System.out.println("Среднее арифметические положительных чисел после первой отрицательной: " + (float) (sum / a));
        /*
        Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
        При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
        И при каждой итерации распечатывать текущее состояние массива {-4, -2, 2, 3, 6, 8}
         */
        for (int i = 0; i < numbers.length; i++) {
            int k = i;
            double min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (min > numbers[j]){
                    min = numbers[j];
                    k = j;
                    }
                }
            if (i != k){
                double temp = numbers[i];
                numbers[i] = numbers[k];
                numbers[k] = temp;
                }
            }
        System.out.println("Сортировка по возрастанию: \n" + Arrays.toString(numbers));
    }
}
