public class ReverseString {
	public static String reverse(String str) 
		String rev = "";
		for(String s: str.split("")){
			rev = s + rev;
		}
		return rev;
	}
}
