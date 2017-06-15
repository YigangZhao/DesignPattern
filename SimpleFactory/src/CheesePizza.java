/**
 * Created by zhaoyigang on 2017/5/26.
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake CheesePizza");
    }
}
