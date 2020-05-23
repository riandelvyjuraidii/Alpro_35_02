
package ch08;

public class Res12_Bag2_No2c_AlgoritmaBoyerMoore_String_Search {
    static int no_of_Char = 254;
    static int max (int a, int b){return (a > b)? a : b;}
    
    static void badCharHeuristic (char [] str, int size, int badChar []){
        int i;
        
        for (i = 0; i < no_of_Char; i++)
            badChar[i] = -1;
        for (i = 0; i < size; i++)
            badChar[(int)str [i]] = i;
    }
    static void search (char txt[], char pat[]){
        int m = pat.length;
        int n = txt.length;
        
        int badChar [] = new int [no_of_Char];
        
        int sr = 0;
        while (sr <= (n - m)){
            int j = m - 1;
            while (j >= 0 && pat[j] == txt[sr+j])
                j--;
            if(j < 0){
                System.out.println(" pateners occur at shift = ");
                sr += (sr+m < n)? m-badChar[txt[sr+m]] : 1;
        }
            else 
                sr += max(1, j - badChar[txt[sr + j]]);
        }
    }
    public static void main(String [] args){
        char txt[] = "AABBCCDD".toCharArray();
        char pat[] = "ABC".toCharArray();
        search(txt, pat);
    }
}