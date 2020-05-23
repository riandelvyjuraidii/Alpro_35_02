
package ch04;

public class Res6Bag2_No9 {
    int [] aray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int a = 0;
    public void cetak(){
        for(int i = 0; i < 12; i++){
            a=i+1;
            System.out.println("(");
            System.out.println(aray [1]-aray[i]+"),");
        }
    }
}
