
package ch04;
import java.util.Scanner;
import java.util.Arrays;
public class Res6Bag2_No11 {
    int [] aray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    public void cetak(){
        Arrays.sort(aray);
        for(int i = 0; i < aray.length; i++){
            System.out.println(aray[i]+", ");
        }
    }
}
