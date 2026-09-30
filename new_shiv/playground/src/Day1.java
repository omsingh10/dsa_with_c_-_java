public class Day1 {

    public boolean containsDuplicate(int[] nums) {


        int n = nums.length;
        for(int i = 0 ; i<=n-1;i++){
            for(int j = i+1; j<= n-1; j++){
                if(nums[i] == nums[j]){
                    return true;
                }

            }
        }
        return false;
    }




    public static void main(String[] args) {
        Day1 solver = new Day1();

        // Test Case 1: Expected output = true
        int[] test1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + solver.containsDuplicate(test1));

        // Test Case 2: Expected output = false
        int[] test2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + solver.containsDuplicate(test2));

        // Test Case 3: Expected output = true
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test 3: " + solver.containsDuplicate(test3));
    }
}