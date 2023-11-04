public class PrimeNumbers {
    public static void main(String[] args) {
        int x = 7;
        int i;
        boolean isPrime = true;
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Простое число");
        } else {
            System.out.println("Составное число");
        }
    }
}