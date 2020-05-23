
package ch09;
import java.util.Scanner;

public class ObjectRes13Bag2_No3c_SOS {
    public static void main(String[] args) {
        Res13Bag2_No3c_SOS object = new Res13Bag2_No3c_SOS();
        System.out.println("Program dari Sieve Of Sundaram ");
        System.out.println();
        
        Scanner in = new Scanner (System.in);
        System.out.println(" Input bilangan = ");
        int bil = in.nextInt();
        System.out.println(" Bilangan Prima yang kecil dari " +bil+ " = " );
        object.SieveOfSundaram(bil);
    }
}
