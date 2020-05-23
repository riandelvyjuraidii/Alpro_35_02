
package ch03;
import java.util.Scanner;

public class ObjectBagian1 {
    public static void main(String[] args) {
        Bagian1 angka = new Bagian1 ();
        System.out.println("Menentukan Nilai tertinggi antara variabel x dan y");
        System.out.println("==================================================");
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input nilai x = ");
        angka.x = in.nextInt();
        Scanner out = new Scanner (System.in);
        angka.y = out.nextInt();
        
        angka.cetak();
    }
}