class Solution {
    public boolean canJump(int[] nums) {
        int jumpGoal= nums.length-1;

        for(int i=nums.length-2; i>=0; i--){
            if(i+nums[i]>=jumpGoal)
                 jumpGoal=i;
        }
        if(jumpGoal==0)
          return true;
        return false;  
    }
}