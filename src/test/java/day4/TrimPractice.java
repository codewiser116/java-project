package day4;

public class TrimPractice {
    public static void main(String[] args) {

        // trim() method removes whitespaces from String's both ends
        // the whitespaces in between words won't be removed

        String table = " Big Round Table      ";
        System.out.println(table + " " + table.length());

        table = table.trim();
        System.out.println(table + " " + table.length());


        String chair = "Brown       Wooden Chair";
        chair = chair.trim();
        System.out.println(chair);






    }
}
