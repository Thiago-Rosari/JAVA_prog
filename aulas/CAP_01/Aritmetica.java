package aulas.CAP_01;

public class Aritmetica {
    
    public static void main(String[] args) {
        
        /*
        * Existem na linguagem Java cinco operadores aritméticos:
        * +: adição
        * -: subtração
        * *: multiplicação
        * /: divisão
        * %: módulo (resto da divisão inteira)
        *
        * Esses operadores atuam de forma específica dependendo do
        * tipo numérico sendo operado. Isso se nota principalmente
        * em relação ao operador / (divisão) quando atuado em valores
        * inteiros e de ponto flutuante!
        *
        * O operador de resto/módulo que é dado pelo símbolo
        * % (porcento), é usado apenas para números inteiros.
        */

        int Inteiro1 = 9;
        int Inteiro2 = 2;
        double Decimal1 = 9;
        double Decimal2 = 2;

        int divisãoInteira = Inteiro1 / Inteiro2;
        double ddivisãoDecimal = Decimal1 / Decimal2;

        System.out.printf("Inteiros: %d / %d = %d\n", Inteiro1, Inteiro2, divisãoInteira);
        System.out.printf("Decimais: %f / %f = %f\n", Decimal1, Decimal2, ddivisãoDecimal);
    }
}
