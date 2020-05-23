
package ch05;
import java.util.Scanner;

public class ObjectRes7Bag2_No1_Algoritma_Euclidean {
    public static void main(String[] args) {
        Res7Bag2_No1_Algoritma_Euclidean euclidean = new Res7Bag2_No1_Algoritma_Euclidean();
        System.out.println("Program Aljabar Euclidean -> Menghitung PBB");
        System.out.println();
        Scanner in = new Scanner (System.in);
        System.out.println("Input nilai p = ");
        euclidean.p = in.nextInt();
        
        Scanner out = new Scanner (System.in);
        System.out.println("Input nilai q = ");
        euclidean.q = out.nextInt();
        
        Scanner up = new Scanner (System.in);
        System.out.println("Input nilai r = ");
        euclidean.r = up.nextInt();
        
        euclidean.cetak();
    }
}
