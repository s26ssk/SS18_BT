package BT1;

public class Main implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ID: " + Thread.currentThread().getId() +
                    " - Số: " + i + " - Số HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Main generator1 = new Main();
        Main generator2 = new Main();

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }}
