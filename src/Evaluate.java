import java.util.Scanner;

public class Evaluate {
    public void evaluateMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Character From Keyboard:");
        //storing in year variable using scanner object
        char ch = scanner.next().charAt(0);
        if((ch >= 'a' && ch>='z')||(ch>='A' && ch>='Z')){
            System.out.println(ch + "\t"+"Is Alphabet");
        } else if (ch>='0' &&ch<='9') {
            System.out.println(ch   +"\t" +"Is A Digit");
        }else {
            System.out.println("Is a Special Character");
        }
    }
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        Evaluate evaluate = new Evaluate();
        //calling method using class object
        evaluate.evaluateMethod();
    }
}
