package Thread.RaceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ImplRaceCondition {

    private static final int TASKS = 100;

    public static void main(String[] args) throws InterruptedException {
        Account unsafe = new Account();
        run(unsafe::deposit);
        System.out.println("不安全版本，預期 " + TASKS + "，實際 " + unsafe.getBalance());

        Account safe = new Account();
        run(safe::depositSynchronized);
        System.out.println("synchronized 版本，預期 " + TASKS + "，實際 " + safe.getBalance());

        AtomicInteger atomic = new AtomicInteger();
        run(atomic::incrementAndGet);
        System.out.println("AtomicInteger 版本，預期 " + TASKS + "，實際 " + atomic.get());
    }

    private static void run(Runnable task) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < TASKS; i++) {
            pool.execute(task);
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
    }
}
