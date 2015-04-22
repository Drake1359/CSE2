import java.util.Scanner;
import java.util.Random;
public class Multiply{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two ints to define the dimensions of two arrays (First is Height and Second is Width): ");
        int width = scan.nextInt();
        int height = scan.nextInt();
        System.out.println("width is: "+width+" and height is: "+height);
        System.out.println("The outputted first random array is:");
        int[][] temp = randomMatrix(width,height);
        int[][] array1 = new int[width][height];
        for (int i = 0; i<width; i++){
            for (int j = 0; j<height; j++){
                array1[i][j] = temp[i][j];
            }
        }
        int [][] temp2 = randomMatrix(width,height);
        int[][] array2 = new int[width][height];
        for (int i = 0; i<width; i++){
            for (int j = 0; j<height; j++){
                array2[i][j] = temp2[i][j];
            }
        }
        for (int i = 0; i<width; i++){
            System.out.print("[ ");
            for (int j = 0; j<height; j++){
                System.out.print(array1[i][j]+" ");
            }//End Internal Array Print (Width)
            System.out.print("]");
            System.out.println("");
        }//End Array Print (Height)
        System.out.println("The outputted second random array is:");
        for (int i = 0; i<width; i++){
            System.out.print("[ ");
            for (int j = 0; j<height; j++){
                System.out.print(array2[i][j]+" ");
            }//End Internal Array Print (Width)
            System.out.print("]");
            System.out.println("");
        }//End Array Print (Height)
        System.out.println("We will now multiply these two matricies together:");
        int [][] multiplied = multiplyMatrix(array1, array2);
        for (int i = 0; i<width; i++){
            System.out.print("[ ");
            for (int j = 0; j<height; j++){
                System.out.print(multiplied[i][j]+" ");
            }//End Internal For
            System.out.print("]");
            System.out.println("");
        }//End Multiplied Array Output
    }//End Main Method
    public static int[][] randomMatrix(int a,int b){
        Random r = new Random();
        int number = r.nextInt(10);
        int sign = r.nextInt(2);
        int[][] c = new int[a][b];
        for (int i = 0; i<a; i++){
            number = r.nextInt(10);
            sign = r.nextInt(2);
            for (int j = 0; j<b; j++){
                number = r.nextInt(10);
                sign = r.nextInt(2);
                if (sign == 1){
                    c[i][j] = number-(number*2);
                }
                else{
                    c[i][j] = number;
                }
            }
        }//End Height For
        return c;
    }//End Random Matrix
    public static int [][] multiplyMatrix(int a[][],int b[][]){
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                c[i][j] = a[i][j]*b[i][j];
            }//End Internal For
        }//End External For
        return c;
    }//End Multiply Matrix
}//End Class