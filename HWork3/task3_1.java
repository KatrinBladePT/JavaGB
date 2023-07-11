package HWork3;

import java.util.ArrayList;
import java.util.List;

public class task3_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);

        numbers.removeIf(number -> number % 2 == 0);

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Данные после удаления четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
    
}
