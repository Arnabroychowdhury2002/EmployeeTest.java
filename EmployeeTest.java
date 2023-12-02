class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Worker extends Employee {
    private int hoursWorked;
    private double salaryPerHour;

    public Worker(String name, int age, int hoursWorked, double salaryPerHour) {
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
    }

    public double calculateTotalSalary() {
        return hoursWorked * salaryPerHour;
    }
}

class Manager extends Employee {
    private String department;
    private double salary;

    public Manager(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Example usage
        Worker worker = new Worker("John Doe", 25, 40, 20.0);
        System.out.println("Worker Information:");
        worker.display();
        System.out.println("Total Salary: $" + worker.calculateTotalSalary());
        System.out.println();

        Manager manager = new Manager("Jane Smith", 35, "HR", 5000.0);
        System.out.println("Manager Information:");
        manager.display();
    }
}
