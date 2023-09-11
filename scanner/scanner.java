package scanner;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler entrada do usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        int peso = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Dados coletados com sucesso!!!");
        scanner.close();
    }
}
