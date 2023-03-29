import java.util.Scanner;

public class ArithmeticCalculation {
    public void arithmetic(){
        {
            //Getting user Input from Keyboard
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter First number");
            int a = scanner.nextInt();
            System.out.println("please enter Second number");
            int b = scanner.nextInt();
            System.out.println("Choose Operator [1]-multiply [2]-Addition [3]- Minus [4]- Divide ");
            int ch = scanner.nextInt();
            //As per user input check condition with the help of If else
            if (ch == 1) {
                System.out.println("Answer: " + (a * b));
            } else if (ch == 2) {
                System.out.println("Answer: " + (a + b));
            } else if (ch == 3) {
                System.out.print("Answer: " + (a - b));
            } else if (ch == 4) {
                System.out.println("Answer: " + (a / b));
            }
        }

    }

    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        ArithmeticCalculation arithmeticCalculation = new ArithmeticCalculation();
        //calling method using class object
        arithmeticCalculation.arithmetic();
    }
}