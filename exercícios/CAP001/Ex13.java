import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        float n1;
        float n2;
        float adicao;
        float subtracao;
        float multiplicacao;
        float divisao;

        Scanner scan = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        n1 = Float.parseFloat(scan.nextLine());

        System.out.print("Segundo número: ");
        n2 = Float.parseFloat(scan.nextLine());

        adicao = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

        System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, adicao);
        System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, subtracao);
        System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, multiplicacao);
        System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, divisao);

        scan.close();

    }
}