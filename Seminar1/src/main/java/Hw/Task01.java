package Hw;

import java.util.Scanner;


public class Task01 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner myScanner = new Scanner(System.in);
        try{
            String text = myScanner.nextLine();
            System.out.println(text);
            String[] textArray = text.split(" ");
            for (int i = textArray.length - 1; i >= 0; i--) {
                if(i == 0){
                    System.out.print(textArray[i]);
                }
                else{
                    System.out.print(textArray[i]+" ");
                }
            }
        }
        finally {
            if(myScanner!=null) myScanner.close();
        }
    }
}
