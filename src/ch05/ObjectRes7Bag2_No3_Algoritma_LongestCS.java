
package ch05;
import java.util.Scanner;

public class ObjectRes7Bag2_No3_Algoritma_LongestCS {
    public static void main(String[] args) {
        Res7Bag2_No3_Algoritma_LongestCS lcs = new Res7Bag2_No3_Algoritma_LongestCS();
        System.out.println("Algoritma Longest Common Subsequence = ");
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input bilangan pertama = ");
        String s1 = in.nextLine();
        
        Scanner out = new Scanner (System.in);
        System.out.println("Imput bilangan kedua = ");
        String s2 = out.nextLine();
        
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        
        int a = X.length;
        int b = Y.length;
        
        System.out.println(" Length dari LCS adalah = " +lcs.lcs(X, Y, a, b));
    }
}
