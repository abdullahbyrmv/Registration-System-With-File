package Bean;
import Utility.FileUtility;
import java.io.Serializable;

public class Config implements Serializable {
    private static Config config = null;
    private Student[] students  = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean logging_message;

    public static void initialize(){
        Object file = FileUtility.read_file_as_object("app.obj");
        if(file == null){
            return;
        }
        if(file instanceof Config){
            config = (Config) file;
        }
    }

    public static void save() throws Exception {
        FileUtility.write_object_to_file(Config.instance(),"app.obj");
    }
    public void appendStudent(Student student){
        Student[] newStudents = new Student[students.length + 1];
        for(int  i = 0 ; i < students.length ; i++){
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
    }

    public void appendTeacher(Teacher teacher){
        Teacher[] newTeachers = new Teacher[teachers.length + 1];
        for(int  i = 0 ; i < teachers.length ; i++){
            newTeachers[i] = teachers[i];
        }
        newTeachers[newTeachers.length - 1] = teacher;
        teachers = newTeachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static Config instance(){// singleton pattern
        if(config == null){
            config = new Config();
        }
        return config;
    }

    public static boolean isLogging_message() {
        return logging_message;
    }

    public static void setLogging_message(boolean logging_message) {
        Config.logging_message = logging_message;
    }
}
