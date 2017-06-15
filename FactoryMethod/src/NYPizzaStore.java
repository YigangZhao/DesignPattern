/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
