
package ch03;
import java.util.Scanner;

public class Bagian3 {
    int a = 3;
    int angka;
    int kecil;
    
    public int getVarAngka(){
        return angka;
    }
    public void cetak(){
        while (a <= angka){
            if(angka % a == 0){
                kecil = a;
                System.out.println(kecil+ "adalah pembagi terkecil dari "+angka);
                break ;
            }else{
                a = a + 1;
                if(angka % a == 0){
                    kecil = a;
                    System.out.println(kecil+ "adalah pembagi terkecil dari "+angka);
                    break;
                }
            }a++;
        }
    }
}