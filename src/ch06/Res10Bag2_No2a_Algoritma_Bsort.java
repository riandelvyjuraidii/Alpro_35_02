
package ch06;

public class Res10Bag2_No2a_Algoritma_Bsort {
    static void bubbleSort (int aar[], int n)
    {
            int i, j, temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++)
    
                {
            swapped = false;
            for(j = 0; j < n - 1; j++)
                {
            if(aar[j] > aar[j + 1]){
    temp = aar[j];
    aar[j] = aar[j + 1];
    aar[j + 1] = temp;
    swapped = true;
    }
}
    if (swapped == false)
        break;
    }
}
            
       static void printArray(int aar[], int size ){
int i;
for(i = 0; i < size; i++)
System.out.println(aar[i] +"");
System.out.println();
}
public static void main(String args[]){
int [] aar = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
int n = aar.length;
bubbleSort(aar, n);
System.out.println(" Urutan Aray setelah BUBBLESORT = ");
printArray(aar, n);
}
}