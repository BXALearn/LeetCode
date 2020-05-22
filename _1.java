
import java.util.HashMap;
import java.util.Map;

public class _1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap(nums.length);
        for (int i = 0; nums.length>i;i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }

}
