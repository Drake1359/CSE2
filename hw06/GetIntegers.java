import java.util.Scanner;
public class GetIntegers{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int cumulative = 0;
		System.out.println("Please enter 5 non-negative integers:");
		
		if (scan.hasNextInt()){
			while (counter < 5){
				int number = scan.nextInt();
				if (number >= 0){
						cumulative= number+cumulative;
						counter++;
				}
				if (number < 0)	{
					System.out.println("Invalid input, enter again");
				}
			}	
		System.out.println("Sum is "+cumulative);
		}
	}//End Main Method
}//End Class