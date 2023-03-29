import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Value of X and Y");
        int x = scanner.nextInt();
        int y =scanner.nextInt();
        System.out.println("Before Change:" + x + "\t"+ y);
        //temp variable name has been created
        int temp;

        temp=x;//x nil
        x=y;//now x=16
        y=temp;//now temp value go to y so y is now 11
        System.out.println("After Change  : " + x +"\t"+ y);

    }
}
