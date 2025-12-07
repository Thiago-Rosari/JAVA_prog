package exercícios.CAP001;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        int perimetro;
        int area;
        int lado;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do lado: ");
        lado = Integer.parseInt(scan.nextLine());

        perimetro = lado * 4;
        area = lado * lado;

        System.out.printf("Perimetro = %d\n", perimetro);
        System.out.printf("Area = %d\n", area);

        scan.close();
    }
}
