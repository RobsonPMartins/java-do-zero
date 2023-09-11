package objetoCarro;

public class objetoCarro {
    // Classes e Objetos: Comece aprendendo o que são classes e objetos em Java.
    // Entenda como criar classes, criar objetos a partir delas e acessar seus atributos e métodos.

    public static void main(String[] args) {
        // Criando um objeto em java usando new
        Carro meuCarro = new Carro();

        meuCarro.marca = "Porsche";
        meuCarro.modelo = "911 GT3 RS";
        meuCarro.ano = 2023;
        meuCarro.preco = 1.77;
        
        // Chamando o metodo de exibir informações
        meuCarro.exibirInformações();
    }
}
