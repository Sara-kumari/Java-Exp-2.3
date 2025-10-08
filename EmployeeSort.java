//------------------------------problem a Sorting Employee Objects Using Lambda Expressions--------------------
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", 50000),
            new Employee(2, "Riya", 70000),
            new Employee(3, "Raj", 60000)
        );
        System.out.println("Sorted by Salary:");
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        employees.forEach(System.out::println);
        System.out.println("\nSorted by Name:");
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        employees.forEach(System.out::println);
    }
}

