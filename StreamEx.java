import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

class Student {
    private int sid;  //unique id
    private String name;
    private int marks;

    public Student(int sid, String name, int marks) {
        super();
        this.sid = sid;
        this.marks = marks;
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public String toString() {   //To hide the hash value of the object and display actual value
        return "Student [sid="+sid+", name="+name+" marks="+marks+"]";
    }
}
class Employee {
    int eid;
    String name;
    String dpt;

    public Employee(int eid, String name, String dpt) {
        super();
        this.eid = eid;
        this.name = name;
        this.dpt = dpt;
    }
}
public class StreamEx {
    public static void main(String[] args) {
        // List data = Arrays.asList(10, 60, 45, 90, 30, 24, 50, 76);
        // //list data = list.of(25, 45, 12, 56, 78, 90);
        // //ArrayList<Integer> list = new ArrayList<Integer>();
        
        // list.addAll(data);
        
        //System.out.println(list);
        //List<Integer> g50 = list.stream().filter(n->50).collect(null)
        //list.stream().filter((n)->n>60).forEach(System.out::println);
        //list.stream().forEach((value)->System.out.print(value+" "));
        //list.stream().filter(n->n>=50&&n<=60).forEach((value)->System.out.print(value+" "));
        




        // List<Integer> data1 = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);   //print all even numbers using filter
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // list1.addAll(data1);
        // System.out.println(list1);
        // list1.stream().filter(n->n%2==0).forEach((value)->System.out.print(value+" "));

        // List<Integer>evenNo = list1.stream().filter(n->n%2==0).toList();
        // System.out.println(evenNo);




        // List<String> names = Arrays.asList("Amit", "Ravi", "Anil", "Vikas", "Ashok", "Rahul");   //print all names starting with 'A' using filter
        // ArrayList<String> list2 = new ArrayList<String>();
        // list2.addAll(names);
        // System.out.println(list2);
        // //list2.stream().filter(n->n.startsWith("A")).forEach((value)->System.out.print(value+" "));
        // //list2.stream().filter(name->name.charAt(0)=='A').forEach((value)->System.out.print(value+" "));
        // //list2.stream().filter(name->name.length()>4).forEach((value)->System.out.print(value+" ")); //print names whose length greater than 4
        // list2.stream().filter(name->name.contains("o")).forEach((value)->System.out.print(value+" ")); //print names which contains o



        /*Q Create a student class(name, marks) and write a java program using stream api filter() to print students
        whose marks are greater than 60*/
        
        // ArrayList<Student> lists = new ArrayList<Student>();
        // lists.add(new Student(1, "Monu", 60));
        // lists.add(new Student(2, "Sonu", 50));
        // lists.add(new Student(3, "Navin", 70));
        // lists.add(new Student(4, "Prem", 65));

        // List<Student> g60s = lists.stream().filter(student->student.getMarks()>60).toList();
        // g60s.stream().forEach(System.out::println);




        // List<Integer> marks = Arrays.asList(10, 45, 35, 75, 80, 91, 67, 76);
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<Integer> grace5 = list.stream().filter(mark->mark<40).map(mark->mark+5).toList(); //add grace marks 5 whose marks less than 40
        // System.out.println(grace5);


        // List<String> names = Arrays.asList("sachin", "rahul", "amit", "monu");
        // ArrayList<String> list = new ArrayList<String>();
        // list.addAll(names);
        // System.out.println(list);
        // List<String> upperCase = list.stream().map(name->name.toUpperCase()).toList();  //convert names to uppercase using map()
        // System.out.println(upperCase);


        // List<Integer> marks = Arrays.asList(10, 45, 35, 75, 80, 91, 67, 76);
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<Integer> square = list.stream().map(mark->mark*mark).toList();    //square of each number
        // System.out.println(square);


        // List<String> names = Arrays.asList("sachin", "rahul", "amit", "monu");
        // ArrayList<String> list = new ArrayList<String>();
        // list.addAll(names);
        // System.out.println(list);
        // List<Character> firstLetter = list.stream().map(name->name.charAt(0)).toList();  //extract the first letter of string
        // System.out.println(firstLetter);


        // List<Integer> marks = Arrays.asList(10, 45, 35, 75, 80, 91, 67, 76);
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.addAll(marks);
        // System.out.println(list);
        // List<String> convert = list.stream().map(mark->mark.toString()).toList();    //convert int into string
        // System.out.println(convert);



        // List<String> names = Arrays.asList("sachin", "rahul", "amit", "monu");
        // ArrayList<String> list = new ArrayList<String>();
        // list.addAll(names);
        // System.out.println(list);
        // List<String> addPrefix = list.stream().map(name->"item-"+name).toList();  //add prefix "item-" to each element
        // System.out.println(addPrefix);


        // List<String> names = Arrays.asList("sachin", "rahul", "amit", "monu");
        // ArrayList<String> list = new ArrayList<String>();
        // list.addAll(names);
        // System.out.println(list);
        // List<Integer> length = list.stream().map(name->name.length()).toList();  //convert each string into its length
        // System.out.println(length);


        
        
        // ArrayList<Employee> list = new ArrayList<Employee>();
        // list.add(new Employee(1, "Monu", "mca"));
        // list.add(new Employee(2, "Sonu", "civil"));
        // System.out.println(list);
        // List<String> empName = list.stream().map(emp->emp.name).toList();  //extract the name from employee
        // System.out.println(empName);


        // List<String> names = Arrays.asList("Java","Python", "JavaScript");
        // ArrayList<String> list = new ArrayList<String>();
        // list.addAll(names);
        // System.out.println(list);
        // List<Integer> hashList = list.stream().map(lang->lang.hashCode()).toList();  //display the hashCode
        // System.out.println(hashList);


        List<Integer> numbers = Arrays.asList(10, 45, 35, 75, 80, 91, 67, 76);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);
        System.out.println(list);
        List<Integer> evenBool = list.stream().map(num->num%2==0?1:0).toList();    //display true(1) for even numbers
        System.out.println(evenBool);

        // Stream listStream = list.stream();
        // listStream.filter(null).toList();
        // list.stream().filter(null);
        //Stream listStream = 
    }
}
