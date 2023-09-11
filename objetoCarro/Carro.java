package objetoCarro;
 // Criamos nossa classe Carro a partir do objeto Carro
public class Carro {
    // Atributos ou caracteristicas do objeto
    String marca;
    String modelo;
    int ano;
    double preco;

    public void exibirInformações(){
        // Metodo void para exibir os atributos do nosso objeto
        System.out.println("Marca do meu carro: " + marca);
        System.out.println("Modelo dele: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$: " + preco + " Milhoes de reais" );
    }
}
