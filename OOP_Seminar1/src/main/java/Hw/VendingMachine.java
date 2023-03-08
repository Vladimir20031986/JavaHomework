package Hw;

import java.util.List;

public abstract class VendingMachine{

    public abstract void initProduct(List<Product> products);

    public abstract String getProduct(String name);
}
