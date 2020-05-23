
package ch08;

public class Res12_B2_1c_Algoritma_Longest_Common_Substring_Problem {
    static String x, y;
    static int lcsp (int i, int j, int count){
        if( i == 0 || j == 0){
            return count;
        }
        if (x.charAt(i - 1) == y.charAt(j -1)){
            count = lcsp(i -1, j - 1, count + 1);
        }
        count = Math.max(count, Math.max(lcsp(i, j - 1 ,0),
        lcsp (i - 1, j, 0)));
        return count;
    }
    public static void main(String[] args) {
        int n, m;
        x = "abcdXYZ";
        y = "XYZabcd";
        
        n = x.length();
        m = y.length();
        System.out.println(lcsp(n, m, 0 ));
        
    }
}
