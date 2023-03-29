import java.util.Scanner;

public class LeapYear {
    public void checkLeapYear(){
        //Getting User Input from Keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 4 Digit of Year (e.g.=1926 )");
        //storing in year variable using scanner object
        int year =scanner.nextInt();
        //exactly divided by 4 (such as 2016, 2020, 2024, etc)
        //exactly divided by 400, then it is (such as 2000, 2400)
        //exactly divided by 100, then it isn't (such as 2100, 2200, etc)
        if(((year%4==0)||(year%400==0))&&((year%100!=0)))

        {
            System.out.println("Leap Year" +" " + year);
        }
        else {
            System.out.println("Not Leap Year" +" "+ year);
        }
    }
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        LeapYear leapYear = new LeapYear();
        //calling method using class object
        leapYear.checkLeapYear();

    }
}
