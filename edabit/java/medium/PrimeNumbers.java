//Create a function that finds how many prime numbers there are, up to the given integer.
public class PrimeNumbers {
	public static int primeNumbers(int num) {
		int prime = 0;
		for(int i = 1; i <= num; i++){
			int c = 0;
			for(int j = i; j >=1; j--){
				if(i%j == 0){
					c++;
				}
			}
			if(c == 2){
				prime++;
			}
		}
		return prime;
	}
}
