import java.text.DecimalFormat;
import java.util.Scanner;

public class paquetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de paquetes a enviar: ");
        double paquetes = sc.nextDouble();
        System.out.print("A cuantos destinos se enviaran los paquetes: ");
        double destinos = sc.nextDouble();

        System.out.println();

        if (paquetes < 0 || destinos < 0) {
            System.out.println("El factorial no está definido para números negativos o complejos.");
        } else if (paquetes == 0 || paquetes == 1){
                System.out.println("El factorial de " + paquetes + " es 1.");
            } else if (destinos == 0 || destinos == 1){
                System.out.println("El factorial de " + destinos + " es 1.");
                } else {
                    double factorial = 1.0;
                    double factorial2 = 1.0;
                    double factorial3 = 1.0;
                    double facto = paquetes-destinos;

                    for (int i = 1; i <= paquetes; i++) {
                        factorial = factorial * i;
                    }

                    for (int i = 1; i <= destinos; i++) {
                        factorial2 = factorial2 * i;
                    }

                    for (int i = 1; i <= facto; i++) {
                        factorial3 *= i;
                    }

                    DecimalFormat df1 = new DecimalFormat("0.####E0");
                    String numeroExponencial1 = df1.format(factorial);

                    DecimalFormat df2 = new DecimalFormat("0.####E0");
                    String numeroExponencial2 = df2.format(factorial2);

                    DecimalFormat df3 = new DecimalFormat("0.####E0");
                    String numeroExponencial3 = df3.format(factorial3);

                    System.out.println("El numero de paquetes son '" + paquetes + "' y su factorial es: '" + numeroExponencial1 +"'");
                    System.out.println("El numero de destinos son '" + destinos + "'' y factorial es: '" + numeroExponencial2 +"'");
                    System.out.println("El numero de paquetes menos los destinos son '" + facto + "'' y factorial es: '" + numeroExponencial3+"'");

                    System.out.println();

                    double resultado = factorial / (factorial2 * factorial3);

                    DecimalFormat df4 = new DecimalFormat("0.####E0");
                    String numeroExponencial4 = df4.format(resultado);

                    System.out.println("El numero de formas que se pueden repartir los paquetes es de: '"+ resultado + "'' y simplificados son: '" + numeroExponencial4+"'");
                }
    }
}
