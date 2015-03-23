import java.util.Scanner;
public class Waves {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a number between 1 and 30: ");
		int input = scan.nextInt();
	if (input <31 && input >0){
		System.out.println("FOR LOOP:");
		for (int i = 1;i <= input; i++){
			if ((i)%2 != 0){
				for (int j = i; j > 0 ; j--){
					for (int count = j ; count > 0 ; count--){
						System.out.print(i);
					}
					System.out.println("");
				}
			}//End Odd If
			if ((i)%2 == 0){
				for (int j = 1;  j <= i ; j++){
					for (int count = 1 ; count <= j; count++){
						System.out.print(i);
					}
					System.out.println("");
				}
			}//End Even If
		}//End For Loop
		System.out.println("WHILE LOOP:");
		int i = 1;
		int j = 0; 
		int count;
		while (i <= input){
			if ( i%2 != 0){
				j = i;
				while(j>0){
					count = j;
					while (count>0){
						System.out.print(i);
						count--;
					}
					System.out.println("");
					j--;
				} 
			}//End Odd If
			if (i%2 == 0){
				j = 1;
				while(j<=i){
					count = 1;
					while(count <= j){
						System.out.print(i);
						count++;
					}
					System.out.println("");
					j++;
				}
			}//End Even If
			i++;
		}//End While Loop
		System.out.println("DO-WHILE LOOP:");
		i = 1;
		j = 0; 
		do{
			if ( i%2 != 0){
				j = i;
				do{
					count = j;
					do{
						System.out.print(i);
						count--;
					}while (count>0);
					System.out.println("");
					j--;
				}while(j>0);
			}//End Odd If
			if (i%2 == 0){
				j = 1;
				do{
					count = 1;
					do{
						System.out.print(i);
						count++;
					}while(count <= j);
					System.out.println("");
					j++;
				}while(j<=i);
			}//End Even If
			i++;
		}while (i <= input);
		//End Do While Loop
	}//End If
	else {
		System.out.println("That isn't between 1 and 30.");
	}	
	}//End Main Method
}//End Class