import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
       ConnectionPool dbConnectionPool = ConnectionPool.getInstance();

        CountDownLatch latch = new CountDownLatch(1);

        Runnable task = () -> {
            try {
                latch.await(); // Wait until the latch is counted down
                DBConnection dbConnection = dbConnectionPool.getConnection();
                // whatever!
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        // ensuring all threads execute simultaneously after wait()
        latch.countDown();
    }
}