
package ch06;

public class Res10Bag2_No2c_Algoritma_SSort {
    public static void sort(int aar[]){
        int a = aar.length;
        for(int i = 0; i < a - 1; i++){
            int mn_idx = i;
            for (int j = i + 1; j < a; j++)
                if(aar [j] < aar[mn_idx])
                    mn_idx=j;
            int temp = aar[mn_idx];
            aar[mn_idx]=aar[i];
            aar[i]=temp;
        }
    }
    public void printArray(int aar[] ){
        int a = aar.length;
        for(int i = 0; i< a; ++i)
            System.out.println(aar[i]+"");
        System.out.println();
    }
            
        }