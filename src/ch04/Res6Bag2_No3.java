
package ch04;

public class Res6Bag2_No3 {
    int [] arai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    public void cetak(){
        for (int i = 0; i < arai.length; i++){
            if(arai[i]%2==1){
                System.out.println(arai[i]+". ");
            }
        }
    }
}