import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        float perimetro;
        float area;
        float lado;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do lado: ");
        lado = Float.parseFloat(scan.nextLine());

        perimetro = lado * 4;
        area = lado * lado;

        System.out.printf("Perimetro = %.2f\n", perimetro);
        System.out.printf("Area = %.2f\n", area);

        scan.close();
    }
    
}
