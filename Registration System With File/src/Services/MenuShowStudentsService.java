package Services;
import Bean.Config;
import Bean.Student;
import Service_Interfaces.MenuShowStudentServiceInterface;

public class MenuShowStudentsService implements MenuShowStudentServiceInterface {
    @Override
    public void abstractProcess() {
        Student[] allStudents = Config.instance().getStudents();
        for(int i = 0 ; i < allStudents.length ; i++){
            System.out.println(allStudents[i]);
        }
    }
}
