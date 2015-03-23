import java.util.Scanner;
public class FourDigits{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
		double input = scan.nextDouble();
		double a = input*10000;
		int b = (int)a;
		int c = (int)input;
		int d = c*10000;
		int e = (int)a-d;
		System.out.println("The four digits after the decimal are: "+e);
	}
}