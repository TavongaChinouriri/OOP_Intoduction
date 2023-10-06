import java.util.Scanner;

class Student{
    private String StudName;
    private String StudSurname;
    private int Age;
    private String Program;
    private double MarkObtained;

    public String getStudName(String name) {
        return StudName;
    }

    public void setStudName(String studName) {
        StudName = studName;
    }

    public String getStudSurname() {
        return StudSurname;
    }

    public void setStudSurname(String studSurname) {
        StudSurname = studSurname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public double getMarkObtained() {
        return MarkObtained;
    }

    public void setMarkObtained(double markObtained) {
        MarkObtained = markObtained;
    }
}

public class EncapsulationExample{
    public static void main(String[] args){
        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.next();
        s1.setStudName(name);
        System.out.print("Enter Student Surname: ");
        String surname = input.next();
        s1.setStudSurname(surname);
        System.out.print("Enter Student Age: ");
        int age = input.nextInt();
        s1.setAge(age);
        System.out.print("Enter Student Program: ");
        String program = input.next();
        s1.setProgram(program);
        System.out.print("Enter Student Mark Obtained: ");
        double mark = input.nextDouble();
        s1.setMarkObtained(mark);
        System.out.println();
        System.out.println("Name: "+ s1.getStudSurname() + " "+s1.getStudName(name)+ " \tAge: "+ s1.getAge()+
                " \nProgram: "+ s1.getProgram()+ " \tObtained: "+s1.getMarkObtained()+"%");

    }
}
