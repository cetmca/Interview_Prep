import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 7, 11, 15,2};
        int target = 9;

        int[] result = findTwoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers whose sum is equal to target:");
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
        } else {
            System.out.println("No two numbers found whose sum is equal to target.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Map to store the complement of each element

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            //System.out.println(i+"---"+complement);
            // If the complement is present in the map, return the indices
            if (map.containsKey(complement)) {
            	System.out.println("-->"+map.get(complement));
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, put the element and its index in the map
            map.put(nums[i], i);
           System.out.println("--"+map.toString());
        }
        
        // If no such pair is found, return null
        return null;
    }
}
