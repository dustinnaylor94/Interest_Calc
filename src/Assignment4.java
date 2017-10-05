/**
 * Dustin Naylor
 * 9/25/2017
 * Interest Calculator. Asks for input for initial principal, interest rate, and number of years and displays the
 * growth of the investment each year compounded yearly.
 */
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args){
        //declare variables
        float principal; float rate; int years; float interest;

        //create Scanner
        Scanner input = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter Principal: ");
        principal=input.nextFloat();
        System.out.println("Enter Yearly Interest Rate: ");
        rate=input.nextFloat();
        System.out.println("Enter Number of Years: ");
        years=input.nextInt();

        //calculate interest each year and display results
        System.out.println("Year   Interest   Principal");
        System.out.printf("%4d",0);
        System.out.printf("%11.2f",0.00f);
        System.out.printf("%12.2f",principal);
        for (int i=0; i<years; i++){
            interest=principal*(rate*.01f);
            principal+=interest;
            System.out.printf("\n%4d",i+1);
            System.out.printf("%11.2f",interest);
            System.out.printf("%12.2f",principal);

        }
        //close scanner
        input.close();

    }
}
