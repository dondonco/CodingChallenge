//Write a function that reverses a string. Make your function recursive.

public class ReverseString {
	public static String reverse(String str) {
		if(!str.equals("")) {
			return reverse(str.substring(1)) + str.charAt(0);
		}
		return str;
	}
}
