import java.util.Scanner;
import java.util.Random;
public class HW8 {

	public static String getInput(Scanner scan){
		int choice = scan.nextInt();
		switch(choice){
			case 1: return "Congratulations! You get the Master Sword! All shall bow to thee!";
			case 2: return "Congratulations! You get a 50% off coupon to Sizzler! Wait... are they even still in business? Oh well.";
			case 3: return "Congratulations! You get your Grandmother's medication! Quick, get it back to her house!";
			default: return "A Wrong Number! You get nothing! Better restart the game LOL";
		}//End 123 Switch
	}//End Box 1-3 getInput Method
	
	public static String getInput(Scanner scan, String string){
		String choice = scan.next();
		String answer = "";
		if (choice=="C") break;
		else if (choice=="c") break;
		else{ answer = "Yea right LOSER!";
			break;
		}
		return answer;
	}//End Cc getInput Method
	public static String getInput(Scanner scan, String string, int trial){
		Random r = new Random();
		String choice = scan.next();
		int counter = 1;
		int crit = r.nextInt(1);
		int escape = r.nextInt(10);
		String answer = "";
		if (counter < trial){
			if (choice == "A"){
				if(crit == 0){
						System.out.println("Critical Hit!");
						counter++;
					}
					else{
						answer = "You missed! Giant laughs at your inadequacy";
					}
					crit = r.nextInt(1);
			}
			if (choice == "a"){
				if(crit == 0){
						counter++;
						crit = r.nextInt(1);
						answer = "Critical Hit!";
					}
					else{
						crit = r.nextInt(1);
						answer = "You missed! Giant laughs at your inadequacy";
					}
			}
		}//End counter if			
			if (choice == "E"){
				if(escape<0){
					escape = r.nextInt(10);
					answer ="Agh, couldn't escape!";
				}
				else{
					answer = "Got past him! Good moves!";
				}
			}
			else if (choice == "e"){
				if(crit <0){
					escape = r.nextInt(10);
					answer = "Agh, couldn't escape!";
					
				}
				else{
					ansnwer = "Got past him! Good moves!";
				}
			}
			else{ 
			answer = "Executed by the GIANT! Game Over.";
			}
		return answer;
	}//End AaEe getInput Method
	
	public static void main(String[] args) { 
		char option;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit­"); 
		String input = getInput(scan, "Cc");
		System.out.println("You are in a dead valley.");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit­"); 
		input = getInput(scan, "Cc");
		System.out.println("You walked and walked and walked and you saw a cave!"); 
		cave();
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit­"); 
		input = getInput(scan, "Cc");
		System.out.println("You entered a cave!");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit­");
		input = getInput(scan, "Cc");
		System.out.println("Unfortunately, you ran into a GIANT!");
		giant();
		System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
		input = getInput(scan, "AaEe", 10);
		System.out.println("Congratulations! You SURVIVED! Get your REWARD!"); 
		System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!"); 
		box();
		input = getInput(scan);

		System.out.println("Hero! Have a good day!"); 
	}//End Main Method
	
	public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//End Giant Method

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//End Cave Method
    
    public static void box(){
		System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }//End Box Method
	
	
}//End Class