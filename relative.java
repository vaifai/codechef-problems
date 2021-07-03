import java.io.*;
import java.util.*;
class relative {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1; z<=t;z++){
            int g=sc.nextInt();
            int c=sc.nextInt();
            System.out.println((c*c)/(2*g));
        }
    }
}
