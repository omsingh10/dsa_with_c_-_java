import java.util.Arrays;
public class Day2 {
    public int[] twoSum(int[] nums, int target) {
        // Your logic goes here
        int n =nums.length;
        for(int i =0 ; i< n-1 ; )




        return new int[]{}; // default return if no pair found
    }

    public static void main(String[] args) {
        Day2 solver = new Day2();

        // Test 1: Expected [0, 1]
        System.out.println(Arrays.toString(solver.twoSum(new int[]{2, 7, 11, 15}, 9)));

        // Test 2: Expected [1, 2]
        System.out.println(Arrays.toString(solver.twoSum(new int[]{3, 2, 4}, 6)));

        // Test 3: Expected [0, 1]
        System.out.println(Arrays.toString(solver.twoSum(new int[]{3, 3}, 6)));
    }



}
