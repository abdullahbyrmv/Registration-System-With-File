package Services;
import Bean.Config;
import Bean.Teacher;
import Service_Interfaces.MenuAddTeacherServiceInterface;
import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInterface{
    @Override
    public void abstractProcess(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Please Enter Surname : ");
        String surname = sc.nextLine();
        System.out.print("Please Enter age : ");
        int age = sc.nextInt();
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);
        teacher.setAge(age);

        Config.instance().appendTeacher(teacher);
        System.out.println("");
        System.out.println("Teacher added");
    }
}
