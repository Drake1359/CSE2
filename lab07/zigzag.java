import java.util.Scanner;
public class zigzag{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int nStars = 10;
        for (int i=0; i<nStars; i++){
            System.out.print("*");
        }//End For Loop
        System.out.println();
        int i = 0;
        for (i=0; i<nStars; i++){
            for (int j=0; j<i; j++){
                System.out.print(" "); 
            }//pre '*' spaces Loop
            System.out.print("*");
            for (int j=nStars; j>i; j--){
                System.out.print(" ");
            }//post '*' spaces loop
            System.out.println("");
        }//End diagnonal For Loop
        for (i=0; i<nStars; i++){
            System.out.print("*");
        }//End For Loop
        System.out.println("");
        System.out.println("");
        int n= 1;
        System.out.println("PLease enter an int betwee [3-33] in ");
        if (scan.hasNextInt()){
            n = scan.nextInt();
            if (n <= 33 && n >=3){
            nStars = n;
            }
            else{
                System.out.println("You did not enter an int within [3-33]");
            }
        }
        else{
            System.out.println("You did not enter an int.");
        }
        if (nStars == n){    
        for (i=0; i<nStars; i++){
            System.out.print("*");
        }//End For Loop
        System.out.println();
        i = 0;
        for (i=0; i<nStars; i++){
            for (int j=0; j<i; j++){
                System.out.print(" "); 
            }//pre '*' spaces Loop
            System.out.print("*");
            for (int j=nStars; j>i; j--){
                System.out.print(" ");
            }//post '*' spaces loop
            System.out.println("");
        }//End diagnonal For Loop
        for (i=0; i<nStars; i++){
            System.out.print("*");
        }//End For Loop
        System.out.println("");
        }
    }//End Main Method
}//ENd Class