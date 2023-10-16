package BT2;

public class EvenThread extends Thread{
    private final Thread oddThread;

    public EvenThread(Thread oddThread) {
        this.oddThread = oddThread;
    }

    @Override
    public void run() {
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Thread chẵn: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
