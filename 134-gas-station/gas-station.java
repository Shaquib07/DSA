class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalGas=0, totalCost=0;

        for(int i=0;i< gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        //check for the possibility of circuit compeletion
        if(totalCost>totalGas)
           return -1;

        int fuel=0,ans=0; 
        for(int i=0;i<gas.length;i++){
            //check for the possibility to hop to next Gas Station
            fuel+=gas[i]-cost[i];
            if(fuel<0 && i<gas.length-1)
            {
                fuel=0;
                ans=i+1;
            }
        }
        return ans;
    }
}