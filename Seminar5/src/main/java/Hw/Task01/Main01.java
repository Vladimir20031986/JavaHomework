package Hw.Task01;

import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Main01 {
    public static void main(String[] args) {
        Map<String, Integer> mapStr = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        str = str.toLowerCase();
        str = str.replaceAll("[.-]", "");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!mapStr.containsKey(words[i])) {
                mapStr.put(words[i], 1);
            } else {
                mapStr.put(words[i], mapStr.get(words[i]) + 1);
            }
        }
        for (var i : mapStr.entrySet()) {
            System.out.println("Слово  " + i.getKey() + " : встретилось : " + i.getValue() + " раз(а).");
        }
    }
}