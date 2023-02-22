package Hw.Task02;

import java.util.ArrayList;
import java.util.List;

/**Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class Main2 {
    public static void main(String[] args) {
        Catalog2 item1 = new Catalog2("Стиральная машинка","Россия", 45, 25000, 1);
        Catalog2 item2 = new Catalog2("Холодильник","Южная Корея", 50, 32000, 1);
        Catalog2 item3 = new Catalog2("Телевизор","Япония", 6, 40000, 1);
        Catalog2 item4 = new Catalog2("Чайник электрический","Китай", 2, 3000, 2);
        Catalog2 item5 = new Catalog2("Посудомоечная машина","Франция", 43, 27000, 2);
        Catalog2 item6 = new Catalog2("Миксер","Германия", 2, 6000, 2);
        Catalog2 item7 = new Catalog2("Диван","Россия", 35, 70000, 2);
        Catalog2 item8 = new Catalog2("Кровать","Турция", 60, 50000, 2);
        Catalog2 item9 = new Catalog2("Шкаф","Китай", 70, 100000, 1);
        Catalog2 item10 = new Catalog2("Автомобиль","Япония", 1648, 2500000, 1);
        List<Catalog2> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);
        int minPrice1 = itemList.get(0).getPrice();
        int minPrice2 = itemList.get(0).getPrice();
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < itemList.size(); i++){
            if (itemList.get(i).getSort().equals(1)) {
                if (itemList.get(i).getPrice() < minPrice1){
                    minPrice1 = itemList.get(i).getPrice();
                    x1 = i;
                }
            }
            if (itemList.get(i).getSort().equals(2)) {
                if (itemList.get(i).getPrice() < minPrice2){
                    minPrice2 = itemList.get(i).getPrice();
                    x2 = i;
                }
            }
        }
        System.out.println("Наименование товара 1 сорта с наименьшей ценой: " + itemList.get(x1).getName());
        System.out.println();
        System.out.println("Наименование товара 2 сорта с наименьшей ценой: " + itemList.get(x2).getName());
    }
}
