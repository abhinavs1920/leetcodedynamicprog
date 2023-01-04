public class Tribonacci {
    public static void main(String[] args) {
      tribonacci(4);
    }
    public static int tribonacci(int n) {
        int[] fiboarray = new int[n];
        int answer = 0;
        switch (n){
            case 0:
                answer=0;
                break;
            case 1:
                answer =1;
                break;
            case 2:
                answer =1;
                break;
            default:
                fiboarray[0]=0;
                fiboarray[1]=1;
                fiboarray[2]=1;
                for(int i=3;i<n;i++){
                    fiboarray[i] = fiboarray[i-1] + fiboarray[i-2] + fiboarray[i-3];
                }
                answer = fiboarray[n-1] + fiboarray[n-2] + fiboarray[n-3];


        }
        System.out.println(answer);
        return answer;
    }
}
