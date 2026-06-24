class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 2; index++) {
            if (index > 0 && nums[index] == nums[index - 1])
                continue;
            int left = index + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[index] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[index], nums[left], nums[right]));
                    while (left< right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if (sum < 0)
                    left++;
                else
                    right--;

            }

        }
        return ans;
    }
}