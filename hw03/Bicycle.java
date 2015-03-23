import java.util.Scanner;
//Import Scanner
public class Bicycle{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int seconds;
		int counts;
		double wheelDiameter=27.0,  //Wheel Diameter Constant
  		Pi=3.14159, //Value of Pi
  		feetPerMile=5280,  //Feet Per Mile Conversion
  		inchesPerFoot=12,   //Inches Per Foot Conversion
  		secondsPerMinute=60;  //Seconds Per Minute
		System.out.print("Enter the number of seconds: ");
		seconds = scan.nextInt();
		System.out.print("Enter the number of counts: ");
		counts = scan.nextInt();
		double distance = ((double)((int)(100*counts*wheelDiameter*Pi/inchesPerFoot/feetPerMile))/100), 
		time = ((double)((int)(100*seconds/secondsPerMinute))/100), 
		mph = ((double)((int)(100*distance/(time/60)))/100);
		System.out.println("The distance was "+distance+" miles and took "+time+" minutes.");
		System.out.println("The average speed was "+mph+" mph.");
	}//End Main Method
}//End Class