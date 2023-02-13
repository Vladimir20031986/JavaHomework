package Hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.print("Введите последовательность чисел через пробел: ");
        Scanner myScanner = new Scanner(System.in);
        {
            String numText = myScanner.nextLine();
            String[] myArray = numText.split(" ");
            int result = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (Integer.parseInt(myArray[i]) < 0) {
                    result += Integer.parseInt(myArray[i - 1]);
                }
            }
            System.out.print("Результат: " + result);
            myScanner.close();
        }
    }
}