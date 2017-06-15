/**
 * Created by zhaoyigang on 2017/6/14.
 */
public class FullModeBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {
        System.out.println("显示菜单");
        vedioPlayer.setMenu("显示菜单");
    }

    @Override
    public void buildPlaylist() {
        System.out.println("显示列表");
        vedioPlayer.setPlaylist("显示列表");
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
