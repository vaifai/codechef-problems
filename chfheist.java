import java.io.*;
import java.util.*;
class chfheist {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        PrintWriter pw=new PrintWriter(System.out);
        for(int z=1;z<=t;z++){
            int totalDays=sc.nextInt();
            int d=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            long req=0;
            req+=(1L*p*totalDays);
            int mult=totalDays/d;
            mult--;
            long temp=1L*mult*(mult+1);
            temp=temp/2;
            temp=temp*d*q;

            long ss=1L*(totalDays%d)*(mult+1)*q;
            pw.println(req+temp+ss);
        }
        pw.close();
    }
}
