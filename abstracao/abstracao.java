package abstracao;
//1 - A classe ContaBancaria é declarada como abstrata.
//2 - A classe ContaPoupanca herda de ContaBancaria e implementa os métodos abstratos.
//3 - O método main cria uma instância de ContaPoupanca, deposita dinheiro, 
// aplica o rendimento e exibe as informações da conta.
public class abstracao {
    
    public static void main(String[] args) {
        // Criando nosso objeto ContaPoupança com taxa de rendimento de 2.5% a.a
        ContaPoupanca conta = new ContaPoupanca("Joao", 2.5);
        
        // chamar os metodos
        conta.depositar(1000);
        conta.aplicarRendimento();

        System.out.println("Informações da conta");
        conta.exibirSaldo();
        
    }
}
