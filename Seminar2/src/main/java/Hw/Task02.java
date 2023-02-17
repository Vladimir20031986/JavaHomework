package Hw;

/**
 * 2) Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество чисел последовательности N");
        int n = scanner.nextInt();
        System.out.println("Введите число");
        int num1 = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("Введите число");
            int num2 = scanner.nextInt();
            if (num1 < num2) {
                num1 = num2;
                }
            else {
                System.out.println("Последовательность не является возрастающей");
                System.exit(0);
                }
            }
        scanner.close();
        System.out.println("Последовательность является возрастающей");
        }
}