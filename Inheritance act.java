class Person {
    protected String name;

    void showInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    
    void setName(String name) {
        this.name = name;
    }

    @Override
    void showInfo() {
        System.out.println("I am " + name + ", a student.");
    }

    void sendMessage() {
        System.out.println("Message sent to teacher.");
    }

    void sendMessage(String msg) {
        System.out.println("Message sent to teacher: " + msg);
    }
}

class Teacher extends Person {
    
    void setName(String name) {
        this.name = name;
    }

    @Override
    void showInfo() {
        System.out.println("I am " + name + ", a teacher.");
    }

    void sendMessage(String msg) {
        System.out.println("Message sent to teacher: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Student S = new Student();
        Teacher T = new Teacher();

        S.setName("Mia");
        T.setName("Jasmin");

        S.showInfo();
        T.showInfo();

        S.sendMessage();
        S.sendMessage("Good day ma'am!");

    }
}
