package day2;

public class ComparisonOperators {
    public static void main (String [] args){

        int a = 10;
        int b = 5;

        boolean c = a > b;

        System.out.println(c); // true
        System.out.println(a < b); //false

        System.out.println(100 == -100); //false

        System.out.println(55 > 45 + 10); //false

        System.out.println(10 >= 5 + 5); //true

        short number1 = 100;
        short number2 = 40;

        System.out.println(number1 != number2); //true
        System.out.println(number1 - 60 != number2); // false

        // 80 > 40 true
        boolean isTrue = number1 - 40 / 2 > number2; //true
        System.out.println(isTrue);


        int x = number2 + number1 + 100 - 200;





    }
}
