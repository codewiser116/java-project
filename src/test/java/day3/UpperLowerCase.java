package day3;

public class UpperLowerCase {
    public static void main(String [] args){
        String one = "Chicago";
        System.out.println(one); //Chicago

        one = one.toLowerCase();
        System.out.println(one); //chicago

        System.out.println( one = one.toUpperCase() + one + " HERE"); // CHICAGO

        System.out.println(one); //chicago


        System.out.println(one.equals(one.toUpperCase())); //false


        String sentence = "Hello everybody, happy friday, lets have fun!";

        System.out.println(sentence = sentence.toLowerCase());
        System.out.println(sentence = sentence.toUpperCase());

        System.out.println(sentence); //








    }
}
