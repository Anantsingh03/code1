//Main Method Referencing


class Circle {
    Circle() {
        System.out.println("Constructor in circle");
    }
    Circle(String msg) {
        System.out.println(msg);
    }
    double area(int r) {
        return Math.PI*r*r;
    }
}
@FunctionalInterface
interface CircleInfo {
    void getInfo(String msg);
}
@FunctionalInterface
interface Area {
    double getArea(int num);
}


public class MainMethodRef {
    public static void main(String args[]) {
        System.out.println("Hi...");

        Circle c = new Circle();
        Area ca = c::area;        //method referencing
        System.out.println("Area = "+ca.getArea(34));

        CircleInfo ci = Circle :: new;   //new always assign constructor reference
        ci.getInfo("This is parametrized constructor");

        
    }
}