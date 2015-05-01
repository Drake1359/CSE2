import java.util.Scanner;
public class ArrayInputs{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.print("Please enter an integer for the size of an array: ");
            size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Please enter "+size+" positive integers: ");
        int i = 0;
        while(i<size){
            if (sc.hasNextInt()){
                int j = sc.nextInt();
                if (j>0){
                array[i] = j;
                i++;
                }
                else{
                    System.out.print("You did not enter an integer");
                }
            }
        }//End While Loop
        System.out.println("The array is: ");
        for (int a = 0; a<array.length; a++){
            System.out.println(array[a]);
        }
    }//End Main Method
}//End Class