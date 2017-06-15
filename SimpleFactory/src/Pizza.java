/**
 * Created by zhaoyigang on 2017/5/26.
 */
public abstract class Pizza {

    public abstract void prepare();

    public abstract void bake();

    public void cut(){
        System.out.println("cut pizza");
    };

    public void box(){
        System.out.println("cut pizza");
    };
}
