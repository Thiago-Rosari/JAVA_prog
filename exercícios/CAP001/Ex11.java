package exercícios.CAP001;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        int D_Maior;
        int d_menor;
        int area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da diagonal maior: ");
        D_Maior = Integer.parseInt(scan.nextLine());

        System.out.print("Valor da diagonal menor: ");
        d_menor = Integer.parseInt(scan.nextLine());

        area = (D_Maior * d_menor) / 2;

        System.out.printf("Area = %d\n", area);

        scan.close();
    }
}
