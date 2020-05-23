
package ch05;

public class ObjectRes7Bag2_No4_Algoritma_LongestIS {
    public static void main(String[] args) {
        int aar[] = {30, 22, 9, 33, 25, 55, 41, 60};
        Res7Bag2_No4_Algoritma_LongestIS is = new Res7Bag2_No4_Algoritma_LongestIS();
        int n = aar.length;
        System.out.println("Length dari LongestIS adalah = " +is.lis(aar, n) +" \n");
    }
}
