package day4;

public class SubstringPractice {
    public static void main(String[] args) {

        /**
         * substring(int index) - returns new string
         * from given index, and ignore the characters that were
         * before that index
         *
         * J a v a
         * 0 1 2 3
         *
         * java.substring(2) ==> va
         */

        String word = "Java";
        /*
        J - 0,
        a - 1,
        v - 2,
        a - 3
         */

       word = word.substring(2);
       System.out.println(word);

        String instrument = "guitar";
        String newWord = instrument.substring(3); //tar
        System.out.println(newWord);

        newWord = instrument.substring(5); // r
        System.out.println(newWord);

        System.out.println(instrument.substring(5)); //out of bounds exception


        String breakfast = "Banana chocolate pancake";
        // using substring
        String fruit = breakfast.substring(0, 6);
        String sweet = breakfast.substring(7,16);
        String pastry = breakfast.substring(17);

        System.out.println(fruit);
        System.out.println(sweet);
        System.out.println(pastry);


        String vegetable = "tomato cucumber";
        System.out.println(vegetable.charAt(2)); // m
        System.out.println(vegetable.indexOf("t")); // 0











        String fullName = "uhrtrtuihh Jolie";
        String first_name = fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
        System.out.println(first_name);


        String email = "nilufar@gmail.com";
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(domain);


        String document = "lwEKADYGNALEKRESNHESRILHNERHNERINHRHNELRKNHHR.pdf";
        String filename = document.substring(0, document.indexOf("."));
       System.out.println(filename);






    }
}
