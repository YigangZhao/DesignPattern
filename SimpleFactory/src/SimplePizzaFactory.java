/**
 * Created by zhaoyigang on 2017/5/26.
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
