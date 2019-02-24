
public class Loops {

	public static void main(String[] args) {
		
		//A while loop that prints all even numbers from 0 to 100
		
		int i = 0;
		
			while (i <= 100 && i >= 0 ) {
				if (i%2==0)
					System.out.println(i);
				i++;
			}
		
		//A while loop that prints every 3rd number going backwards from 100 until we reach 0
			
		int p = 100;
		
			while (p <= 100 && p > 0) {
				System.out.println(p);
				p = p - 3;
			}

		//A for loop that prints every other number from 1 to 100
			
		for (int q = 1; q <= 100; q += 2) {
			System.out.println(q);
		}
		
		//A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		
		for (int r = 0; r <= 100; r++) {
			if (r % 5 == 0 && r % 3 == 0) { 
				System.out.println("Hello World");
			}
			else if (r % 3 == 0) { 
				System.out.println("Hello");
			}
			else if (r % 5 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(r);
			}
		}
	}
}