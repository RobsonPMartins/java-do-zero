package construtores;

public class construtores {
    // Os construtores são métodos especiais em uma classe
    // que são usados para inicializar os objetos quando são criados.
    // Eles têm o mesmo nome da classe e podem ter parâmetros para
    // configurar os atributos do objeto durante a criação

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Robson", "Professor", 33);
        pessoa1.mostrarDetalhes();
    }

}

class Pessoa {
    String nome;
    String profissao;
    int idade;

    public Pessoa(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissao: " + profissao);
    }
}
