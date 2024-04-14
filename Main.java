// Main.java
import Employee.Employee;
import Employee.Manager;
import Employee.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John Doe", 80000);
        employees[1] = new Worker("Jane Smith", 50000);
        employees[2] = new Employee("Alice Johnson", 70000);
        employees[3] = new Worker("Bob Brown", 60000);
        employees[4] = new Worker("Emily Davis", 55000);

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        }

        employees[0].setSalary(75000);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
