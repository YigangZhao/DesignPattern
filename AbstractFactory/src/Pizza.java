/**
 * Created by zhaoyigang on 2017/6/4.
 */
public abstract class Pizza {

    private Materiel materiel;

    public abstract void prepare();

    public abstract void bake();

    public void cut(){
        System.out.println("cut pizza");
    }

    public void box(){
        System.out.println("box pizza");
    }
}
