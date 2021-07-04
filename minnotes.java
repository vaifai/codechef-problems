import java.io.*;
import java.util.*;
class minnotes {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++){
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
            }
            int gcd=a[0];long sum=0;
            for(int i=1;i<n;i++){
                gcd=find(a[i],gcd);
            }
            for(int i=0;i<n;i++){
                sum=sum + (a[i]/gcd);
            }
            sum=sum-(max/gcd) + 1;
            System.out.println(sum);
        }
    }
    static int find(int a,int b){
        if(a==0){
            return b;
        } else {
            return find(b%a,a);
        }
    }
}
