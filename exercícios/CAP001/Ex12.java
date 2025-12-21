

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        
        float num;

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um valor qualquer: ");

        num = Float.parseFloat(scan.nextLine());

        System.out.printf("%f\n", num);
        System.out.printf("%.2f\n", num);
        System.out.printf("%.3f\n", num);

        scan.close();
    }
}
