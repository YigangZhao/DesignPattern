/**
 * Created by zhaoyigang on 2017/6/14.
 */
public class PlayerDirector {
    private PlayerBuilder builder;

    public VedioPlayer construct(){
        builder.buildMenu();
        builder.buildPlaylist();
        builder.buildMainwindow();
        builder.buildControlbar();
        builder.buildCollect();
        return builder.vedioPlayer;
    }

    public void setBuilder(PlayerBuilder builder){
        this.builder = builder;
    }

    public static void main(String[] args) {
        PlayerBuilder builder;
        PlayerDirector director = new PlayerDirector();

        builder = new FullModeBuilder();
        director.setBuilder(builder);

        director.construct();
    }
}
