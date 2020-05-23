
package ch07;

public class ObjectRes11Bag2_No2b_Algoritma_MergeS {
    public static void main(String[] args) {
        int aar [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        Res11Bag2_No2b_Algoritma_MergeS obj = new Res11Bag2_No2b_Algoritma_MergeS();
        System.out.println("Inputan Aray ");
        obj.printArray(aar);
        
        obj.srt(aar, 0, aar.length - 1);
        System.out.println();
        System.out.println("Setelah di merge Sort ");
        obj.printArray(aar);
    }
}
