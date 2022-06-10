package Services;
import Bean.Config;
import Bean.Student;
import Service_Interfaces.MenuAddStudentServiceInterface;
import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInterface{
    @Override
    public void abstractProcess() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Please Enter Surname : ");
        String surname = sc.nextLine();
        System.out.print("Please Enter age : ");
        int age = sc.nextInt();
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);

        Config.instance().appendStudent(student);
        System.out.println("");
        System.out.println("Student added");
    }
}
