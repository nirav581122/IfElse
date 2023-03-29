import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        //Getting User Input from Keyboard
        Scanner scanner = new Scanner(System.in);
        //storing in year variable using scanner object
        System.out.print("Input 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input 3rd number: ");
        int num3 = scanner.nextInt();
        System.out.print("Input 4th number: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter 5th number: ");
        int num5 = scanner.nextInt();
        //Total will give answer and divided by 5 so will get avaearge number
        int total=((num1+num2+num3+num4+num5)/5);
        System.out.println("Average Value of this five number is :"+ total);
    }
}
