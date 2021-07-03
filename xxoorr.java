import java.io.*;
import java.util.*;
class xxoorr {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[32];
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                for(int j=0;j<32;j++){
                    if((num&(1<<j)) >= 1){
                        arr[j]++;
                    }
                }
            }
            int sum=0;
            for(int i=0;i<32;i++){
                sum+=arr[i]/k;
                if(arr[i]%k!=0)
                sum++;
            }
            System.out.println(sum);
        }
    }
}
