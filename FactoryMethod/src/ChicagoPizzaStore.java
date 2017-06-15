import javax.swing.text.Style;

/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
