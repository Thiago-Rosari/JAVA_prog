import java.util.Scanner;

public class Ex16 {
    
    public static void main(String[] args) {
        
        float base;
        float altura;
        float area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da base: ");
        base = Float.parseFloat(scan.nextLine());

        System.out.print("Valor da altura: ");
        altura = Float.parseFloat(scan.nextLine());

        area = (base * altura) / 2;

        System.out.printf("Area = %.2f\n", area);




        scan.close();
    }
}
