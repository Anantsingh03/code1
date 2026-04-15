import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(23, 12, 6, 67, 89, 43);
        // Optional<Integer> result = list.stream().min((a,b)->a-b); //sort in ascending and min function gives 0 indexed value
        // result.ifPresent(System.out::println);  //return minimum


        // List<Integer> list = Arrays.asList(23, 12, 6, 67, 89, 43);
        // Optional<Integer> result = list.stream().min((a,b)->b-a); //sort in descending and min function gives 0 indexed value
        //     //Optional<Integer> result = list.stream().max((a,b)->a-b);  //another way
        // result.ifPresent(System.out::println);  //return maximum



        // List<Integer> list = Arrays.asList(23, 12, 6, 67, 89, 43);
        // Optional<Integer> result = list.stream().min((a,b)->a-b); //find second minimum number(solve this problem)
        // result.ifPresent(System.out::println);  




        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
        new Employee(101, "Amit", 50000, 25, "IT"),
        new Employee(102, "Neha", 60000, 28, "HR"),
        new Employee(103, "Ravi", 45000, 24, "IT"),
        new Employee(104, "Karan", 70000, 30, "Finance"),
        new Employee(105, "Pooja", 55000, 27, "HR"),
        new Employee(106, "Rohit", 80000, 32, "IT"),
        new Employee(107, "Simran", 65000, 29, "Finance"),
        new Employee(108, "Amit", 50000, 25, "IT")));

        //Employee res = empList.
        
    }
}
class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}
