import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            int arg1 = Integer.parseInt(args[0]);
            String operation = args[1];
            int arg2 = Integer.parseInt(args[2]);
            if (Objects.equals(operation, "+")) {
                System.out.println(arg1 + arg2);
            } else if (Objects.equals(operation, "-")) {
                System.out.println(arg1 - arg2);
            } else if (Objects.equals(operation, "*")) {
                System.out.println(arg1 * arg2);
            } else if (Objects.equals(operation, "/")) {
                System.out.println(arg1 / arg2);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нужны аргументы!");
        } catch (NumberFormatException e) {
            System.out.println("Калькулятор работает с числами!");
        }
    }
}