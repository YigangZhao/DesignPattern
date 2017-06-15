/**
 * Created by zhaoyigang on 2017/5/26.
 */
public class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza;

        pizza = SimplePizzaFactory.createPizza(type);

        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.orderPizza("cheese");

        pizzaStore.orderPizza("veggie");


    }
}
