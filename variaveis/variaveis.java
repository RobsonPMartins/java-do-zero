package variaveis;

public class variaveis {
    /* Se alguma variavel for declarada aqui sera do tipo global */
    public static void main(String[] args) {
        /* aqui são variaveis local */
        /* Variaveis do tipo int (inteiros) */
        int numero01 = 0;
        int numero02 = 1;
        int numero03 = 2;
        int numero04 = 3;
        int numero05 = 4;
        System.out.println("Variaveis int abaixo:");
        System.out.println("O primeiro numero da lista e o: " + numero01);
        System.out.println("O segundo numero da lista e o: " + numero02);
        System.out.println("O terceiro numero da lista e o: " + numero03);
        System.out.println("O quarto numero da lista e o: " + numero04);
        System.out.println("O quinto numero da lista e o: " + numero05);
        System.out.println("--------------------------------------");

        /* Variaveis do tipo char (caractere) */
        char letraA = 'A';
        char letraB = 'B';
        char letraC = 'C';
        char letraD = 'D';
        char letraE = 'E';

        System.out.println("Variaveis do tipo char abaixo, ou do tipo caractere:");
        System.out.println("A primeira letra e: " + letraA);
        System.out.println("A segunda letra e: " + letraB);
        System.out.println("A terceira letra e: " + letraC);
        System.out.println("A quarta letra e: " + letraD);
        System.out.println("A quinta letra e: " + letraE);
        System.out.println("----------------------------------------");

        /* Tipo double (reais) */
        double numero1 = 0;
        double numero2 = 1;
        double numero3 = 2;
        double numero4 = 3;
        double numero5 = 4;

        System.out.println("Variaveis do tipo double abaixo (reais .00): ");
        System.out.println("O primeiro double e: " + numero1);
        System.out.println("O primeiro double e: " + numero2);
        System.out.println("O primeiro double e: " + numero3);
        System.out.println("O primeiro double e: " + numero4);
        System.out.println("O primeiro double e: " + numero5);
        System.out.println("-----------------------------------------");

        /* Variaveis do tipo boolean abaixo (verdadeiro ou falso) */
        boolean estaChovendo = true;
        boolean estaEnsolarado = false;
        boolean eFeriado = true;
        boolean vaiDarPraia = false;
        boolean previsaoDeMelhora = false;
        boolean oQueVamosFazer = true;

        System.out.println("Variaveis do tipo boolean abaixo (V) ou (F), (Sim) ou (Nao): ");
        System.out.println("Esta chovendo? " + estaChovendo);
        System.out.println("Esta ensolarado? " + estaEnsolarado);
        System.out.println("E um feriado? " + eFeriado);
        System.out.println("Vamos a praia? " + vaiDarPraia);
        System.out.println("Tem previsao de melhora? " + previsaoDeMelhora);
        System.out.println("Vamos ficar em casa entao? " + oQueVamosFazer);
        System.out.println("-------------------------------------------");

        /* Agora variaveis do tipo string (palavra) */

        String nome = "Robson";
        String sobrenome = "Pereira Martins";
        String endereco = "Rua Deus ainda ha de preparar nossa casinha fixa, 0000";
        String estado = "Sao Paulo";
        String cidade = "Cananeia";

        System.out.println("Variaveis do tipo String abaixo (Palavras ou dados textuais): ");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("-------------------------------------------");
    }
}
