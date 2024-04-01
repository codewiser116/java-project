package day4;

public class EqualsIgnoreCasePractice {
    public static void main (String [] args){
        /*
        equalsIgnoreCase() checks if two string values are equal
        it doesn't care if letters are lower or upper case
         */

        String country = "USA";

        boolean bb = country.equals("Usa");
        System.out.println(bb);

        bb = country.equalsIgnoreCase("Usa");
        System.out.println(bb);

        System.out.println("HelloWorld".equalsIgnoreCase("helloworld".toLowerCase().toUpperCase())); //true



        String word1 = "abc123;;;;";
        String word2 = "Abc123;;;;";
        System.out.println(word2.equals(word1));
        System.out.println(word1.equalsIgnoreCase(word2));


        String num1 = "123456";
        String num2 = new String("123456");

        System.out.println(num1.equalsIgnoreCase(num2)); //true
        System.out.println(num1 == num2); //false


    }
}
