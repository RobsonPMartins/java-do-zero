package abstracao;

public abstract class ContaBancaria {

    private String titular;
    public String getTitular() {
        return titular;
    }

    protected double saldo;

    //construtor
    public ContaBancaria(String titular){

        this.titular = titular;
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);


    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    

}
// Criando uma Classe ContaPoupanca a partir da Classe pai ContaBancaria
class ContaPoupanca extends ContaBancaria{
    // Criando a variavel do tipo double(real ou ponto flutuante) para calcular a taxa de rendimento
    private double taxaRendimento;

    // construtor
    public ContaPoupanca(String titular, double taxaRendimento){
        // Acessando aspectos da classe pai
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }
    // metodo depositar
    public void depositar(double valor){
        saldo += valor;
    }
    // Metodo sacar
    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
        } else {
           System.out.println("Saldo insuficiente"); 
        }
    }
    // metodo de calcular e aplicar o rendimento
        public void aplicarRendimento(){
        saldo += saldo * (taxaRendimento / 100);
    }
   
}
