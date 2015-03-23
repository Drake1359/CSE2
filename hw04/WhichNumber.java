import java.util.Scanner;
//Import Scanner
public class WhichNumber{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("Think of a number between 1 and 10 inclusive.");
		System.out.print("Is your number even? ");
		input = scan.next();
		if (input == "Y" || input == "y"){
			System.out.print("Is it divisible by 3 ");
			input = scan.next();
			if(input == "Y" || input == "y"){
				System.out.print("Is your number 6? ");
					
					if(input == "Y" || input == "y"){
						System.out.println("Yay!");
					}//End 6 if
					else if (input == "N" || input == "n"){
						System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
					}//End 6 else if
					else{
						System.out.println("That is not a valid input.");
					}//End 6 else
			}//End Div3 Yes if
			else if (input == "N" || input == "n"){
				System.out.print("Is the number divisible by 4? ");
				input = scan.next();
					if (input == "Y" || input == "y"){
						System.out.print("Is the number divided by 4 greater than 1? ");
						input = scan.next();
							if (input=="Y" || input=="y"){
								System.out.print("Is your number 8? ");
								input = scan.next();
									if (input=="Y" || input=="y"){
										System.out.println("Yay!");
									}//End 8 if
									else if (input=="N" || input=="n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 8 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 8 else
							}//End >1 Div4 Yes if
							else if (input=="N" || input=="n"){
								System.out.print("Is your number 4? ");
								input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 4 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 4 else if
									else{
										System.out.println("That is not a valid input.");
									}//End 4 else
							}//ENd >1 Div4 No else if
							else{
								System.out.println("That is not a valid input.");
							}//ENd >1 Div4 Else
					}//End Div4 Yes if
					else if (input == "N" || input == "n"){
						System.out.print("Is it divisible by 5? ");
						input = scan.next();
							if (input == "Y" || input == "y"){
								System.out.print("Is your number 10? ");
								input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 10 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 10 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 10 else
							}//End Div5 Yes if
							else if (input == "N" || input == "n"){
								System.out.print("Is your number 2? ");
								input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 2 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 2 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 2 else
							}//End Div5 No else if
							else {
								System.out.println("That is not a valid input.");
							}//End Div 5 else
					}//End Div4 Else if
					else {
						System.out.println("That is not a valid input");
					}//End Div 4 Else
			}//End Div3 No if
			else{
				System.out.println("That is not a valid input.");
			}//End Div3 Else
		}//End 'Even' If
		else if (input == "N" || input == "n"){
			System.out.print("Is it divisible by 3? ");
			input = scan.next();
				if (input=="Y" || input=="y"){
					System.out.print("When divided by 3 is the result greater than 1? ");
					input = scan.next();
						if (input == "Y" || input == "y"){
							System.out.print("Is your number 9? ");
								input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 9 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 9 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 9 else
						}//End >1 Div3 Yes If
						else if (input == "N" || input == "n"){
							System.out.print("Is your number 3? ");
								input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 3 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 3 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 3 else
						}//End >1 Div3 No Else If
				}//End Div3 Yes If
				else if (input == "N" || input == "n"){
					System.out.print("Is it greater than 6? ");
					input = scan.next();
						if (input == "Y" || input == "y"){
							System.out.print("Is your number 7? ");
							input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 7 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 7 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 7 else
						}//End >6 Yes If
						else if (input == "N" || input == "n"){
							System.out.print("Is it less than three? ");
							input = scan.next();
								if (input == "Y" || input == "y"){
									System.out.print("Is your number 1? ");
									input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 1 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 1 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 1 else
								}//End <3 If
								else if (input == "N" ||input == "n"){
									System.out.print("Is your number 5? ");
									input = scan.next();
									if (input == "Y" || input == "y"){
										System.out.println("Yay!");
									}//End 5 if
									else if (input == "N" || input == "n"){
										System.out.println("Oops, no number is possible between 1 and 10 with those factors...");
									}//End 5 else if
									else {
										System.out.println("That is not a valid input.");
									}//End 5 else
								}//End <3 Else if
								else{
									System.out.println("That is not a valid input.");
								}//End <3 Else
						}//End >6 No Else If
						else{
							System.out.println("That is not a valid input.");
						}//End >6 Else
				}//End Div3 No Else If
				else {
					System.out.println("That is not a valid input.");
				}
		}//End 'Odd' Else If
		else{
			System.out.println("Sorry, that is not a valid input.");
		}
	}//End Main Method
}//End Class