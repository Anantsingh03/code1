public class Lec3 {
    public static void main(String args[]) {
        System.out.println("Hello World...");
        Rectangle r1 = new Rectangle(4, 5);
        r1.getArea();
        r1.displayResult();

        Area r2 = new Rectangle(5, 5);    //upCasting in java
        //Rectangle r3 = new Area();        //downCasting in java  (java do not support)
        r2.getArea();
        //r2.displayResult();

        Area circle = new Area() {  //Anonymous class
            int r = 5;
            @Override
            public void getArea() {
                double result = 3.14 * r * r;
                System.out.println("Area of circle : " + result);
            }

        };
        circle.getArea();
        
    }
}

interface Area {
    void getArea();
}

class Rectangle implements Area {
    int l, b;       //instance variable
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void getArea() {
        int r = l * b;   //local variable
        System.out.println("Area of Rectangle : " + r);
        
    }

    void displayResult() {
        System.out.println("This is display function in rectangle");
    }
}