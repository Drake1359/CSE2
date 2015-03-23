import java.util.Scanner;
//Import Scanner
public class Root{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a double and I print its cube root- ");
		double number = scan.nextDouble();
		double guess= number/3;
		int counter = 1;
		double refine;
		while (counter<4){
			refine = (guess*guess*guess+number)/(3*guess*guess);
			guess = refine;
			counter++;
		}
		System.out.println("The cube root is "+guess+": "+guess+"*"+guess+"*"+guess+"="+(guess*guess*guess));
		System.out.println(counter);
	}//End Main Method
}//End Class