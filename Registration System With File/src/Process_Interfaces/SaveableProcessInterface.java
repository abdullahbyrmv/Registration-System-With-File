package Process_Interfaces;
import Bean.Config;

public interface SaveableProcessInterface extends Processİnterface {
    public default void process() throws Exception {
        abstractProcess();
        Config.save();
    }
}
