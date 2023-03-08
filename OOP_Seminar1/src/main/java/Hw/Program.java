package Hw;
/**Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume,
 int temperature) выдающий продукт соответствующий имени,
 объему и температуре
 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        HotSellVendingMachine HSVM1 = new HotSellVendingMachine();
        List<Product> hd = new ArrayList<>(Arrays.asList(new Coffee("Капучино", 50, 100, 90),
                new Coffee("Американо", 40, 200, 85), new Tea("Черный чай", 40, 200, 85)));
        HSVM1.initProduct(hd);
        System.out.println(HSVM1.getProduct("Черный чай", 200, 85));
        System.out.println(HSVM1.getProduct("Капучино", 200, 85));
        System.out.println(HSVM1.getProduct("Капучино"));
        System.out.println(HSVM1.getProduct("Капучино", 100, 90));
    }
}