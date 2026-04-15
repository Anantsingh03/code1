//package area;
public class Lec2 {
    public static void main(String args[]) {
        //System.out.println("Hi...");
        Circle c = new Circle(12);
        
        c.getArea();
        c.getCircleArea();

        Area a = new Circle(34);
        a.getArea();
        //Circle c = (Circle)new Area("abc");  //up casting and down casting concept
        c.getArea();
        c.getCircleArea();

    }
}

abstract class Area {
    int r, l, b;
    Area(String msg) {
        System.out.println(msg);
        System.out.println("This is area constructor");
    }
    void getArea() {
        System.out.println("This is area class");
    }
}
class Circle extends Area {
    final double PI = 3.14;
    Circle(int r) {
        super("This is area constructor");        //explicitly call parent constructor
        super.r = r;
    }
    void getCircleArea() {
        double result = PI * super.r * this.r;
        System.out.println("Area of circle : " + result);
    }

}