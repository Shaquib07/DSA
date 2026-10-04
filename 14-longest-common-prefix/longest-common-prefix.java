class Solution {
    public String longestCommonPrefix(String[] strs) {

      String ans=strs[0];
      for(int j=1;j<strs.length;j++){
            String str=strs[j];
            for(int i=0;i<str.length();i++){
                if(ans.length()-1 >=i && ans.charAt(i) != str.charAt(i)){
                    ans=ans.substring(0,i);
                    break;
                }
                   
            }
            if (str.length() < ans.length()) {
                ans = ans.substring(0, str.length());
            }
         }
         return ans;
    }
}