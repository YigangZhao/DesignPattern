/**
 * Created by zhaoyigang on 2017/6/14.
 */
public abstract class PlayerBuilder {

    protected VedioPlayer vedioPlayer;

    public PlayerBuilder(){
        vedioPlayer = new VedioPlayer();
    }

    public abstract void buildMenu();
    public abstract void buildPlaylist();
    public abstract void buildMainwindow();
    public abstract void buildControlbar();
    public abstract void buildCollect();

    public VedioPlayer getVedioPlayer(){
        return vedioPlayer;
    }
}
