import java.util.Scanner;
import java.util.Random;
public class CSE2Linear{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int[] array  = new int[15];
        System.out.println("Please enter 15 ints for the final grades of CSE2:");
        for (int i = 0; i<15; i++){
            int temp = scan.nextInt();/*
            if (temp<0 || temp>100){
                System.out.println("You did not enter an int between 0 and 100. Try again.");
                break;
            }//End 0-100 if
            else if(i>0){
                if(temp<array[i-1]){
                    System.out.println("You must enter an int larger than the previous int. Try again.");
                    break;
                }
            }
            else{*/
                array[i] = temp;
            //}
            temp = 1;
        }//End Search For
        System.out.print("The sorted grades (low to high) are: ");
        for (int i = 0; i<15; i++){
            System.out.print(" "+array[i]+",");
        }//End Array Print
        System.out.println();
        System.out.println("Enter a grade to be searched:");
        int search = scan.nextInt();
        String found = linear(array, search);
        System.out.println(found);
        int scrambled[] = Scramble(array);
        System.out.print("Scrambled: ");
        for (int i = 0; i<15; i++){
            System.out.print(" "+scrambled[i]+",");
        }//End Array Print
        System.out.print("Enter a value to be used in the binary search: ");
        int bsearch = scan.nextInt();
        String bfound = binary(array, bsearch);
        System.out.println(bfound);
    }//End Main Method
    public static String linear(int a[], int b){
        int count = 0;
        String answer = "";
        int o = 0;
        for (int j = 0; j<4; j++){
            for (int i = 0; i<15; i++){
                count++;
                if (a[i] == b){
                    answer = b+" was found in the array after "+count+" iterations.";
                    o=1;
                    break;
                }
            }
        }
        if (o==0){
        answer = b+" is not in this Array.";
        }
        return answer;
    }//End Linear Search Method
    public static int[] Scramble(int a[]){
        Random r = new Random();
        for(int i = 0; i<7; i++){
            int random1 = r.nextInt(15);
            int random2 = r.nextInt(15);
            int temp;
            temp = a[random1];
            a[random1] = a[random2];
            a[random2] = temp;
        }
        return a;
    }//End Array Scramble Method
    public static String binary(int a[], int b){
        int count = 0;
        int length = 7;
        String answer = "";
        while(count>0){
            count++;
            if(a[length] == b){
                answer = b+" was found after "+count+" iterations.";
            }//end if
            else if (a[length] > b){
                length = (int)length/2;
                continue;
            }//end else if >
            else if(a[length] < b){
                length = (int)length+(length/2);
                continue;
            }//end else if <
        }//End While
        return answer;
    }//End Binary Search Method
}//End Class