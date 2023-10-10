import java.text.DecimalFormat;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero factorial: ");
        double numeroFactorial = sc.nextDouble();

        System.out.println();

        if (numeroFactorial < 0) {
            System.out.println("El factorial no está definido para números negativos o indefinidos.");
        } else if (numeroFactorial == 0 || numeroFactorial == 1) {
            System.out.println("El factorial de " + numeroFactorial + " es 1.");
        } else {
            double factorial = 1.0;

            for (int i = 1; i <= numeroFactorial; i++) {
                factorial *= i;
            }

            DecimalFormat df = new DecimalFormat("0.####E0");
            String numeroExponencial1 = df.format(factorial);

            System.out.println("El numero es: '" + numeroFactorial + "'' su factorial es: '" + factorial + "'' y simplificado es: '" + numeroExponencial1 +"'");
        }
    }
}
