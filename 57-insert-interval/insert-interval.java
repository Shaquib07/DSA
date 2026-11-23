class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> intervalList= new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        Collections.sort(intervalList,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> result= new ArrayList<>();
        int [] currentInterval=intervalList.get(0);
         result.add(currentInterval);

        for(int [] interval: intervalList){
            if(currentInterval[1]>=interval[0]){ //overlapping check
                currentInterval[1]=Math.max(currentInterval[1],interval[1]);          
            }else{
                currentInterval=interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}