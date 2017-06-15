/**
 * Created by zhaoyigang on 2017/5/26.
 */
public class VeggiePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake VeggiePizza");
    }
}
