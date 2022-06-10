package Utility;
import java.util.Scanner;

public class MenuUtility {
    public static void showMenu() throws Exception {
        System.out.println("Please Choose one of the Menu Options");
        MainMenu.showMenu();
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        MainMenu selectedMenu = MainMenu.find(option);
        selectedMenu.process();
    }

    public static void processMenu(MainMenu menu) throws Exception {
        menu.process();
    }
}
