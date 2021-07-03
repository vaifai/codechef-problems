import java.io.*;
import java.util.*;
class eita {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++){
            int d=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int zz=sc.nextInt();
            int max=7*x;
            max=Math.max(max,y*d + (7-d)*zz);
            System.out.println(max);

        }
    }
}
