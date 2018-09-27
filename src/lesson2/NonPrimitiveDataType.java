package lesson2;


/*
 * Cover: 
 *  1. Array
 *  2. string
 *  3. 
 *  
 *   Array:
 *    Way of Declaration:
 *    int[] array1 = {1, 34, 4, 12}
 *    
 *    int[] array2 = new int[4];
 *     array2 = {1, 32, 53, 54};
 *     
 *    int[]array3 = new int[]{3, 4, 2, 4, 7};
 *
 *    NOTE: Java Collection Interface will be covered in lesson3.
 */

public class NonPrimitiveDataType {

	public NonPrimitiveDataType() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Array~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
		int[] intArray = {0, 1, 1, 2, 3, 5};
		float[] floatArray = new float[] { 3.5f, 35.54f, 3.54f};
		
		//How to retrive/ print data from array
		
		//conventional way: using loop (for/while like follow)
		for(int i = 0; i <  intArray.length; i++) {
			System.out.print(intArray[i]+ " ");
		}
		
		//Convenient way: This is important
		System.out.print("\nConvinient Way: ");
		for(float i : floatArray) { //this i will hold the data of each element of array.
			System.out.print(i + ", ");			
		}
		
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~String~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
		//In java String is a built in class
		String aString = "This is a string";
		System.out.println(aString);
		
		System.out.println(aString.replace('a', 'm'));
		System.out.println(aString.indexOf('s'));
		
		
		
		
		
		
	}
}
