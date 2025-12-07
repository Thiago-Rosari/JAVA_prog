package exercícios.CAP001;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        int Base_Maior;
        int base_menor;
        int altura;
        int area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da base maior: ");
        Base_Maior = Integer.parseInt(scan.nextLine());

        System.out.print("Valor da base menor: ");
        base_menor = Integer.parseInt(scan.nextLine());

        System.out.print("Valor da altura: ");
        altura = Integer.parseInt(scan.nextLine());

        area = (Base_Maior + base_menor) * altura / 2;

        System.out.printf("Area = %d\n", area);

        scan.close();
    }
}
