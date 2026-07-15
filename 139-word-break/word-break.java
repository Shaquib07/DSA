class Solution {
    private Boolean [] bool;
    public boolean wordBreak(String s, List<String> wordDict) {
           bool= new Boolean[s.length()];
        return solve(s,wordDict,0);
    }
    public boolean solve(String s,List<String> wordDict,int startIndex)
    {
        if(startIndex>=s.length())
            return true;

        if(bool[startIndex]!=null)
            return bool[startIndex];    

        for(int i=startIndex+1;i<=s.length();i++){
            String word=s.substring(startIndex,i);
            if(wordDict.contains(word) && solve(s,wordDict,i))
               return bool[startIndex]=true;
        }    
        return bool[startIndex]=false;
    }
}