class Solution {
    public String reverseWords(String s) {
        String sb="";
        String word="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch !=' '){
                word=word+ch;
            }else if(i>0 && s.charAt(i-1) !=' '){
                sb=word+sb;
                sb=ch+sb;
                word="";
            }
            if(i==s.length()-1 && ch !=' ')
                sb=word+sb;
        }
        sb=sb.trim();
        return sb;
    }
}