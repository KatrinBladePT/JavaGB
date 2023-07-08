package HWork1;
//Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
    
            System.out.print("Выберите операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
    
            double result;
            scanner.close();
    
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Неверная операция");
                    return;
            }
    
            System.out.println("Результат: " + result);
        }
    }
}
