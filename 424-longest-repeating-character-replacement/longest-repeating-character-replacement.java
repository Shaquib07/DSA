class Solution {
    public int characterReplacement(String s, int k) {
        /* 
                      #Brute Force 
        int result=0;
        for(int i=0;i<s.length();i++){
            int [] freq= new int[26];
            int maxFreq=0;
            for (int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch -'A']++;
                maxFreq=Math.max(maxFreq,freq[ch -'A']); 
                int windowLen= j-i+1; 
                if(windowLen-maxFreq<=k){  
                    result=Math.max(result,windowLen);
                }
            }
        }*/

        /* Optimization*/

        int result=0,l=0,maxFreq=0;
        int[] freq= new int[26];
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            int windowLen=r-l+1;
            if(windowLen-maxFreq<=k)
              result=Math.max(result,windowLen);
            else{
                freq[s.charAt(l)-'A']--;
                l++;;
            }
               
        }

        return result;
    }
}