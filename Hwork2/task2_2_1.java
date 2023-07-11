package Hwork2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class task2_2_1 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        try (BufferedWriter logFile = new BufferedWriter(new FileWriter("log.txt"))) {
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                logFile.write("Iteration " + (i + 1) + ": ");
                for (int num : array) {
                    logFile.write(num + " ");
                }
                logFile.newLine();
                if (!swapped) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the log file.");
            e.printStackTrace();
        }
    }
}
