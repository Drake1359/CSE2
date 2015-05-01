import java.util.Scanner;
public class Cookies{
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        int people, cookies, handout;
        System.out.print("Enter the number of People: ");
        if(myScanner.hasNextInt()){
            int attempt = myScanner.nextInt();
            if (attempt>0){
                people = attempt;
                
            }
            else{
                System.out.println("Must have a positive int to represent the number of people");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        System.out.print("Enter the number of Cookies you are planning to buy: ");
        if(myScanner.hasNextInt()){
            int attempt = myScanner.nextInt();
            if (attempt>0){
                cookies = attempt;
                
            }
            else{
                System.out.println("Must have a positive int to represent the number of cookies");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        System.out.print("How many do you want to give to each person? ");
        if(myScanner.hasNextInt()){
            int attempt = myScanner.nextInt();
            if (attempt>0){
                handout = attempt;
                
            }
            else{
                System.out.println("Must have a positive int to represent the number of cookies");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        if(cookies>=(handout*people)){
            if(cookies%handout==0 && cookies/handout==people){
                System.out.println("You have enough cookies for each personand the amount will divide evenly.");
            }
            else{
                System.out.println("You have enough cookies but will not divide evenly.");
            }
        }
        else{
            int needed = (handout*people)-cookies;
            System.out.println("You do not have enough cookies, you will need "+needed+" more cookies.");
        }
    }//End Main Method
}//End Class