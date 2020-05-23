
package ch03;
import java.util.Scanner;

public class ObjectBagian4 {
    public static void main(String[] args) {
        Bagian4 prima = new Bagian4();
        System.out.println("Menentukan bilangan prima atau tidak");
        System.out.println("====================================");
        Scanner pr = new Scanner (System.in);
        System.out.println("Input bilangan yang ingin dibuktikan = ");
        prima.angka = pr.nextInt();
        
        prima.cetak();
    }
}
