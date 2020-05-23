
package ch04;

public class Res6Bag2_No10 {
    int [] aray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int a = 0;
    int new_aray;
    public void cetak(){
        for(int i = 0; i < 12; i++ ){
            a = i +1;
            new_aray = aray[i]-aray[i];
            if(new_aray%2==0){
                System.out.println(new_aray+", ");
            }
        }
    }
}