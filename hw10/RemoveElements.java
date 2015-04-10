import java.util.Random;
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }//End Main Method
  public static int[] randomInput(){
    Random r = new Random();
    int[] i = new int[10];
    int num = r.nextInt(10);
    int count = 0;
    while (count < 10){
        i[count] = num;
        num = r.nextInt(10);
        count++;
    }//End While
    return i;
  }//End randomInput
  public static int[] delete(int i[], int j){
      int k=0;
      int l=0;
      int[] a = new int[9];
      while (k<9){
        if (k!=j){
          a[l]=i[k];
          l++;
        }
        k++;
      }
  return a;
  }//End delete
  public static int[] remove(int i[],int j){
    int k=0;
    int count=0;
    while (k<10){
        if (i[k] == j){
          count++;
        }
        k++;
    }
    k=0;
    int[] a = new int[10-count];
    int l=0;
    while (l<(10)){
      if (i[l]!=j){
        a[k]=i[l];
        k++;
      }
      l++;
      
    }
    return a;
  }//End Remove
}//End Class
