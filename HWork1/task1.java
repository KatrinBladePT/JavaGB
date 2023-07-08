package HWork1;

/**
 * task1
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
 * (произведение чисел от 1 до n)
 */
public class task1 {
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int triangularNumber = calculateTriangularNumber(n);
        int factorial = calculateFactorial(n);

        System.out.println("Треугольное число " + n + ": " + triangularNumber);
        System.out.println("Факториал " + n + ": " + factorial);
    }
}
