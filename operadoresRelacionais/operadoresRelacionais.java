package operadoresRelacionais;

public class operadoresRelacionais {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean igual = a == b;
        boolean diferente = a != b;
        boolean maior = a > b;
        boolean menor = a < b;
        boolean maiorOuIgual = a >= b;
        boolean menorOuIgual = a <= b;

        System.out.println("Operadores relacionais (==, !=, >, <, >=, <=) abaixo:");
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor:" + menor);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);
        System.out.println("---------------------------------------------");
    }
}
