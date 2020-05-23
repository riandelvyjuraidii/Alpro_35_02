
package ch04;
import java.util.Scanner;

public class ObjectRes6Bag2_No2 {
    public static void main(String[] args) {
        Res6Bag2_No2 matriks = new Res6Bag2_No2 ();
        System.out.println();
        
        matriks.cetak();
        System.out.println();
        Scanner in = new Scanner (System.in);
        System.out.println("Input angka = ");
        matriks.angka = in.nextInt();
        
        System.out.println();
        matriks.cetak2();
    }
}
