import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonaccinumber {
    public static int fib(int n) {
        int[] fiboarray = new int[n];
        int answer = 0 ;
        switch (n){
            case 0 :
                answer=0;
                break;
            case 1 :
                answer=1;
                break;
            default:
                fiboarray[0]=0;
                fiboarray[1]=1;

                for(int i=2;i<n;i++){
                    fiboarray[i] = fiboarray[i-1] + fiboarray[i-2];
                }
                answer = fiboarray[n-1] + fiboarray[n-2];

        }
        System.out.println(answer);

        return answer;
    }
}
