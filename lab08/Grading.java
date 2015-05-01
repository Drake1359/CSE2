import java.util.Scanner;
public class Grading{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer to create a superfactorial: ");
        int n = scan.nextInt();
        int Factorial = factorial(n);
        print(n,Factorial);
    }//End Main Method
    public static int factorial(int a){
        int i = 0;
        int factorial = 1;
        int result = 0;
        for (i=a; i>0; i--){
            int j = i;
            for (j=i; j>0; j--){
                factorial= factorial*j;
            }
            result +=factorial;
            factorial = 1;
        }
        return result;
    }//End Factorial Method
    public static void print(int a,int b){
        System.out.println("The superfactorial of "+a+" is "+b);
    }//End Print Method
}//End Class