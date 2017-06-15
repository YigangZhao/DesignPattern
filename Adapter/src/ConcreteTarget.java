/**
 * Created by zhaoyigang on 2017/6/15.
 */
// 具体目标类，只提供普通功能
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类具有普通功能");
    }
}
