class Solution {
    public int arraySign(int[] nums) {
        int mns = 0;
        
        for(int i : nums){
            if (i ==0){
                return 0;
            }else{
                if(i<0){
                    mns++;
                }
            }
        }
        
        return mns%2==0 ? 1 : -1;
    }
}