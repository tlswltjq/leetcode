class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char[] tmp1 = word1.toCharArray();
        char[] tmp2 = word2.toCharArray();
        int longer = tmp1.length > tmp2.length ? tmp1.length : tmp2.length;

        for (int i = 0; i < longer; i++) {
            if (tmp1.length>i){
                sb.append(tmp1[i]);
            }
            if (tmp2.length>i){
                sb.append(tmp2[i]);
            }
        }
        
        return sb.toString();
    }
}