//Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
public class ArrayOfMultiples {
	public static int[] arrayOfMultiples(int num, int length) {
		int[]res = new int[length];
		for(int i = 0; i < length; i++){
			res[i] = num*(i+1);
		}
		return res;
	}
}
