
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortBasedOnSalary {
    public static void main(String[] args) {
        // Sample data
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 60000),
                new Employee("Bob", 55000)
        );

        // Sort employees based on salary
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .toList();

        // Print the sorted employees
        System.out.println("Employees sorted by salary:");
        sortedEmployees.forEach(System.out::println);
    }
}
