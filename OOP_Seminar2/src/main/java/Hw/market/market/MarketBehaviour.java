package Hw.market.market;

import Hw.market.buyers.Buyer;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(List<Buyer> actors);
    void update();
}
