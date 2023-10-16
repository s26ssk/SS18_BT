package BT3;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int number = 2; ; number++) {
            if (isPrime(number)) {
                System.out.println("Optimized Prime: " + number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
