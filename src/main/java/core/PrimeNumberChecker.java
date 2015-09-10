package core;

public class PrimeNumberChecker{
	
	public Boolean validate(final Integer primeNumber){
		 int sqrt = (int) Math.sqrt(primeNumber) + 1;
	        for (int i = 2; i < sqrt; i++) {
	            if (primeNumber % i == 0) {
	                // number is perfectly divisible - no prime
	                return false;
	            }
	        }
	        return true;

    }
}