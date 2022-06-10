package Services;
import Bean.Config;
import Bean.Teacher;
import Service_Interfaces.MenuShowTeacherServiceInterface;

public class MenuShowTeacherService implements MenuShowTeacherServiceInterface {
    @Override
    public void abstractProcess() {
        Teacher[] allTeachers = Config.instance().getTeachers();
        for(int i = 0 ; i < allTeachers.length ; i++){
            System.out.println(allTeachers[i]);
        }
    }
}
