import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Sara", 85),
            new Student("Rohan", 65),
            new Student("Neha", 90),
            new Student("Amit", 75)
        );
        System.out.println("Students with marks > 70 sorted by marks:");
        students.stream()
                .filter(s -> s.marks > 70)
                .sorted((s1, s2) -> Integer.compare(s1.marks, s2.marks))
                .forEach(System.out::println);
    }
}
