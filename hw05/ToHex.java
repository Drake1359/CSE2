import java.util.Scanner;
//Import Scanner
public class ToHex {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int swag1;
		int swag2;
		int swag3;
		System.out.println("Please enter three numbers representing RGB values: ");
		if (scan.hasNextInt()){swag1 = 1;}
		else {swag1 = 0; }
		int input1 = scan.nextInt();
		if (scan.hasNextInt()){swag2 = 1;}
		else {swag2 = 0; }
		int input2 = scan.nextInt();
		if (scan.hasNextInt()){ swag3 = 1;}
		else {swag3 = 0;}
		int input3 = scan.nextInt();
		String Hex = "";
		int divinput1 = input1/16;
		int divinput2 = input2/16;
		int divinput3 = input3/16;
		String part0 = "";
		String part1 = "";
		String part2 = "";
		String part3 = "";
		String part4 = "";
		String part5 = "";
		if (input1 >255 || input2 >255 || input3 >255){
			System.out.println("Sorry you must enter values between 0-255.");
		}
		if (input1 <0 || input2 <0 || input3 <0){
			System.out.println("Sorry you must enter values between 0-255.");
		}
		if(divinput1 == 15){
			part0="F";
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//"F"
		else if(divinput1 == 15){
			part0="F";
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//"E"
		else if(divinput1 == 15){
			part0="F";
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//"D"
		else if(divinput1 == 15){
			part0="F";
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//"C"
		else if(divinput1 == 15){
			part0="F";
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//"B"
		else if(divinput1 == 15){
			part0="F";
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//"A"
		else if(divinput1 <= 9){
			part0=""+divinput1;
			if (input1%16 <= 9){
				int modulus = input1%16;
				part1=""+modulus;
				}
			else if (input1%16 == 10){
				part1="A";
				}
			else if (input1%16 == 11){
				part1="B";
				}
			else if (input1%16 == 12){
				part1="C";
				}
			else if (input1%16 == 13){
				part1="D";
				}
			else if (input1%16 == 14){
				part1="E";
				}
			else if (input1%16 == 15){
				part1="F";
				}
		}//#
		//"E"nd Input1
		if(divinput2 == 15){
			part2="F";
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//"F"
		else if(divinput2 == 15){
			part2="F";
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//"E"
		else if(divinput2 == 15){
			part2="F";
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//"D"
		else if(divinput2 == 15){
			part2="F";
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//"C"
		else if(divinput2 == 15){
			part2="F";
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//"B"
		else if(divinput2 == 15){
			part2="F";
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//"A"
		else if(divinput2 <= 9){
			part2=""+divinput2;
			if (input2%16 <= 9){
				int modulus = input2%16;
				part3=""+modulus;
				}
			else if (input2%16 == 10){
				part3="A";
				}
			else if (input2%16 == 11){
				part3="B";
				}
			else if (input2%16 == 12){
				part3="C";
				}
			else if (input2%16 == 13){
				part3="D";
				}
			else if (input2%16 == 14){
				part3="E";
				}
			else if (input2%16 == 15){
				part3="F";
				}
		}//#
		//"E"nd Input 2
		if(divinput3 == 15){
			part4="F";
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//"F"
		else if(divinput3 == 15){
			part4="F";
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//"E"
		else if(divinput3 == 15){
			part4="F";
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//"D"
		else if(divinput3 == 15){
			part4="F";
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//"C"
		else if(divinput3 == 15){
			part4="F";
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//"B"
		else if(divinput3 == 15){
			part4="F";
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//"A"
		else if(divinput3 <= 9){
			part4=""+divinput3;
			if (input3%16 <= 9){
				int modulus = input3%16;
				part5=""+modulus;
				}
			else if (input3%16 == 10){
				part5="A";
				}
			else if (input3%16 == 11){
				part5="B";
				}
			else if (input3%16 == 12){
				part5="C";
				}
			else if (input3%16 == 13){
				part5="D";
				}
			else if (input3%16 == 14){
				part5="E";
				}
			else if (input3%16 == 15){
				part5="F";
				}
		}//#
		System.out.println("The decimal numbers R:"+input1+", G:"+input2+", B:"+input3+", is represented in hexadecimal as: "+part0+part1+part2+part3+part4+part5);
	}//"E"nd Main Method
}//"E"nd "C"lass