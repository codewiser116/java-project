package day3;

public class CharAtPractice {
    public static void main(String[] args) {

        String animal = "dog";
        char letter = animal.charAt(2);

        System.out.println(letter);

        System.out.println(animal.charAt(0));

        animal = animal + animal;
        System.out.println(animal); //dogdog

        System.out.println(animal.charAt(4)); //

        char letter2 = animal.charAt(5);


        String welcomeSign = "Welcome to Hawaii! Aloha!";

        letter = welcomeSign.charAt(5); //m

        System.out.println(letter);

        System.out.println(welcomeSign.charAt(11)); //H


    }
}
