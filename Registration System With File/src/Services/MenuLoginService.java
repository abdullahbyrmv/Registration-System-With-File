package Services;
import Bean.Config;
import Service_Interfaces.MenuLoginServiceInterface;
import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInterface{
    @Override
    public void abstractProcess() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Username : ");
        String username = sc.nextLine();
        System.out.print("Please Enter Password : ");
        String password = sc.nextLine();

        if(!(username.equals("user") && password.equals("1111"))){
            throw new IllegalArgumentException("username or password is wrong");
        }
        Config.setLogging_message(true);
    }
}
