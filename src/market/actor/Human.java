package market.actor;

public class Human extends Actor{
    public Human(String name, boolean isMakeOrder, boolean isTakeOrder) {
        super(name, isMakeOrder, isTakeOrder);
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;

    }
}
