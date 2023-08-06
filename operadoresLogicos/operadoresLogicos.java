package operadoresLogicos;

public class operadoresLogicos {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean resultadoE = a && b; /* So retorna true se ambos forem verdadeiros */
        boolean resultadoOU = a || b; /* Só retorna true se um ao menos for vdd */
        boolean resultadoNaoA = !a; /* inverte o valor da expressao (a era true virou false) */
        boolean resultadoNaoB = !b; /* tambem inverte (b se tornou true ) */

        System.out.println("Abixo os operadores logicos ( E-&&, Ou-||, inverte-!): ");
        System.out.println("resultado E: " + resultadoE);
        System.out.println("resultador OU: " + resultadoOU);
        System.out.println("Resultado NAO A: " + resultadoNaoA);
        System.out.println("resultado NAO B: " + resultadoNaoB);
        System.out.println("-------------------------------------------------");
    }
    
}
