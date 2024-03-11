package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Leitura de três números do usuário
        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        System.out.print("Digite o valor de z: ");
        double z = sc.nextDouble();

        // Operações matemáticas e impressão dos resultados
        double raizX = Math.sqrt(x);
        double raizY = Math.sqrt(y);
        double raiz25 = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + raizX);
        System.out.println("Raiz quadrada de " + y + " = " + raizY);
        System.out.println("Raiz quadrada de 25 = " + raiz25);

        double xElevadoY = Math.pow(x, y);
        double xAoQuadrado = Math.pow(x, 2.0);
        double cincoAoQuadrado = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + xElevadoY);
        System.out.println(x + " elevado ao quadrado = " + xAoQuadrado);
        System.out.println("5 elevado ao quadrado = " + cincoAoQuadrado);

        double absolutoY = Math.abs(y);
        double absolutoZ = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + absolutoY);
        System.out.println("Valor absoluto de " + z + " = " + absolutoZ);

        sc.close();
    }
}

