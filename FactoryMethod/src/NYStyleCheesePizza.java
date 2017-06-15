/**
 * Created by zhaoyigang on 2017/6/3.
 */
public class NYStyleCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare NYStyleCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake NYStyleCheesePizza");
    }
}
