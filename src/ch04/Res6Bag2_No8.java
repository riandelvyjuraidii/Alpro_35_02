
package ch04;

public class Res6Bag2_No8 {
    int [] aray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int sum = 0;
    int j = 0;
    
    public void cetak(){
        for (int lum : aray){
            sum = sum + lum ;
        }
        System.out.println("Jumlah data pada aray = "+aray.length);
        System.out.println("Jika dijumlahkan = "+sum);
    }
    public void cetak2(){
        for(int q = 0; q<aray.length; q++){
            if(aray[q]<=10 ){
                j=j+1;
            }
            int last = (aray.length*2)-j;
            System.out.println(" Jumlah angka pada aray = "+last);
        }
    }
}
