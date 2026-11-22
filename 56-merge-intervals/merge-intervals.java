class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> ans= new ArrayList<>();
        int [] newInterval= intervals[0];
        ans.add(newInterval);
        for(int [] interval : intervals) {// to bring intervals in int [] form
            if(newInterval[1]>= interval[0]){  // 3>=2 overlapping case as [1,3] ={1,2,3} and [2,6]={2,3,4,5,6} so, 2,3 is overlapping
                newInterval[1]=Math.max(newInterval[1],interval[1]); //3,6 
            }else{
                //disjoint
                newInterval=interval;
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);

    }
}