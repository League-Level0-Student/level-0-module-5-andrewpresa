package extra;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					prime = false;
					break;
					
				
				}
			
				}
				if(prime) {
					System.out.println(i + " is prime");
					
				}
				else {
					System.out.println(i + " is composite");
				}
				}
				
				}
			}
			
		
	


