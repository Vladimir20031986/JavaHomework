package Hw.Task03;


import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

public class Main3 {
    public static void main(String[] args) {
        Catalog3 item1 = new Catalog3("Евгений Онегин", "Пушкин", 1000, 1833, 272);
        Catalog3 item2 = new Catalog3("Исповедь хулигана", "Есенин", 1000, 2018, 194);
        Catalog3 item3 = new Catalog3("Стихотворения", "Ахматова", 1000, 2010, 233);
        Catalog3 item4 = new Catalog3("Война и мир", "Толстой", 5000, 2014, 1301);
        List<Catalog3> itemList3 = new ArrayList<>();
        itemList3.add(item1);
        itemList3.add(item2);
        itemList3.add(item3);
        itemList3.add(item4);
        for (int i = 0; i < itemList3.size(); i++) {
            if (itemList3.get(i).getSecondName().contains("А")) {
                if (itemList3.get(i).getPages() % 2 != 0 && itemList3.get(i).getPages() % 3 != 0 && itemList3.get(i).getPages() % 5 != 0 && itemList3.get(i).getPages() % 7 != 0) {
                    if (itemList3.get(i).getYear() >= 2010) {
                        System.out.println("Название книги соответствующей условию: " + itemList3.get(i).getBookName());
                    }
                }
            }
        }
    }
}
