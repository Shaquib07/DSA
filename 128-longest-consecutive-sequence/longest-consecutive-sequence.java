class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0,maxCount=0;
        if(nums.length>0){
            Set <Integer> set = new HashSet<>();
            for(int n : nums){
                set.add(n);
            }
            for(Integer num : set){
                if(!set.contains(num-1)){
                    count=1;
                    while(set.contains(num+count))
                        count++;
                    maxCount=(count>maxCount)? count:maxCount;
                }
            }
        }
        return maxCount;     
    }
}