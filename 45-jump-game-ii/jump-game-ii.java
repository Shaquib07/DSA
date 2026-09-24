class Solution {
    public int jump(int[] nums) {
        
        int jumps=0, goal=nums.length-1, lastJump=0,coverage=0;

        if(nums.length==1){
            return 0;
        }

        for(int i=0;i<nums.length;i++){

            coverage= Math.max(coverage,i+nums[i]);
            
            if(i==lastJump){

                lastJump=coverage;

                jumps++;

                if(coverage>=goal)

                  return jumps;
            }
        }
        return jumps;
    }
}