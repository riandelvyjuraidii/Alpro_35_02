
package ch05;

public class ObjectRes7Bag2_No2_Algoritma_Kadane {
    public static void main(String[] args) {
        
        System.out.println("Algoritma Kadane = Menentukan nilai maximum dari subArray ");
        System.out.println();
        
        Res7Bag2_No2_Algoritma_Kadane kadane = new Res7Bag2_No2_Algoritma_Kadane();
        int araaY [] = {1, 2, -3, -4, 2, 7, -2, 3};
        kadane.cetak();
        System.out.println();
        System.out.println("Maximum subArray = " +kadane.kadane(araaY));
        
        int araaX [] = {-2, -3, -4, -2, -7, -2, -3, -11};
        kadane.cetak2();
        System.out.println();
        System.out.println("Maximum subArray = " +kadane.kadane(araaX));
    }
}