package day4;

public class RecapStringMethods {
    public static void main(String[] args) {

        String fullname = "John Doe";
        String initials; //JD

        initials = fullname.charAt(0) + "" + fullname.charAt(5);
        System.out.println(initials);

        // The number of letters in full name is: 7
        System.out.println("The number of letters in full name is: " + (fullname.length() - 1));


        String word1 = "raspberry";
        String word2 = "Raspberry";
        String word3 = new String("Raspberry");

        /*
                    ==          .equals()       toLowerCase()       toUpperCase()

        word1=word2 ==> true
        word1=word2 ==> false

        word1=word3 ==> true
        word1=word3 ==> false
         */

        System.out.println(word1.equals(word2.toLowerCase()));  //true
        System.out.println(word1 == word2);

        System.out.println(word1.equals(word3.toLowerCase()));
        System.out.println(word1.equals(word3));


        /*
        Task 1: Check Website Protocol
        Objective: Write a program that checks if a given website URL starts with "http://" or "https://". Print an appropriate message based on the check.
        Example Input: "https://www.example.com"
        Example Output: "The URL uses HTTPS protocol."

        Task 2: Validate Email Domain
        Objective: Create a program that validates if an email address ends with a specific domain, e.g., "@gmail.com". Print a message indicating whether the email is valid or not.
        Example Input: "user@example.com"
        Example Output: "Email domain is not valid."

        Task 3: File Extension Checker
        Objective: Write a program that checks the file extension of a given filename. The program should verify if the file ends with ".pdf" and print a corresponding message.
        Example Input: "document.pdf"
        Example Output: "The file is a PDF document."













         */

    }
}
