package lesson1;
/*
 * Cover: 1. Data Type
 * 	Data Type: Primitive Data
 * 		Byte    -> 8-bit signed two's complement integer.
 * 		short   -> 16-bit signed two's complement integer.
 * 		int     -> 32-bit signed two's complement integer.
 * 		long    -> 64-bit two's complement integer. 
 * 		float   -> 32-bit single-precision, IEEE 754 floating point.
 * 		double  -> 64-bit double-precision, IEEE 754 floating point.
 * 		boolean -> true/false
 * 		char    -> 16-bit Unicode character.
 *  Fix: why any string input is omitted after taking any of int, float, double, etc type data
 * 
 */

import java.util.Scanner;


public class BasicLesson {
	

	public BasicLesson() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// To take any input from user create a scanner object.
		var scn = new Scanner(System.in);
		
		String usrName;
		int intNum = 235;
		String gender;
		float age = (float) 53.35; //default floating value in java is double, hence casting.
		double doubleNum = 5234234523.21345;
		
		System.out.println("Hello World\n");
		System.out.format("int num: %d , float num: %f, double num: %f%n", intNum, age, doubleNum);
		
		System.out.println("What's your name?");
		usrName = scn.nextLine();
		System.out.println("Hello "+usrName+"!");
		
		//if(scn.hasNextLine())
			System.out.println("What's your age?");
		/* we need to use following float wrapper, because of .nextFloat() or .nextInt() 
		 * or .nextDouble() doesn't read the nextline you enter after you enter a number.
		 * hence it won't escape any string input to take as a input.
		 */
		age = Float.parseFloat(scn.nextLine());
		
		System.out.println("\nGender?");
		gender = scn.nextLine().toLowerCase();
		switch (gender) {
		case "male" :
			System.out.println("You're a male, great!");
			break;
		case "female": 
			System.out.println("Wow! you're a female!");

		default:
			System.out.println("Oww! you're not sure about your sex :(");
			break;
		}
		
		scn.close();
	}

}
