package Hw.Task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */

public class Main1 {
    public static void main(String[] args) {
        Catalog1 item1 = new Catalog1("Мука высший пекарь", 200, "1-й сорт");
        Catalog1 item2 = new Catalog1("Рис китайский", 150, "2-й сорт");
        Catalog1 item3 = new Catalog1("Вода артезианская", 50, "1-й сорт");
        Catalog1 item4 = new Catalog1("Пиво высший сорт", 300, "2-й сорт");
        Catalog1 item5 = new Catalog1("Чипсы лэйс", 250, "-");
        Catalog1 item6 = new Catalog1("Сухарики домашние", 100, "2-й сорт");
        List<Catalog1> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        int priceMax = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().contains("высший")) {
                if (itemsList.get(i).getSort().contains("1-й сорт")) {
                } else if (itemsList.get(i).getSort().contains("2-й сорт"))
                    if (priceMax < itemsList.get(i).getPrice()) {
                        priceMax = itemsList.get(i).getPrice();
                    }
            }
        }
        System.out.println("Наибольшая цена товаров 1го или 2го сорта : " + priceMax);
    }
}

