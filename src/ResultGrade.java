import java.util.Scanner;

public class ResultGrade {
    public void grading(){
        //Getting User Input from Keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Name:"+"\n"+"Roll Number:"+"\n"+"Maths Marks:"+"\n"+"sci Marks:"+"\n"+"Eng Marks:");
        String name = scanner.nextLine();
        int rollNumber= scanner.nextInt();
        int mathsMark =scanner.nextInt();
        int sciMark =scanner.nextInt();
        int engMark =scanner.nextInt();
        int total= (mathsMark+sciMark+engMark);
        double percentage;
        //To find percentage
        percentage =((total/3));
        System.out.println("The total of Three Subject is:"+ total);
        System.out.println("The percentage of Three Subject is:"+percentage);
        //Checking percentage is belonged to with the help of if a Condition
        if(percentage>=80)
        {
            System.out.println("your Grade is : A+");

        }
        else if (percentage>=60) {
           System.out.println("your Grade is : A");
           }
        else if (percentage>=50) {
            System.out.println("your Grade is : B");
        }
        else if (percentage>=35) {
            System.out.println("your Grade is : C");
        }
    }
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        ResultGrade resultGrade = new ResultGrade();
        //calling method using class object
        resultGrade.grading();

    }
}
