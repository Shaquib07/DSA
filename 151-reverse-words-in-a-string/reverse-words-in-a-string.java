class Solution {
    public String reverseWords(String s) {
        /*StringBuilder sb= new StringBuilder();
        StringBuilder word= new StringBuilder();
        //String sb="";
        //String word="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch !=' '){
                word.append(ch);
                //word=word+ch;
            }else if(i>0 && s.charAt(i-1) !=' '){
                sb.insert(0,word);
                sb.insert(0,ch);
                word.setLength(0);
               // sb=word+sb;
               // sb=ch+sb;
               // word="";
            }
            if(i==s.length()-1 && ch !=' ')
                sb.insert(0,word);
                //sb=word+sb;
        }
        String ans=sb.toString().trim();
        return ans;*/

        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i =str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}