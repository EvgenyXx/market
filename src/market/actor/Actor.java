package market.actor;

public abstract class Actor implements ActorBehaviour {
    protected String name ;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name, boolean isMakeOrder, boolean isTakeOrder) {
        this.name = name;
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;
    }

    public String getName() {
        return name;
    }


}
