package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
        Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа
        и вывести его на экран (8, -2, -4, 2, 3, 6) =  11/3
         */
        double[] numbers = {10.2, 9.3, 5.3, 2.6, 13.9, 5.4, -7.2, 13.5, 2.3, 9.2, 6.45, 3.6, -6.0, 13.7, 16.4};
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
    }
}
