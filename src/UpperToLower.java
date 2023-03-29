import java.util.Locale;
import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        //User Input
        Scanner scanner =new Scanner(System.in);
        System.out.println("please Enter Any alphabet In Lower Case");
        String string =scanner.nextLine();
        System.out.println("Before Change:"+"\t"+string);
        //Used String in built method used to convert string in upper case
        System.out.println("After Change:"+"\t"+string.toUpperCase(Locale.ROOT));
    }
}
