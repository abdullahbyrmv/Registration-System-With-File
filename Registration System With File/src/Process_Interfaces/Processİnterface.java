package Process_Interfaces;

public interface Processİnterface {
    public abstract void abstractProcess();

    public default void process() throws Exception {
        abstractProcess();
    }
}
