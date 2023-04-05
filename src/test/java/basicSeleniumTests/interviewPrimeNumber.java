package basicSeleniumTests;

public class interviewPrimeNumber {

	public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isPrime(5));
        
        printPrimesInRange(1, 300);
        
        // a whole number greater than 1 that cannot be exactly divided by any whole number other than itself
        // and 1 (e.g. 2, 3, 5, 7, 11).
    }
}
