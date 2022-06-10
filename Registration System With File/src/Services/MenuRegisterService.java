package Services;
import Service_Interfaces.MenuRegisterServiceInterface;

public class MenuRegisterService implements MenuRegisterServiceInterface{

    @Override
    public void abstractProcess() {
        System.out.println("Register");
    }
}
