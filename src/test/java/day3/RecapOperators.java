package day3;

public class RecapOperators {
    public static void main (String [] args){

        String city = "London";
        String country = "Great Britain";

        // London is the capital of the Great Britain

        System.out.println(city + " is the capital of the " + country);


        String name = "Bena";
        byte age = 28;

        // My name is Bena. I'm 28 years old.

        // Bena has been to London 28 times, which is located in the Great Britain.
        System.out.println(name + " has been to " + city + " " + age + " times, which is located " +
                "in the " + country);

        byte a = 1;
        short b = 2;

        // put b to a
        a = (byte)b;

        System.out.println(a); //2

        int juice = 679796979;
        int coffee = 463635656;
        int extraJar = juice;
        juice = coffee;
        coffee = extraJar;

        System.out.println(juice); // 463635656
        System.out.println(coffee); // 3645645
        // HINT: you can create one more int


        int number = 9;

        // print the remainder of 9 after divided by 2

        System.out.println(number % 6); //3

        String word = "byebdb 352523 /:L:KO:)*)8))*";



    int e = 1;
    int g = 9;

    //19
        System.out.println("" + e + g );

        String s = "hello";
        s = "hello everyone";





    }
}
