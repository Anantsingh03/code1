
@FunctionalInterface
interface Calc {
    void add(int n1, int n2);
}

public class MainLambda {
    public static void main(String args[]) {   //lambda expression
        System.out.println("Hi..."); 

        Calc sum = (int n1, int n2)-> {      //lambda expression
            System.out.print("Sum : ");
            System.out.print((n1+n2));
        };
        sum.add(5, 4);

        
        Calc sum1 = (int n1, int n2)-> System.out.print("Sum : "+(n1+n2));    //lambda expression
        sum1.add(5, 3);



    }
}