
package ch09;

import java.util.Arrays;

public class Res13Bag2_No3c_SOS {
    static int SieveOfSundaram(int x){
        int xNew = (x - 2) / 2;
        
        boolean marked [] = new boolean [xNew + 1];
        
        Arrays.fill(marked, xNew, xNew, false);
        
        for (int a = 1; a <= xNew; a++)
            for(int b = a; (a+b+2*a*b) <= xNew; b++)
                marked[a+b+2*a*b] = true;
        if(x > 2)
            System.out.println(2+" ");
        for(int a = 1; a <= xNew; a++)
            if(marked[a] == false)
                System.out.println(2*a+1+" ");
        return - 1;
    }
}
