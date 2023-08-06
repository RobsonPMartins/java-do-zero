package metodos;

public class metodos {
    /* Função fica aqui, fora da aplicação */
    /* Funçoes sao chamadas de metodos em java */
    /* Abaixo temos 5 funções com operações */
    public static double somar(double a, double b){
        return a + b;
    
    }
    public static double subtrair(double a, double b){
        return a - b;
    
    }
    public static double dividir(double a, double b){
        return a / b;
    
    }
    public static double multiplicar(double a, double b){
        return a * b;
    
    }
    public static double porcentagem(double b, double a){
        return b % a;
    
    }
    public static void main(String[] args) {
        /* Funções em java é chamada de método, 
         Métodos permitem que você divida seu código
          em partes menores e reutilizáveis. */
        /* A função ou metodo é chamado aqui dentro da aplicação */
        double num1 = 5; 
        double num2 = 100; /* Variaveis */

        double resultadoSoma = somar(num1, num2);
        double resultadoSubtracao = subtrair(num1, num2);
        double resultadoDivisao = dividir(num1, num2);
        double resultadoMultiplicacao = multiplicar(num1, num2);
        double resultadoPorcentagem = porcentagem(num1, num2);


        System.out.println("Nossa calculadora abaixo:");
        System.out.println("O resultado da soma: " + "|" + resultadoSoma + "|");
        System.out.println("O resultado da subtracao e: " + "|" + resultadoSubtracao + "|");
        System.out.println("O resultado da divisao e: " + "|" + resultadoDivisao + "|");
        System.out.println("O resultado da multiplicacao e: " + "|" +  resultadoMultiplicacao + "|");
        System.out.println("O resultado da porcentagem e: " + "|" + resultadoPorcentagem + "|");
        System.out.println("-------------------------------------------------------");


    }
}
