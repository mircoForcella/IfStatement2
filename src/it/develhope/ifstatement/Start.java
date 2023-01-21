package it.develhope.ifstatement;

public class Start {
    static String mySurname = "Forcella";

    public static void main(String[] args) {
        String test = (mySurname.contains("ni")) ?  "Your surname contains the sequence of letters 'ni'" : "Your surname doesn't contain the sequence of letters 'ni'";

        System.out.println(test);
    }
}
