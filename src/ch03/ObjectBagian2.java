
package ch03;
import java.util.Scanner;

public class ObjectBagian2 {
    public static void main(String[] args) {
        Bagian2 angka = new Bagian2();
        System.out.println("Menentukan nilai tertinggi antara x, y, dan z");
        System.out.println("=============================================");
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input nilai x = ");
        angka.x = in.nextInt();
        
        Scanner out = new Scanner (System.in);
        System.out.println("Input nilai y = ");
        angka.y = out.nextInt();
        
        Scanner up = new Scanner (System.in);
        System.out.println("Input nilai z = ");
        angka.z = up.nextInt();
        
        angka.cetak();
    }
}
