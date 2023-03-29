import java.util.Scanner;
import java.util.regex.MatchResult;

public class CityName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any alphabet from a to f");
        //first letter is character so stored in char
        char city = scanner.next().charAt(0);
        if (city == 'a'){
            System.out.println("Ahmedabad");
        }
        else if (city == 'b') {
            System.out.println("Bombay");
        }
        else if(city == 'c'){
            System.out.println("Chandigarh");
        }
        else if(city == 'd'){
            System.out.println("Dhanbad");
        }
        else if(city == 'e'){
            System.out.println("Ellhabad");
        }
        else if(city == 'f'){
            System.out.println("Faridabad");
        }
        else{
            System.out.println("");
        }
    }
}