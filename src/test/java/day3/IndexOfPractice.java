package day3;

public class IndexOfPractice {
    public static void main(String[] args) {

        String potato = "I love FRUIts, but NoT vegeTables. But vegetables are beTter!";

        int a = potato.indexOf('T'); //21
        System.out.println(a);

        int b = potato.indexOf("Tabl");
        System.out.println(b);

        int c = potato.indexOf("t ve");
        System.out.println(c);

        int d = potato.indexOf("beTt");
        System.out.println(d);

        String tomato = "Tomatoes are from America";
        System.out.println("The length = " + tomato.length());

        System.out.println("Dog".length()); //3
        System.out.println(" Cat".length()); //4
        System.out.println(" cat.".length()); //5
        System.out.println("".length()); //0

        String word = "value";
        word = "something";
        word = null;
        String school = "fasfa";
        System.out.println(word);

        System.out.println(school.equals(word)); //false
        System.out.println(word.equals(school)); //null pointer exception

        System.out.println(word == school);
        System.out.println(school == word);


    }
}
