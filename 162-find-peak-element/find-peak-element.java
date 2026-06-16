class Solution {
    public int findPeakElement(int[] nums) {
        //Brute force
        // int peekIndex=0;
        // for(int index=0;index<nums.length-1;index++){
        //     if((index==0 && nums[index]>nums[index+1]))
        //       peekIndex=index;
        //     else if(index!=0 && nums[index-1]<nums[index] && nums[index+1]<nums[index])  
        //        peekIndex=index;

        //      if(index==nums.length-2 && nums[index+1]> nums[index])
        //       peekIndex=index+1;  
        // }
        // return peekIndex;

        //OPTIMIZE SOLUTION
        int l=0,h=nums.length-1;
        if(l==h)
         return l;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid>0 && mid<nums.length-1){
                if( nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                    return mid;
                else if(nums[mid]<nums[mid+1])
                    l=mid+1;
                else
                    h=mid-1;    
            }else if(mid==0){
                if(nums[mid]>nums[mid+1])
                    return mid;
                else
                    return mid+1;
            }else if(mid== nums.length-1){
                if(nums[mid]>nums[mid-1])
                    return mid;
                else
                    return mid-1;
            }
        } 
        return -1;
    }
}