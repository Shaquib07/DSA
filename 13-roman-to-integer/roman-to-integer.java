class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map= Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000);
        int ans=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            char prev_ch= s.charAt(i+1);
            char ch= s.charAt(i);
            if(ch=='I' && (prev_ch=='V' || prev_ch=='X')){
                ans=ans-1;
                continue;
            }
            else if (ch=='X' && (prev_ch=='L' || prev_ch=='C')){
                ans=ans-10;
                continue;
            }
            else if (ch=='C' && (prev_ch=='D' || prev_ch=='M')){
                ans=ans-100;
                continue;
            }
            ans=ans+map.get(ch);   
        }
        return ans;
        
    }
}