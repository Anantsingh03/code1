import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainForEach {
    public static void main(String[] args) {
        // int data[] = new int[] {12, 25, 5, 56, 84};

        // List<int[]> listData = Arrays.asList(data);
        // System.out.println(listData.get(0)[0]);

        // List<Integer> listData = Arrays.stream(data).boxed().toList();
        // System.out.println(listData);

        // List<Integer> listData = Arrays.stream(data).boxed().collect(Collectors.toList());
        // listData.forEach((item)->System.out.println(item));     // forEach method  (lambda expression)
        // listData.forEach(System.out :: println);               // (method referencing)


        int day = 2;
        String result = switch(day) {    //switch expression
            case 1,2 -> {
                System.out.println("This is 1 and 2 case");
                yield "Monday";}    //yield means return in switch
            case 7,3,4 -> "Tuesday";
            default -> "No Day";
        };
        System.out.println(result);
        
        

    }
}
