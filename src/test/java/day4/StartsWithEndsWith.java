package day4;

public class StartsWithEndsWith {
    public static void main (String [] args){

        String sentence = "Finally the spring has come!";
        boolean b = sentence.startsWith("Fi"); //true

        System.out.println(b);

        boolean c = sentence.endsWith("!");
        System.out.println(c); //true

        // check if sentence startswith lower case f ====> return true

        c = sentence.toLowerCase().startsWith("f");



        // Task 1
        String url = "https://www.example.com";
        System.out.println("The url starts with https: " + url.startsWith("https:"));

        // Task 2
        String email = "user@example.com";
        System.out.println("The email ends with @gmail.com: " + email.endsWith("@gmail.com"));

        // Task 3
        String document = "document.pdf";
        boolean isCorrect = document.endsWith(".pdf");
        System.out.println("The document is pdf: " + isCorrect);

//        ============= TASKS to practice using startsWith, endsWith, trim

        // 1. Check if report.txt file is inside /user/admin
        String filePath = "/users/admin/docs/report.txt";
        boolean isInUserDirectory = filePath.startsWith("/users/admin");
        System.out.println("File is in user directory: " + isInUserDirectory);
        // Output: File is in user directory: true

        // 2. Given string greeting, print following output
        String greeting = "    Hello, World!    ";
        // Before Trim: '    Hello, World!    '
        // After Trim: 'Hello, World!'
        System.out.println("Before Trim: '" + greeting +"'");
        System.out.println("After Trim: '" + greeting.trim() +"'");

        // 3. Check if phoneNumber starts with +1
        String phoneNumber = "+1-800-555-0199";
        boolean startsWithUSCode = phoneNumber.startsWith("+1");
        System.out.println("US phone number: " + startsWithUSCode); // Output: US phone number: true

        // 4. Check if image is png file
        String imageUrl = "avatar.png";
        boolean isPngImage = imageUrl.endsWith(".png");
        System.out.println("Is PNG image: " + isPngImage); // Output: Is PNG image: true





    }
}
