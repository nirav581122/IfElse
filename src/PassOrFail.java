import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {
        //Getting User Input from Keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Name:" + "\n" + "Roll Number:" + "\n" + "Maths Marks:" + "\n" + "sci Marks:" + "\n" + "Eng Marks:");
        String name = scanner.nextLine();
        //storing all the input data on various variable name
        int rollNumber = scanner.nextInt();
        int mathsMark = scanner.nextInt();
        int sciMark = scanner.nextInt();
        int engMark = scanner.nextInt();
        //check with if else statement that no one has less then 35
        if ((mathsMark >= 35)&&(sciMark>=35)&&(engMark>=35))
        {
            System.out.println("You Are Pass");
        }
        else {
            System.out.println("you are fail");

        }
    }
}
