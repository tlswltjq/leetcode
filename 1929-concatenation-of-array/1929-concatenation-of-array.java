class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length*2];
        for(int i = 0 ; i<nums.length;i++){
            answer[i] = answer[i+nums.length] = nums[i];
        }
        return answer;
    }
}