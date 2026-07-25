class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> reminder = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;
            //question criteria
            if (sum == 0 && i > 0)
                return true;
            if (reminder.containsKey(sum) && i - reminder.get(sum) > 1)
                return true;
            if (!reminder.containsKey(sum))
                reminder.put(sum, i);

        }
        return false;
    }
}