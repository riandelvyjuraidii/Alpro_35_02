
package ch07;

public class Res11Bag2_No2b_Algoritma_MergeS {
    public void merge (int aar[], int p, int q, int r){
        int f1 = q - p + 1;
        int f2 = r - q;
        
        int A[] = new int [f1];
        int B[] = new int [f2];
        for (int i = 0; i < f1; i++)
            A[i] = aar[p + i];
        for(int j = 0; j < f2; j++)
            B[j] = aar[q + 1 + j];
        int i = 0, j = 0;
        int k = p;
        while(i < f1 && j < f2){
            if(A[i] <= B [j]){
                aar[k] = A [i];
                i++;
            }
            else{
                aar[k] = B[j];
                j++;
            }k++;
        }
        while (i < f1){
            aar[k] = A[i];
            i++;
            k++;
        }
        while (j < f2){
            aar[k] = B[j];
            j++;
            k++;
        }
    }
    public void srt(int aar[], int l, int rr){
        if(l < rr){
            int mer = (l + rr)/2;
            srt(aar, l, mer);
            srt(aar, mer + 1, rr);
            merge(aar, l, mer, rr);
        }
    }
    public static void printArray(int aar[]){
        int v = aar.length;
        for(int i = 0; i < v; i++)
            System.out.println(aar[i]+"");
        System.out.println();
    }
}