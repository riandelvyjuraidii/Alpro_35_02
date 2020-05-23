
package ch03;
import java.util.Scanner;

public class Bagian1 {
    int x, y ;
    
    public int getVarX(){
        return x;
    }
    public int getVarY(){
        return y;
    }
    public void cetak(){
        if (x > y){
            System.out.println(+x+ ", lebih besar dari " +y );
        }else{
            System.out.println(+y+ "lebih besar dari " +x);
        }
    }
}