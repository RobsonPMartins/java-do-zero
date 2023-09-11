package construtores;

public class construtores {
    // Os construtores são métodos especiais em uma classe
    // que são usados para inicializar os objetos quando são criados.
    // Eles têm o mesmo nome da classe e podem ter parâmetros para
    // configurar os atributos do objeto durante a criação

    public static void main(String[] args) {
    
        // Criando um objeto Carro usando o construtor
        Carro carro1 = new Carro("Porsche", "911 GT3 RS", 2023);
        Carro carro2 = new Carro("Ferrari", "Viper", 2023);
      
        // Usando metodos da classe Carro
        carro1.exibirMensagens();
        carro1.acelerarCarro1();
        carro1.freiandoCarro1();
        // Chamando o metodo de troca de carro
        carro1.troqueiDeVeiculo();
        carro1.pularLinhas();
        // Pegando o carro2
        carro2.exibirMensagens();
        carro2.acelerarCarro2();
        carro2.freiandoCarro2();
        carro2.pularLinhas();
        carro2.gosto();
        carro2.conclusao();
        carro2.pularLinhas();
    }

}

