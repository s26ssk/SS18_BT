package BT3;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int number = 2; ; number++) {
            if (isPrime(number)) {
                System.out.println("Lazy Prime: " + number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
