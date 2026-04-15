
// class Student {
//     int sid;
//     String name;
//     int rollNo;
// }
record Student(int sid, String name, int rollNo) {};

public class RecordMain {
    public static void main(String[] args) {
        Student s = new Student(1, "student1", 2);
        System.out.println("student id = "+s.sid());
        System.out.println("student name = "+s.name());
        System.out.println("student rollNo = "+s.rollNo());
    }
}
