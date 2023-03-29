import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        //Create scanner class to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("please Enter Employ Id");
        int id = scanner.nextInt();
        System.out.println("Basic Salary:");
        //salary in two digit so used double data type and basicsalry variable name
        double basicsalary = scanner.nextDouble();
        double hra,da,ta,pf,gross;
        //hra,da,ta and pf as per percentage required
        hra=basicsalary*0.10;
        System.out.println("This is HRA:"+hra);
        da=basicsalary*0.08;
        System.out.println("This is DA:"+da);
        ta=basicsalary*0.09;
        System.out.println("This is TA:"+ta);
        pf=basicsalary*0.20;
        System.out.println("This is PF:"+pf);
        gross=hra+da+ta+pf;
        System.out.println("This is gross Salary:"+gross);
            }

}
