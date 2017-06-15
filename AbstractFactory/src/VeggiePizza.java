/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class VeggiePizza extends Pizza{
    private MaterielFactory materielFactory;

    public VeggiePizza(MaterielFactory materielFactory){
        this.materielFactory = materielFactory;
    }


    @Override
    public void prepare() {
        materielFactory.createMateriel();
        System.out.println("prepare veggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake veggiePizza");
    }
}
