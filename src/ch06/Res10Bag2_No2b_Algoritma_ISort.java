
package ch06;

public class Res10Bag2_No2b_Algoritma_ISort {
    void sort(int aar []){
        int a = aar.length;
        for(int i = 1; i < a; i++){
        int key = aar[i];
        int j = i - 1;
        
        while (j >= 0 && aar [j] > key){
            aar [j + 1] = aar[j];
            j = j- 1;
        }
        aar[j + 1] = key;
        }
    }
    public static void printArray(int aar[]){
        int a = aar.length;
        for(int i = 0; i < a; i++)
            System.out.println(aar[i]+", ");
        System.out.println();
    }
}