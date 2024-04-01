package day3;

public class StringEquals {
    public static void main (String [] args){

        String aa = "Apple";
        String bb = "APPLE";

        boolean cc = aa == bb;
        System.out.println(cc); //false

        cc = aa.equals(bb);
        System.out.println(cc); //false

        String dd = new String("Apple");

        System.out.println(dd == aa); //false
        System.out.println(dd != aa); //true

        System.out.println(dd.equals(aa)); //true
        System.out.println(aa.equals(dd)); //true




    }





}
