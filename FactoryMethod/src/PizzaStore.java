/**
 * Created by zhaoyigang on 2017/6/3.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public void orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

    }


    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        chicagoPizzaStore.orderPizza("cheese");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        nyPizzaStore.orderPizza("veggie");
    }
}
