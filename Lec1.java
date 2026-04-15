public class Lec1 {
    public static void main(String args[]) {
        System.out.println("Hello World");
        Sum s1 = new Sum();
        s1.getSum();
        new Sum(4,5).getSum();  //anonymous object

        Sub s2 = new Sub();
        s2.getDiff(5, 3);
    } 
}

class Sum {
    int num1, num2;
    Sum() {                            //user defined default constructor
        this(10, 5)   ;              //constructor in constructor          
        System.out.println("user defined constructor is called");
    }
    Sum(int num1, int num2) {  // parametrized constructor
        this.num1 = num1;
        this.num2 = num2;
    }
    void getSum() {
        System.out.println("Sum : " + (num1+num2));
    }
}

class Sub {
    //int num1, num2;
    void getDiff(int num1, int num2) {

        System.out.println("Subtraction : " + (num1-num2));
    }

}