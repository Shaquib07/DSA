class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] preProd=new int[nums.length];
        int [] postProd=new int[nums.length];
        int index;
        for(index=0;index<nums.length;index++){
            if(index==0){
                preProd[index]=1;
            }else{
                preProd[index]=preProd[index-1]*nums[index-1];
            }
        }
        for(index=nums.length-1;index>=0;index--){
            if(index==nums.length-1){
                postProd[index]=1;
            }else{
                postProd[index]=postProd[index+1]*nums[index+1];
            }
        }
        for(index=0;index<nums.length;index++){
            nums[index]=preProd[index]*postProd[index];
        }
        return nums;
    }
}