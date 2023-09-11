package classesEObjetos;

public class classesEObjetos {

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Robson";
        pessoa1.idade = 33;

        // Chamando o método para exibir a saudação
        pessoa1.dizerOla(); // Saída: Olá, meu nome é Alice e eu tenho 30 anos.
    }
}
// Uma classe em Java é uma estrutura que define um tipo de objeto.
// Ela é um modelo ou um "molde" para criar objetos. Em uma classe, 
// você define os atributos (variáveis) que o objeto terá e os métodos (funções)
// que o objeto poderá executar. As classes são a base da programação orientada a 
// objetos em Java.
class Pessoa {
    // atributos públicos (sem encapsulamento)
    public String nome;
    public int idade;

    public void dizerOla() {
        System.out.println("Ola, meu nome e " + nome + " e eu tenho " + idade + " anos.");
    }
}
