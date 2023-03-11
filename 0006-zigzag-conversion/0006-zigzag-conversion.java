class Solution {
    public static String convert(String s, int numRows) {
        StringBuffer sb = new StringBuffer();

        int cycle = 2 * numRows - 2;
        int n = s.length();

        if(1 ==numRows){
            return s;
        }
        
        for(int i = 0 ; i<numRows;i++){
            for(int j = 0;j+i<n;j+=cycle){
                sb.append(s.charAt(j+i));
                if (i!=0 && i!=numRows-1 && j+cycle-i<n){
                    sb.append(s.charAt(j+cycle-i));
                }
            }
        }
        return sb.toString();
    }
}