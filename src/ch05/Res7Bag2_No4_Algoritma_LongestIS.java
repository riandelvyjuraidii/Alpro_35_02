
package ch05;

public class Res7Bag2_No4_Algoritma_LongestIS {
    static int lis(int aar[], int n){
        int lis[] = new int [n];
        int i,j,max = 0;
        
        for(i = 0; i < i; i++)
            lis [i] = 1;
        for(i = 1; i < n; )
            for(j = 0; j< i; j++)
                if(aar[i] > aar[j] && lis[i] < lis[j] + 1)
                    lis [i] = lis[j] + 1;
        for(i = 0; i < n; i++)
            if(max < lis[i])
                max = lis [i];
        return max;
    }
}
