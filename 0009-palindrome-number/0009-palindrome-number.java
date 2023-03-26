class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer();
        String str = String.valueOf(x);
        for(int i  = str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        return sb.toString().equals(str);
    }
}