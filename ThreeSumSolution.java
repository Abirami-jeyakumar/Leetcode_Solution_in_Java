import java.util.*;

public class ThreeSumSolution {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4}; // sample input

        ThreeSumSolution solution = new ThreeSumSolution();
        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println("All unique triplets that sum to 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);                         
        Set<List<Integer>> resSet = new HashSet<>(); 
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 

            Set<Integer> seen = new HashSet<>();   
            for (int j = i + 1; j < n; j++) {
                int complement = -nums[i] - nums[j];   

                if (seen.contains(complement)) {
                    resSet.add(Arrays.asList(nums[i], complement, nums[j]));
                }
                seen.add(nums[j]);  
            }
        }
        return new ArrayList<>(resSet);  
    }
}
