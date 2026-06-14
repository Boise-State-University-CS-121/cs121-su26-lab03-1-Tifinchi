import java.util.Scanner;
import java.util.Random;

public class AccountGenerator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your First Name: ");
        String firstName = scnr.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName = scnr.nextLine();

        String firstLetter = firstName.substring(0, 1);
        String lastFiveLetters = lastName.substring(0, 5);

        int randomNumber = rand.nextInt(90) + 10;

        String userName = firstName + lastFiveLetters + randomNumber;
        userName = userName.toLowerCase();

        System.out.println("User Name: " + userName);
        scnr.close();
    }
}
