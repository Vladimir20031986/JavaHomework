package Hw;
/**Дан массив целых чисел.
 * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте длинну массива");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите значение элемента массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println();
        System.out.print ("Исходный массив");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        int indsumm = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] >= 10 || array[i] <= -10) {
                indsumm += i;
            }
        }
        System.out.println();
        System.out.print ("Измененный массив");
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                array[i] = indsumm;
            }
            System.out.print (" " + array[i]);
        }
    }
}
