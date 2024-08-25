package market.actor;

public interface ActorBehaviour {
    void setTakeOrder(boolean takeOrder);
    void setMakeOrder(boolean makeOrder);
    boolean isTakeOrder();
    boolean isMakeOrder();
}
