/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class CheesePizza extends Pizza{

    private MaterielFactory materielFactory;

    public CheesePizza(MaterielFactory materielFactory){
        this.materielFactory = materielFactory;
    }


    @Override
    public void prepare() {
        materielFactory.createMateriel();
        System.out.println("prepare cheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake cheesePizza");
    }
}
