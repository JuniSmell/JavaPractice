# JavaPractice

個人 Java 自學練習專案（IntelliJ IDEA，Java 17+）。每個檔案獨立、各有自己的 `main`，以主題分資料夾。

## 內容

| 目錄 | 說明 |
|---|---|
| `src/Java_Practice/` | NO1~NO19 基礎練習題（迴圈、陣列、字串、數學） |
| `src/Algorithm/` | 氣泡排序、選擇排序 |
| `src/Collection/` | List、Set、Map、Stack 示範 |
| `src/Stream/` | Stream API；`Stream03/04` 讀取根目錄的 `bands.txt`、`data.txt` |
| `src/Thread/` | 執行緒基礎與 Race Condition（含 `synchronized`、`AtomicInteger` 修正版對照） |
| `src/LeetCode_JAVA/` | LeetCode 解題 |
| `src/Main.java` | 排序 + 二分搜尋插入位置的互動範例 |
| `docs/sql/` | SQL 50 題、LeetCode 176、LIKE 萬用字元筆記 |
| `test/` | JUnit 5 測試 |

## 執行

需要 JDK 17+ 與 Maven。

```bash
mvn test                      # 執行測試
mvn compile                   # 編譯
java -cp target/classes Algorithm.BubbleSort
```

`Stream03/04` 以相對路徑讀取資料檔，請在專案根目錄執行。
也可直接用 IntelliJ 開啟專案，在各檔案按 Run。
