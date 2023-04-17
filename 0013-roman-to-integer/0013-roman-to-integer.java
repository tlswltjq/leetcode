import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('M', 1000);
        romanNumber.put('D', 500);
        romanNumber.put('C', 100);
        romanNumber.put('L', 50);
        romanNumber.put('X', 10);
        romanNumber.put('V', 5);
        romanNumber.put('I', 1);
        int answer = 0;

        char[] tmp = s.toCharArray();
        int[] itmp = new int[tmp.length];
        for(int i = 0 ; i<tmp.length; i++){
            itmp[i] = romanNumber.get(tmp[i]);
        }

        for(int i = 0 ; i <itmp.length;i++){
            if (i ==itmp.length-1){
                answer+=itmp[i];
            }else{
                if(itmp[i+1]<=itmp[i]){
                    answer +=itmp[i];
                }else{
                    i++;
                    answer+=itmp[i]-itmp[i-1];
                }
            }

        }




        return answer;
    }
}