package day2;

public class Casting {

    public static void main (String [] args){

        // copied value of num1 to num2
        byte num1 = 12;
        byte num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        // implicit casting
        byte num3 = 50;
        short num4 = num3;

        System.out.println(num3);
        System.out.println(num4);

        // explicit casting
        short num5 = 2;
        byte num6 = (byte)num5;


        int p = 90;
        System.out.println(p);


        int a = 0; // 4 bytes
        short b = (byte) a; // 2 bytes

        System.out.println(b + a);

        long c = 30;
        byte d = (byte) c;



        boolean q = true;
        System.out.println(q);
        q = false;


        boolean w = false;
        System.out.println(w);

        boolean r = true;
        System.out.println(r);

        // when Java sees decimal numbers, it thinks that it's a double
        // therefore, we need to cast the numbers to float explicitly
        float price1 = (float) 4.99;
        float price2 = 5.99f;
        float price3 = 3.99F;

        double d1 = 9.99;
        double d2 = d1;

        d2 = price1; //4.99

        int digit = 43;
        d2 = digit;

        long l1 = 1434324;
        d2 = l1;

        short s1 = 123;
        digit = s1;

        double d5 = 12.9999;
        int i5 = (int) d5;
        System.out.println("the value of i5: " + i5);

        float f1 = 3.2F;
        byte bb = (byte)f1;
        System.out.println(bb); // 3

        int num = 9;

        String num12 = "9";

        double dd = num;

        String word = "hello";

        word = "world";

        String name = "Bena";











    }

}
