package day2;

public class CompoundOperators {
    public static void main (String [] args){
        /*
         *  ++ means add 1
         *  -- means subtract 1
         */

        int a = 10;
        a++; // 10 + 1
        a++; // 11 + 1
        System.out.println(a); // 12

        int b = 100;
        b--;
        System.out.println(b); // 99


        int c  = 10;
        c += 2; // c = c + 2
        System.out.println(c); // 12

        int d = 5;
        d = d + 10; // d += 10;
        System.out.println(d); //15


        int e = 100;
        e /= 2; // e = e / 2;
        System.out.println(e);

        int f = 20;
        f *= 3; // f = f * 3;
        System.out.println(f); // 60





    }
}
