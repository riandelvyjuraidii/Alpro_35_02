
package ch03;
import java.util.Scanner;

public class Bagian2 {
    int x, y, z;
    
    public int getVarX(){
        return x ;
    }
    public int getVarY(){
        return y ;
    }
    public int getVarZ(){
        return z ;
    }
    public void cetak (){
        if(x > y && x > z){
            System.out.println(+x+ "lebih besar dari " +y+". Nilai z = " +z);
        }else if(y > x && y > z){
            System.out.println(+y+ "lebih besar dari " +x+". Nilai z = " +z);
        }else{
            System.out.println(+z+ "lebih besar dari " +x+". Nilai y = " +y);
        }
    }
}