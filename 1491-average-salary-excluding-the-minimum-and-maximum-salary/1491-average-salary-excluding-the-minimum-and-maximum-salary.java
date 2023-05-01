class Solution {
    public double average(int[] salary) {
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int a : salary){
            min = min>a? a : min;
            max = max<a? a : max;
            total +=a;
        }
        total= total -min - max;
        return (double) total / (salary.length-2);
    }
}