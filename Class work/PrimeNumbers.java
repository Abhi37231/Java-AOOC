public class PrimeNumbers {
    public static void main(String[] args) {
        int range = 100;
        System.out.println("Prime numbers between 1 and " + range + " are:");
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
