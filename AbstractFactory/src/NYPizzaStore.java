/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {

        NYMaterielFactory materielFactory = new NYMaterielFactory();

        if (type.equals("cheese")){
            return new CheesePizza(materielFactory);
        }else if (type.equals("veggie")){
            return new VeggiePizza(materielFactory);
        }
        return null;
    }
}
