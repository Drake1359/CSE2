import java.util.Scanner;
public class RunFactorial{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer that is between 9 and 16: ");
		int input = scan.nextInt();
		int permanentinput = input;
		int counter = 0;
		int result = input;
		if (input < 9 || input > 16){
			System.out.println("Invalid input, enter again!");
			input = scan.nextInt();
			permanentinput = input;
			result = input;
		}
		else {
			while (counter < (permanentinput-1)){
				int factorial = input-1;
				result = factorial*result;
				input = factorial;
				counter++;
				}
		}
		
		System.out.println("Input Accepted: ");
		System.out.println(permanentinput+"!= "+result);
	}
}