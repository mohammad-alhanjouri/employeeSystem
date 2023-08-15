import java.util.Scanner;

public class Employee {
    private String name, dep, email;
    private float salary;
    Scanner scanStr= new Scanner(System.in);
    Scanner scanFloat= new Scanner(System.in);

    public Employee(String name, String dep, String email, float salary) { // parametrized constructor
//        super(name, dep, email,salary);
        this.name = name;
        this.dep= dep;
        this.email= email;
        this.salary= salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public void enteringData(){
        System.out.println("Enter employee name: ");
        String empName= scanStr.nextLine();
        System.out.println("Enter employee dep: ");
        String empDep= scanStr.nextLine();
        System.out.println("Enter employee email: ");
        String empEmail= scanStr.nextLine();
        System.out.println("Enter employee salary: ");
        float empSalary= scanFloat.nextFloat();

    }
}
