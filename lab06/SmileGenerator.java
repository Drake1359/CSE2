//This program will generate smiles at the amount that we want it to
public class SmileGenerator{
    public static void main (String[] args){
        System.out.println(":) :) :) :) :)");
        for (int i=0; i<4; i++){
            System.out.print(":) ");
        }
        double random = Math.random()*100;
        int a = 1+(int)random;
        int j = 0;
        int k = 1;
        for (int i = 0; i<a+1; i++){
            while (j<k){
                System.out.print(":)");
                j++;
            }
            System.out.println(" ");
            if (k<30){
                k++;
            }
            else {
                k=k;
            }
            j=0;
        }
    }//End Main Method
}//End Class