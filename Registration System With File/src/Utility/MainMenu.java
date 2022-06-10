package Utility;
import Bean.Config;
import Services.*;
import Process_Interfaces.Processİnterface;

public enum MainMenu {
    Login(1, "Login", new MenuLoginService()),
    Register(2, "Register", new MenuRegisterService()),
    Add_Teacher(3, "Add Teacher", new MenuAddTeacherService()),
    Add_Student(4, "Add Student", new MenuAddStudentService()),
    Show_All_Teacher(5, "Show all teachers", new MenuShowTeacherService()),
    Show_All_Student(6, "Show all students", new MenuShowStudentsService()),
    Unknown;
    private String label;
    private Processİnterface service;
    private int number;

    MainMenu() {

    }

    MainMenu(int number, String label, Processİnterface service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number+"."+label;
    }

    public void process() throws Exception {
        service.process();
        MenuUtility.showMenu();
    }

    public int getNumber() {
        return number;
    }

    public static MainMenu find(int number) {
        MainMenu[] menus = MainMenu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return MainMenu.Unknown;
    }

    public static void showMenu() {
        MainMenu[] menus = MainMenu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != Unknown) {
                if(menus[i] == Login || menus[i] == Register){
                    if(!(Config.isLogging_message())) {
                            System.out.println(menus[i]);
                    }
                } else if(Config.isLogging_message()){
                        System.out.println(menus[i]);
                }
            }
        }
    }
}
