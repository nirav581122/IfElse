import sun.font.DelegatingShape;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name");
        String sellerName = scanner.nextLine();
        System.out.println("Enter Sales Id");
        int salesId = scanner.nextInt();
        System.out.println("Enter Sales Amount");
        double salesAmount = scanner.nextDouble();
        System.out.println("Basic Salary");
        double basicSalary = scanner.nextDouble();
        //As per Sales amount commission has been counted with if Else
        if(salesAmount>=10000){
            System.out.println("your Commission is "+(salesAmount*0.05));
        } else if (salesAmount>=20000)
        {
            System.out.println("your Commission is"+(salesAmount*0.10));
        } else if (salesAmount>=30000)
        {
            System.out.println("your Commission is "+(salesAmount*0.20));
        } else if (salesAmount>=50000)
        {
            System.out.println("your Commission is"+(salesAmount*35));
        }
        else
        {
            System.out.println("");
        }
    }
}
