
package ch05;
import java.util.Scanner;

public class Res7Bag2_No1_Algoritma_Euclidean {
    int p, q, r;
    public int getVarP(){
        return p;
    }
    public int getVarQ(){
        return q;
    }
    public int getVarR(){
        return r;
    }
    public void cetak(){
        int x = p;
        int y = q;
        while(q!=0){
            r = p % q;
            p = q;
            q = r;
        }
        System.out.println(" PBB dari = ("+x+" , "+y+" ) = "+p);
    }
}
