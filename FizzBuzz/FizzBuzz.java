/*
	If a number 1 - 100 is divisible by 3, output fizz, 
	if divisible by 5, output buzz.
	if divisible by both, output fizzbuzz.
	using % to check remainder.

*/

class FizzBuzz {
	public static void main(String[] args) {
		
		/*int a = 9;
		int b = 3;
		
		if((a%b) == 0){
			System.out.println("Fizz");
		}*/
		
		
		for (int i = 0; i <= 100; i++) {
			if((i % 3) == 0){
				System.out.println("Fizz");
			}
			if((i%5) == 0){
				System.out.println("Buzz");
			}
			if((i%3 == 0) && (i%5 == 0)){
				System.out.println("FizzBuzz");
			}
		}//*/
	}
}