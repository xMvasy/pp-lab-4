import Employee.Employee;
import Employee.Manager;
import Employee.Worker;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("John Doe", 80000);
        employees[1] = new Worker("Jane Smith", 50000);
        employees[2] = new Employee("Alice Johnson", 70000);
        employees[3] = new Worker("Bob Brown", 60000);
        employees[4] = new Worker("Emily Davis", 55000);
        employees[5] = new Manager("Michael Wilson", 90000);
        employees[6] = new Worker("Jessica Garcia", 48000);

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(7500);
                manager.setSalary(7500);
            }
        }

        System.out.println("Zaktualizowane dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
