
package ch07;

public class Res11Bag2_No2a_Algoritma_BlockSort {
    int [] aar = new int [] {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int temp=0;
    
    public void cetak(){
        System.out.println("Array yang diinputkan = ");
        for(int i = 0; i < aar.length; i++){
            System.out.println(aar [i]+", ");
        }
        for(int i = 0; i < aar.length; i++){
            for( int j = 0; j < aar.length; j++){
                if (aar[i] < aar[j]){
                    temp = aar[i];
                    aar[i] = aar[j];
                    aar[j] = temp;
                }
            }
            
        }
        System.out.println();
        System.out.println("Urutan Array setelah di blockSort ");
        for (int i = 0; i < aar.length; i++){
            System.out.println(aar[i] +", ");
        }
        System.out.println();
    }
}
