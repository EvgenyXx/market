package market.market;

import market.actor.Actor;

import java.util.List;

public interface MarketBehaviour {// поведение в магазине
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

}
