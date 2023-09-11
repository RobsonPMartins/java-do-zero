package collectionsAPI;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    // Contrutor e metodos de acesso (Getters e Setters)
       public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    //... outros métodos específicos de classe
  
    public String exibirDados() {
        String dados = "Nome: " + nome + "\n";
        dados += "Cargo: " + cargo + "\n";
        dados += "Salario: " + salario + "\n";
        return dados;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public Double getSalario() {
        return salario;
    }
}

