package Hw;

import Hw.drinks.BottleOfWater;
import Hw.drinks.Coffee;
import Hw.drinks.Product;
import Hw.drinks.Tea;
import Hw.eats.AmericanCookie;
import Hw.eats.OatmealCookie;

import java.util.List;


public class AllSellVendingMachine<E extends Product> {
    private String name;
    private Integer height;

    public AllSellVendingMachine(List<E> allProducts, String name, Integer height) {
        this.allProducts = allProducts;
        this.name = name;
        this.height = height;
    }


    private List<E> allProducts;

    public List<E> getProductList() {
        return allProducts;
    }

    public <Product> String getProduct(String name) {
        for (E prod:allProducts
        ) {
            if(prod.getName().equals(name)){
                if(prod instanceof Coffee || prod instanceof Tea){return "Имя: " + prod.getName() + " Цена: " + prod.getPrice() + " Объем: " + prod.getVolume() + " Температура: " + prod.getTemperature();}
                if(prod instanceof AmericanCookie){return "Имя: " + prod.getName() + " Цена: " + prod.getPrice() + " Объем: " + ((AmericanCookie) prod).getWeight() + " Наполнитель: " + ((AmericanCookie) prod).getFilling();}
                if(prod instanceof OatmealCookie){return "Имя: " + prod.getName() + " Цена: " + prod.getPrice() + " Объем: " +  ((OatmealCookie) prod).getWeight() + " с шоколадом: " + ((OatmealCookie) prod).getWithChocolate();}
                return "Имя: " + prod.getName() + " Цена: " + prod.getPrice();
            }
        }
        return new Coffee("не найдено", 0,0,0).toString();
    }


    public void addProduct(E product) {
        allProducts.add(product);
    }

    @Override
    public String toString() {
        return "AllSellVendingMachine{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", allProducts=" + allProducts +
                '}';
    }
}