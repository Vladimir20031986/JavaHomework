package Hw.market.buyers;

public abstract class Buyer implements BuyerBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public String getName() {
        return name;
    }
}
