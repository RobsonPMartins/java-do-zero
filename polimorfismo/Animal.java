package polimorfismo;

public class Animal {

    private String nome;
    private int anos;

    // Construtor
    public Animal(String nome, int anos){
       this.nome = nome;
       this.anos = anos;
    }
    public void fazerBarulho(){
        System.out.println("O Animal esta fazendo barulho...");
    }
    public void exibirInformacoes(){
        System.out.println("O Animal se chama: " + nome);
        System.out.println("A idade do Animal e de: " + anos +" anos.");
    } 
}
class Cachorro extends Animal{
  // Construtor
  public Cachorro(String nome, int anos){
     super(nome, anos);
  }
  public void fazerBarulho(){
    System.out.println("O cachorro esta latindo! Auu au au....auuuuuuuu");
  }
}
