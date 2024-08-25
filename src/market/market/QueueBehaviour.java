package market.market;

import market.actor.Actor;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();



}
