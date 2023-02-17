package Hw;

import java.util.Scanner;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество чисел последовательности N");
        int n = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число");
            int num = scanner.nextInt();
            if (num % num == 0 && num % 1 == 0) {
                summ += num;
            }
        }
        scanner.close();
        System.out.println("Сумма простых чисел равна: " + summ);
    }
}