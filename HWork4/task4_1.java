package HWork4;

import java.util.ArrayDeque;
import java.util.Deque;

public class task4_1 {
   public static void main(String[] args) {
        Deque<Integer> num1 = new ArrayDeque<>();
        Deque<Integer> num2 = new ArrayDeque<>();

        // Example for multiplication: 123 * 456
        num1.add(1);
        num1.add(2);
        num1.add(3);

        num2.add(4);
        num2.add(5);
        num2.add(6);

        Deque<Integer> product = multiply(num1, num2);
        System.out.println("Multiplication result: " + product);

        // Example for addition: -123 + 456
        Deque<Integer> num3 = new ArrayDeque<>();
        num3.add(-1);
        num3.add(2);
        num3.add(3);

        Deque<Integer> sum = add(num3, num2);
        System.out.println("Addition result: " + sum);
    }

    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        Deque<Integer> result = new ArrayDeque<>();
        int n = num1.size();
        int m = num2.size();
        int[] product = new int[n + m];

        for (int i = 0; i < n; i++) {
            int digit1 = num1.removeLast();
            int carry = 0;

            for (int j = 0; j < m; j++) {
                int digit2 = num2.removeLast();
                int temp = digit1 * digit2 + product[i + j] + carry;
                product[i + j] = temp % 10;
                carry = temp / 10;
            }

            if (carry > 0) {
                product[i + m] += carry;
            }
            num2.addAll(num2);
        }

        for (int digit : product) {
            result.addFirst(digit);
        }

        while (!result.isEmpty() && result.peekFirst() == 0) {
            result.removeFirst();
        }

        return result;
    }

    public static Deque<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;

        while (!num1.isEmpty() || !num2.isEmpty()) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeLast();
            int digit2 = num2.isEmpty() ? 0 : num2.removeLast();

            int sum = digit1 + digit2 + carry;
            result.addFirst(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.addFirst(carry);
        }

        return result;
    }
}
