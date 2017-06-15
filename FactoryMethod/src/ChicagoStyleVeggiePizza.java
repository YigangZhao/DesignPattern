/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class ChicagoStyleVeggiePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare ChicagoStyleVeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake ChicagoStyleVeggiePizza");
    }
}
