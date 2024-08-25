package market.market;

import market.actor.Actor;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.ArrayList;
import java.util.List;

public class Market  implements MarketBehaviour,QueueBehaviour{
    private final List<Actor>queue = new ArrayList<>();



    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            System.out.println(actor.getName() + " вышел с магазина");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
      giveOrders();
      takeOrders();
      releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.remove(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if (!actor.isTakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
      for (Actor actor : queue){
          if (actor.isMakeOrder()){
             actor.setMakeOrder(true);
              System.out.println(actor.getName() + " забрал свой заказ и готов уходить");
          }
      }
    }

    @Override
    public void releaseFromQueue() {
     List<Actor>actors = new ArrayList<>();
     for (Actor actor  : queue){
         if (actor.isMakeOrder()){
             actors.add(actor);
         }
     }
     releaseFromMarket(actors);
    }
}
