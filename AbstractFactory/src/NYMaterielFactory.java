/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class NYMaterielFactory implements MaterielFactory{
    @Override
    public Materiel createMateriel() {
        System.out.println("prepare NYPizzaMateriel");
        return new NYPizzaMateriel();
    }
}
