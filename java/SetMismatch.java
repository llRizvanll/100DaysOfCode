import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, n = nums.length;
        long sum = (n * (n+1)) / 2;
        for(int i : nums) {
            if(set.contains(i)) duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[] {duplicate, (int)sum + duplicate};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));
    }
}
