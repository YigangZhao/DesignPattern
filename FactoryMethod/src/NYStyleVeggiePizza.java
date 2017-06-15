/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class NYStyleVeggiePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare NYStyleVeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake NYStyleVeggiePizza");
    }
}
