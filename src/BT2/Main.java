package BT2;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread(oddThread);

        oddThread.start();
        evenThread.start();
    }
}
