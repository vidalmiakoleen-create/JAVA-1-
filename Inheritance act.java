class Person {
    void name() { System.out.println("Name"); }
}
    
class Student extends Person{
    void showInfo(String name) {
        System.out.println("I am " + name + ", a student.");
    }
    void sendMessage() {
        System.out.println("Message sent to teacher");
    }
}
class Teacher extends Person{
    void showInfo(String name) {
        System.out.println("I am " + name + ", a teacher.");
    }
    void sendMessage(String msg){
        System.out.println("Message sent a teacher: " + msg);
    }
}

public class Main {
    public static void main(String[] args){
        Student S= new Student();
        Teacher T= new Teacher();
        
        S.name();
        S.showInfo("Mia");
        S.sendMessage();
        
        T.name();
        T.showInfo("Jasmin");
        T.sendMessage("Pass your Activities before 10 o'clock");
    }
}

