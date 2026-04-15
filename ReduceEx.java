import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(12, 14, 54, 67, 15, 178, 96);
        // int result = list.stream().reduce(Integer.MIN_VALUE, (a, b)->Math.max(a,b));   //max element
        // System.out.println(result);



        // List<Integer> list = Arrays.asList(12, 14, 54, 67, 15, 178, 96);
        // int result = list.stream().reduce(0, (a, b)->a+1);   //count no of elements
        // System.out.println(result);


        // List<Integer> list = Arrays.asList(12, 15, 54, 67);
        // int result = list.stream().reduce(0, (a, b)->(b%2==0)?a+b:a);               //sum of even elements
        // System.out.println(result);


        // List<String> list = Arrays.asList("monu", "navin", "prem");
        // String result = list.stream().reduce("", (a, b)->a+" "+b);//convert all list elements into single string
        // System.out.println(result);



        // List<Integer> list = Arrays.asList(2, 5, 6);
        // int result = list.stream().reduce(0, (a, b)->a+(b*b));    //sum of square of all elements
        // System.out.println(result);


        /*List<Integer> list = Arrays.asList(12, 15, 54, 67);
        int max = list.stream().reduce(1, (a, b)->(a>b)?a:b);       //second highest elements
        int result = list.stream().reduce(1, (a, b)->(a>b && a<max)?a:b);   //check the code as giving wrong output
        System.out.println(result);*/


        List<Integer> list = Arrays.asList(2, 5, 6);
        int result = list.stream().reduce(0, (a, b)->a+(b*b));    //find factorial of a number
        int n = 5;
        int fact = IntStream.rangeClosed(1, n).reduce(1, (a, b)->a*b);
        System.out.println(fact);





    }
}
