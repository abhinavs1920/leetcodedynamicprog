import java.util.ArrayList;
import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        countBits(2);

    }
    public static int[] countBits(int n) {
        int count = 0 ;
        int arr[] = new int[n+1];


        for ( int i = 0 ; i < n+1 ; i++)
        {ArrayList<Integer> binaryarray = new ArrayList<>();
            count = 0 ;
            int num = i;
            for(num=i;num>0;){
                binaryarray.add(num%2);
                num/=2;

            }
            for (int j=0;j<binaryarray.size();j++){
                if(binaryarray.get(j)==1){
                    count++;
                }
            }
          arr[i] = count ;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}