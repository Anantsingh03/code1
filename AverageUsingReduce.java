package stream;
import java.util.*;
public class AverageUsingReduce {
	  public static void main(String[] args) {

	        // Create list
	        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

	        // Step 1: find sum using reduce
	        int sum = list.stream()
	                .reduce(0, (a, b) -> a + b);

	        // Step 2: calculate average
	        double avg = (double) sum / list.size();

	        // Print result
	        System.out.println("Average: " + avg);
	    }
}
