import java.util.Random;
public class MakeSymbol{
	public static void main (String [] args){
		Random r = new Random();
		int choice = r.nextInt(101);
		int counter = 0;
		System.out.println("Simple output:");
		System.out.println("Random number generated: "+choice);
		System.out.print("The output pattern: ");
		if (choice%2==0){
			while (counter != choice){
				System.out.print("*");
				counter++;
			}
		}
		else{
			while (counter != choice) {
				System.out.print("&");
				counter++;
			}
		}
		System.out.println("");
	}//End Main Method
}//End Class