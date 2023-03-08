class Solution {
    public int pivotIndex(int[] nums) {
    int sum = 0;
        int sumL;
        for(int i : nums){
            sum+=i;
        }
        for(int i =0;i< nums.length;i++){
            sumL = 0;
            for(int j=0;j<i;j++){
                sumL+=nums[j];
            }
            
            if(sumL == sum - sumL - nums[i]){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("실패!");
        return -1;
    }
}