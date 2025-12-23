import java.util.Scanner;

public class Ex15 {
    
    public static void main(String[] args) {
        
        float largura;
        float altura;
        float perimetro;
        float area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da largura: ");
        largura = Float.parseFloat(scan.nextLine());

        System.out.print("Valor da altura: ");
        altura = Float.parseFloat(scan.nextLine());

        perimetro = (largura * 2) + (altura * 2);
        area = largura * altura;

        System.out.printf("Perimetro = %.2f\n", perimetro);
        System.out.printf("area = %.2f\n", area);
        
        scan.close();
    }
}
