package exercícios.CAP001;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        
        int base;
        int altura;
        int area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da base: ");
        base = Integer.parseInt(scan.nextLine());

        System.out.print("Valor da altura: ");
        altura = Integer.parseInt(scan.nextLine());

        area = (base * altura) / 2;

        System.out.printf("Area = %d\n", area);

        scan.close();
    }
}
