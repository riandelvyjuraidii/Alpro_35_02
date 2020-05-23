
package ch06;

public class ObjectRes10Bag2_No2c_Algoritma_SSort {
    public static void main(String[] args)
    { 
        Res10Bag2_No2c_Algoritma_SSort ssort = new Res10Bag2_No2c_Algoritma_SSort();
        int aar [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        ssort.sort(aar);
        System.out.println("Data Array setelah di SSORT ");
        ssort.printArray(aar);
    }
}
