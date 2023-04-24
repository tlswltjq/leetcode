import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        if (stones.length ==1){
            return stones[0];
        }else{
            while(!(stones[stones.length-2]==0)){
                if (stones[stones.length-1] == stones[stones.length-2]){
                    stones[stones.length-1] = stones[stones.length-2] = 0;
                    Arrays.sort(stones);
                }else{
                    stones[stones.length-1] -= stones[stones.length-2];
                    stones[stones.length-2] = 0;
                    Arrays.sort(stones);
                }
            }
            return stones[stones.length-1];
        }
    }
}