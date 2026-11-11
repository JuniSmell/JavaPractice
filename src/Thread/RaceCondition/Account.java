package Thread.RaceCondition;

// 示範 Race Condition：不安全版本與兩種修正版本

public class Account {

    private int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    /** 不安全：讀取 → 睡眠 → 寫入 之間可被其他執行緒插入，導致更新遺失。 */
    public void deposit() {
        int newBalance = this.balance + 1;
        try {
            Thread.sleep(3);   // 刻意睡 3 毫秒，放大 Race Condition 的效果
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.balance = newBalance;
    }

    /** 修正一：synchronized，同一時間只有一個執行緒能進入。 */
    public synchronized void depositSynchronized() {
        deposit();
    }
}
