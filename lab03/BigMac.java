import java.util.Scanner;
public class BigMac{
    public static void main (String[] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the number of Big macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //converts whole number to decimal
        double cost$;
        int dollars, dimes, pennies;
        cost$ = nBigMacs*bigMac$*(1+taxRate); //get whole cost
        dollars = (int)cost$;//Gets whole number of dollars needed to pay
        dimes = (int)(cost$*10)%10;//Gets whole number of dimes needed to pay
        pennies = (int)(cost$*100)%10;//Gets whole number of pennies needed to pay
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a "+"sales tax of "+ (int)(taxRate*100) +"%, is $"+dollars+'.'+dimes+pennies);
    }//End Main Method
}//End Class