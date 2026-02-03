import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("введите число n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("введите значение x");
        double x = s.nextDouble();
        if (x <= 2 && x > 0) {
            double result = 0;
            for (int i = 0; i <= n; i++) {
                result += Math.pow(-1, i) * Math.pow(x - 1, i + 1) / (i + 1);
            }
            System.out.println("результат: "+result);
        }
    }
    }
