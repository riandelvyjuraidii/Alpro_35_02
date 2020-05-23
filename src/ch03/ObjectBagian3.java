
package ch03;
import java.util.Scanner;

public class ObjectBagian3 {
    public static void main(String[] args) {
        Bagian3 pembagi = new Bagian3();
        Scanner angka = new Scanner (System.in);
        System.out.println("Menentukan bilangan pembagi terkecil selain 1 dan 2");
        System.out.println("====================================================");
        System.out.println("Input bilangan = ");
        pembagi.angka = angka.nextInt();
        
        pembagi.cetak();
    }
}