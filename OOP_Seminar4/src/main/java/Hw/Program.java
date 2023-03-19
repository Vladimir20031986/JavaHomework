package Hw;


import Hw.drinks.BottleOfWater;
import Hw.drinks.Coffee;
import Hw.drinks.Product;
import Hw.drinks.Tea;
import Hw.eats.AmericanCookie;
import Hw.eats.Cookie;
import Hw.eats.OatmealCookie;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List allProducts = new ArrayList<>();
        AllSellVendingMachine APVM = new AllSellVendingMachine<>(allProducts, "first", 180);
        APVM.addProduct(new Coffee("Американо", 150, 200, 90));
        APVM.addProduct(new Tea("Черный чай", 30, 150, 85));
        APVM.addProduct(new AmericanCookie("ЯшкиноАм", 80, 200, "клубника"));
        APVM.addProduct(new OatmealCookie("ЯшкиноОвс", 50, 250, true));
        APVM.addProduct(new BottleOfWater("Кула", 100));
        System.out.println(APVM);
        System.out.println(APVM.getProductList());
        System.out.println(APVM.getProduct("Черный чай"));
        System.out.println(APVM.getProduct("ЯшкиноАм"));
        System.out.println(APVM.getProduct("ЯшкиноОвс"));

    }
}