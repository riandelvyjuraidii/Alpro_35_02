
package ch04;
import java.util.Scanner;

public class Res6Bag2_No14 {
    int []aray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int lum = 0;
    int p = aray.length;
    int k = 0;
    public void cetak(){
        for(int nul : aray){
            lum = lum + nul;
        }
        System.out.println(" maka = ");
        for(int i = 0; i < aray.length; i++){
            if(i>p){
                System.out.println(aray[i]+"");
            }else{
                System.out.println(aray[i]+", ");
            }
        }
        System.out.println("\n\n jumlah adalah = "+lum);
    }
    public void cetak1(){
        for(int a = 0; a < aray.length; a++){
            if(aray[a]<=10){
                k=k+1;
            }
        }
        int last = (aray.length*2)- k;
        System.out.println(" Jumlah angka pada aray = "+last);
    }
}