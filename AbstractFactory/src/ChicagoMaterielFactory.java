/**
 * Created by zhaoyigang on 2017/6/4.
 */
public class ChicagoMaterielFactory implements MaterielFactory{
    @Override
    public Materiel createMateriel() {
        System.out.println("prepare ChicagoPizzaMateriel");
        return new ChicagoPizzaMateriel();
    }
}
