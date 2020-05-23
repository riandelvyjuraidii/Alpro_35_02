
package ch04;

public class Res6Bag2_No1 {
    int[] aray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    public void cetak(){
        System.out.println("Menampilkan angka yang ada di dalam Array");
        System.out.println("=========================================");
        for (int i = 0; i < aray.length; i++){
            if(i==12){
                System.out.print(aray[i]+".");
            }else{
                System.out.print(aray[i]+", ");
            }
        }
    }
}