class Solution {
    public int bulbSwitch(int n) {
        //n개의 전구가 주어지고 총 n단계를 수행한다.
        //1단계에선 모든 전구를 킨다.
        //이후 단계에선 매 n번째 전구를 켜져있다면 끄고, 꺼져있다면 킨다.
        //모든 단계가 종료된 후 켜져있는 상태의 전구의 갯수를 반환한다.

        //n까지의 정수중 해당 전구를 약수로 가지는 수를 센다
        //약수로 가지는수의 개수가 홀수면 작동이 홀수번 됨으로 결과적으로 킨 상태가 된다.
        //"                  짝수면 작동이 짝수번 됨으로 결과적으로 끈 상태가 된다.
        int count = 0;
        for(int i = 1 ; i <= n; i++){
            if(isContain(i, n)%2!=0){
                count++;
            }
        }

        return count;
    }
    public int isContain(int n, int num){
        int count = 0;
        for(int i = n; i <= (int)Math.sqrt(num);i++){
            if (n%i ==0){
                count++;
            }
        }
        return count;
    }
}