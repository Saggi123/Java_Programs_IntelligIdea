public class EvenOddPrinter {
    private static final int MAX_NUMBER = 20;
    private static final Object lock = new Object();
    private static boolean isEven = true;

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter(), "Even Thread");
        Thread oddThread = new Thread(new OddPrinter(), "Odd Thread");

        evenThread.start();
        oddThread.start();
    }

    private static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (!isEven) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    isEven = false;
                    lock.notify();
                }
            }
        }
    }

    private static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (isEven) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    isEven = true;
                    lock.notify();
                }
            }
        }
    }
}
