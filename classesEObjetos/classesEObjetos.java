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

class Pessoa {
    // atributos públicos (sem encapsulamento)
    public String nome;
    public int idade;

    public void dizerOla() {
        System.out.println("Ola, meu nome e " + nome + " e eu tenho " + idade + " anos.");
    }
}
