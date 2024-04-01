package day3;

public class IntroToString {
    public static void main (String [] args){
        // There are 2 ways to create a String

        // 1 way
        String name = "Jack";


        // 2 way
        String lastname = new String("Johnson");

        String anotherName = "Jack";
        String oneMoreName = new String("Jack");

        System.out.println(name);
        System.out.println(lastname);

        RecapOperators recapOperators = new RecapOperators();

        String food = "pizza";
        String snack = "pizza";

        // == checks if 2 strings are the same object in heap memory
        System.out.println(food == snack); // true

        // .equals checks if values are same
        System.out.println(food.equals(snack)); //true

        String drink1 = "tea";
        String drink2 = new String("tea");

        System.out.println(drink1 == drink2); //false
        System.out.println(drink1.equals(drink2)); //true




    }
}
