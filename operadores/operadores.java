package operadores;

public class operadores {
    public static void main(String[] args) {
        /* Operadores aritimeticos  e de atribuição*/
        /* Variaveis declaradas abaixo */
        /* Variaveis local */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 700;
        int h = 80;
        int i = 90;
        int j = 100;

        /* Aqui chamamos a variavel para as operaçoes */
        int soma = a + b;
        int subtracao = c - d;
        int multiplicacao = e * f;
        int divisao = g / h;
        int resto = i % j;

        /* Aqui nosso escreval hahaha */
        System.out.println("Abaixo os opereadores aritimeticos: ");
        System.out.println("------------------------------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("------------------------------------");

        /* Operadores Atribuição */
        int a1 = 10;
        int a2 = 5;

        System.out.println("Operadores de atribuicao abaixo:");
        a1 += a2;
        System.out.println("O Valor de a1 aops a1 += a2: " + a1);

        a1 -= a2;
        System.out.println("O Valor de a1 apos a1 -= a2: " + a1);

        a1 *= a2;
        System.out.println("O Valor de a1 apos a1 *= a2: " + a1);
        
        a1 /= a2;
        System.out.println("O valor de a1 apos a1 /= a2: " + a1);
        
        a1 %= a2;
        System.out.println("O valor de a1 apos a1 %= a2: " + a1);
        System.out.println("------------------------------------");

    }
}
