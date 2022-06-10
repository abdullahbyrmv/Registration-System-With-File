package Main;
import Bean.Config;
import Utility.MenuUtility;

public class Main {
    public static void main(String[] args) throws Exception {
        Config.initialize();
        MenuUtility.showMenu();
    }
}
