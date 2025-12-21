

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        int largura;
        int altura;
        int perimetro;
        int area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da largura: ");
        largura = Integer.parseInt(scan.nextLine());

        System.out.print("Valor da altura: ");
        altura = Integer.parseInt(scan.nextLine());

        perimetro = (largura * 2) + (altura * 2);
        area = largura * altura;

        System.out.printf("Perimetro = %d\n", perimetro);
        System.out.printf("Area = %d\n", area);

        scan.close();
    }
}
