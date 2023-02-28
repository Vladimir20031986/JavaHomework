package Hw.Task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**2) Подсчитать количество искомого слова,
 * через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class Main02 {
    public static void main(String[] args) {
        System.out.println("Введите фразу или предложение: ");
        Scanner strs = new Scanner(System.in);
        String words = strs.nextLine();
//        strs.close();
        System.out.println("Введите искомое слово: ");
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        strs.close();
        str.close();
        words = words.replaceAll("[.-]", "");
        String[] wordsArr = words.split(" ");
        Map<String, Integer> mapStr = new HashMap<>();
        for (String i : wordsArr) {
            if (!word.equalsIgnoreCase(i)) {
                continue;
            }
            int count = mapStr.getOrDefault(word.toLowerCase(), 0);
            mapStr.put(i.toLowerCase(), ++count);
        }
        System.out.println("Слово  " + word + " : встретилось : " + mapStr.getOrDefault(word.toLowerCase(), 0) + " раз(а).");
    }
}

