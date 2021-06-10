import java.io.*;
import java.util.*;

class cocunut{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++){
            double xa=sc.nextDouble();
            double xb=sc.nextDouble();
            double Xa=sc.nextDouble();
            double Xb=sc.nextDouble();

            System.out.println((int)(Math.ceil(Xa/xa)+Math.ceil(Xb/xb)));
        }
    }
}