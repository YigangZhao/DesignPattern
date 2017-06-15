/**
 * Created by zhaoyigang on 2017/6/3.
 */
public class ChicagoStyleCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare ChicagoStyleCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake ChicagoStyleCheesePizza");
    }
}
