import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSort {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(100, 15, 54, 67);
        // System.out.println(list);
        // List<Integer> sortedList = list.stream().sorted().toList();   //sort in ascending order
        // System.out.println(sortedList);


        // List<Integer> list = Arrays.asList(100, 15, 54, 67);
        // System.out.println(list);
        // List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();//sort in descending order
        // System.out.println(sortedList);

        // List<Integer> list = Arrays.asList(100, 15, 54, 67);
        // System.out.println(list);
        // List<Integer> sortedList = list.stream().sorted((a, b)->b-a).toList();   //sort in descending order
        // System.out.println(sortedList);


        // List<Integer> list = Arrays.asList(100, 15, 106, 54, 67);
        // System.out.println(list);
        // List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        // System.out.println(sortedList);                       //print 3 highest numbers



        // List<Integer> list = Arrays.asList(100, 15, 54, 67);  //Sort only the even numbers
        // System.out.println(list);
        // List<Integer> sortedList = list.stream().filter(n->n%2==0).sorted().toList(); 
        //                 // List<Integer> sortedList = list.stream().sorted().filter(n->n%2==0).toList();    
        // System.out.println(sortedList);



        // List<Integer> list = Arrays.asList(100, 15, 54, 67);   //sort the list and print second highest
        // System.out.println(list);
        //           //int result = list.stream().sorted((a, b)->b-a).toList().get(1);
        // int result = list.stream().sorted((a, b)->b-a).skip(1).findFirst().get();
        // System.out.println(result);


        // List<String> names = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
        // System.out.println(names);
        // List<String> sortedList = names.stream().sorted().toList();   //sort in alphabetically order
        // System.out.println(sortedList);


        // List<String> names = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
        // System.out.println(names);
        //         //List<String> sortedList = names.stream().sorted(Comparator.reverseOrder()).toList();   //sort in reverse alphabetical order
        // List<String> sortedList = names.stream().sorted((a,b)->b.compareTo(a)).toList();
        // System.out.println(sortedList);


        List<String> names = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
        System.out.println(names);
        List<String> sortedList = names.stream().sorted().toList();   //sort names based on their length
        System.out.println(sortedList);
        


        //Comparable interface and  Comparator
    }
}
