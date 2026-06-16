class Solution {
    /*
       author: md.shaquib
    */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window=new HashSet<>();
        int left=0,maxcount=0;
            for(int index=0;index<s.length();index++){
                char ch=s.charAt(index);
                while(window.contains(ch)){
                    window.remove(s.charAt(left));
                    left++;
                }
                window.add(ch);
                maxcount=Math.max(maxcount,index-left+1);
            }        
       return maxcount;           
    }
}