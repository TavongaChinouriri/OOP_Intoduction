class Employee
{
    private int empno;
    private String name;
    private double salary;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
/**
 * Encapsulation
 */
public class Encapsulation {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpno(1);
        e1.setName("Disha");
        e1.setSalary(100000);
        System.out.println("Employee No.:"+e1.getEmpno()+"\tName:"+e1.getName()+"\tSalary:"+e1.getSalary());
        Employee e2 = new Employee();
        e2.setEmpno(2);
        e2.setName("Argha");
        e2.setSalary(100000);
        System.out.println("Employee No.:" + e2.getEmpno() + "\tName:" + e2.getName() + "\tSalary:" + e2.getSalary());

    }
}