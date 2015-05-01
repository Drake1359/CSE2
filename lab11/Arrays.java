import java.util.Scanner;
import java.util.Random;
public class Arrays{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[50];
        Random r = new Random();
        for (int i = 0; i<50; i++){
            array1[i] = r.nextInt(101);
        }
        System.out.println("The Random Non-Sequential Array is:");
        System.out.print("[");
        for (int i = 0; i<50; i++){
            System.out.print(array1[i]+", ");   
        }
        System.out.println("]");
        int [] array2 = new int[50];
        int a = 0;
        while (a<50){
            int number = r.nextInt(100);
            if (a == 0){
                number = r.nextInt(100);
                array2[a]= number;
                a++;
            }
            else if (a!=50){
                number = r.nextInt(100);
                array2[a]=array2[a-1]+number;
                a++;
            }
        }
        System.out.println("The Random Sequential Array is:");
        System.out.print("[");
        for (int i = 0; i<50; i++){
            System.out.print(array2[i]+", ");   
        }
        System.out.println("]");
        int max1 = 0;
        int min1 = 100;
        int max2 = 0;
        int min2 = 100;
        for (int i = 0; i<50; i++){
            if (array1[i]>max1){
                max1 = array1[i];
            }
            if (array1[i]<min1){
                min1 = array1[i];
            }
        }
        System.out.println("The maximum for the first (non-sorted) array is: "+max1);
        System.out.println("The minimum for the first (non-sorted) array is: "+min1);
        System.out.println("");
        System.out.print("Please enter an int: ");
        int search = scan.nextInt();
        int low = 0;
        int high = 49;
        int check = 0;
        int counter = 0;
        while (low<=high){
            int middle = (low+high)/2;
            if (array2[middle]<search){
                low = middle;
                counter++;
            }
            else if (array2[middle]>search){
                high = middle;
                counter++;
            }
            else {
                check = middle;
                break;
            }
            if (counter>6){
                System.out.println(search+" was not found in the list");
                if(array2[middle]<search){
                    System.out.println("The number above the search integer was "+array2[middle+1]);
                    System.out.println("The number below the search integer was "+array2[middle]);
                }
                else if(array2[middle]>search){
                    System.out.println("The number above the search integer was "+array2[middle]);
                    System.out.println("The number below the search integer was "+array2[middle-1]);
                }
                break;
            }
        }//End While Loop
        if (counter<=6){
        System.out.println("The search integer "+search+" was found");
        System.out.println(check+" "+array2[check]);
        }
    }//End Main Method
}//End Class