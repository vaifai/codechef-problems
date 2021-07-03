import java.io.*;
import java.util.*;

class numgame{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++){
            int n=sc.nextInt();
            if(n%2==0){
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
        }
    }
}