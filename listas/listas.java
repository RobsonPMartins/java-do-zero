package listas;
import java.util.ArrayList;
import java.util.List;

// Aqui vamos trabalhar os conceitos básicos sobre listas em java
// Usando a API collections conceito basico
public class listas {
    

    public static void main(String[] args) {
      
       // Vou criar uma lista de strings usando ArrayList
       List <String> nomes = new ArrayList<>();

        // Adicionar elementos à lista Alice, Bob, Carol, David
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");
        nomes.add("david");
        System.out.println("");

        // Para acessar elementos da lista (Acessar = get)
        // nesse caso aqui acesso pela classe
        System.out.println("Lista com acesso ao primeiro nome em diante.....");
        System.out.println("Primeiro nome: " +  nomes.get(0));
        System.out.println("Segundo nome: " +  nomes.get(1));
        System.out.println("Terceiro nome: " +  nomes.get(2));
        System.out.println("Quarto nome: " +  nomes.get(3));
        System.out.println("");

        // Percorrer e imprimir elementos da lista "For"
        System.out.println("Para percorrer e imprimir elementos da lista:");
        for(String nome : nomes){
           System.out.println(nome);
        }
         System.out.println("");

        
        // Verficar se a lista contém um elemento específico "boolean"
        System.out.println("Para verificar se contem um elemento na lista:");
        boolean contemBob = nomes.contains("Bob");
        System.out.println("A lista contem Bob? " + contemBob);
        System.out.println("");

        // Remover um elemento da lista "remove"
        nomes.remove("david");

        // Tamanho da lista após a remoção (Tamanho = size)
        System.out.println("Tamanho da lista apos a remoção: " + nomes.size());
    }

}
