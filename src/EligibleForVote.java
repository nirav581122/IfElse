import java.util.Scanner;
public class EligibleForVote {
    public void ageCheck()
    {
        //Getting user input from keyboard
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter Your Age ");
        //storing in age variable using scanner object
        int age=scanner.nextInt();
        if(age>18)
        {
            System.out.println("You are eligible to vote");
        }
          else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        EligibleForVote eligibleForVote = new EligibleForVote();
        //calling method using class object
        eligibleForVote.ageCheck();
    }
}
