/**
 * Created by zhaoyigang on 2017/6/14.
 */
public class SimpleModeBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPlaylist() {

    }

    @Override
    public void buildMainwindow() {
        System.out.println("显示主窗口");
        vedioPlayer.setMainwindow("显示主窗口");
    }

    @Override
    public void buildControlbar() {
        System.out.println("显示控制条");
        vedioPlayer.setControlbar("显示控制条");
    }

    @Override
    public void buildCollect() {

    }
}
