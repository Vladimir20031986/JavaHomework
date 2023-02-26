package Hw.Task01;

import java.util.Iterator;
import java.util.LinkedList;

public class Main01 {
    public static void main(String[] args) {
        LinkedList<Integer> numbs = new LinkedList<>();

        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);

        Iterator<Integer> iterator = numbs.iterator();
        Iterator<Integer> backIterator = numbs.descendingIterator();

        System.out.println("Исходный список: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Измененный список: ");
        while (backIterator.hasNext()) {
            System.out.print(backIterator.next() + " ");
        }
    }
}
