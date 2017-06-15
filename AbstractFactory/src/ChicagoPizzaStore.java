/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {

        ChicagoMaterielFactory chicagoMaterielFactory = new ChicagoMaterielFactory();

        if (type.equals("cheese")){
            return new CheesePizza(chicagoMaterielFactory);
        }else if (type.equals("veggie")){
            return new VeggiePizza(chicagoMaterielFactory);
        }
        return null;
    }
}
