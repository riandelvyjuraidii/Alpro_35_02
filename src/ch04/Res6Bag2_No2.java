
package ch04;

public class Res6Bag2_No2 {
    int [] aray = {82, 12, 41, 38, 19, 26, 9, 48, 20 ,55, 8, 32, 3};
    int angka;
    boolean found = false;
    
    public void cetak(){      
        for(int i=0;i<aray.length;i++){
            System.out.println(aray[i]+". ");
        }
    }
    public void cetak2(){
        for(int i=0;i<aray.length;i++){
            if(aray[i]==angka){
                found = true;
                int z = i;
                System.out.println(+z);
            }
        }
        if(found == false){
        System.out.println("Tidak ada hasil");
        }
    }
}