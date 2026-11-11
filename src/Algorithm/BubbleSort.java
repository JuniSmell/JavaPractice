package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/** 氣泡排序（Bubble Sort）：相鄰元素比較並交換，一輪沒有交換就提前結束。 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入以空白分隔的整數：");
        String[] parts = scanner.nextLine().trim().split("\s+");
        int[] data = new int[parts.length];
        try {
            for (int i = 0; i < parts.length; i++) {
                data[i] = Integer.parseInt(parts[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("輸入格式錯誤，請只輸入整數。");
            return;
        }
        System.out.println("排序前：" + Arrays.toString(data));
        bubble_sort(data, data.length);
        System.out.println("排序後：" + Arrays.toString(data));
    }

    /** 就地排序前 n 個元素（升冪），並回傳同一個陣列。 */
    public static int[] bubble_sort(int[] data, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return data;
    }
}
