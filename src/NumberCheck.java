import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter any number");
        int givenNumber = scanner.nextInt();
        //If else to find out that given number is positive,negative or zero
        if(givenNumber>0){
            System.out.println("This Number Is Positive"+"\t"+givenNumber);
        } else if (givenNumber<0) {
            System.out.println("This is Negative Number"+"\t"+givenNumber);
        }
        else {
            System.out.println("This Number is zero"+"\t"+givenNumber);
        }

    }
}
