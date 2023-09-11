package herancaEx02;

public class Animal2 {

    private String nome;
    private int anos;

    // construtor vair atuar dentro dos parenteses
    public Animal2(String nome, int anos ){
        this.nome = nome;
        this.anos = anos;
    }
    public void fazerBarulho(){
        System.out.println("O Animal2 esta fazendo barulho... ");
    }
    public void fazerBarulho2(){
        System.out.println("Por nada nao, chega a dar medo...");
    }
    public void exibirInformacoes(){
        System.out.println("O nome do Animal2 se chama: " + nome);
        System.out.println("A idade desse animalzinho é de: " + anos + " Milhoes de anos");
    }
}
// Agora vamos criar a subclasse(Herança) a partir da classe Animal2
// O extends que faz o Cachoor2 herdar de seu pai o fazerBarulho()
// Sendo assim herança nada mais é do que o que uma classe herda de outra classe.
class Cachorro2 extends Animal2{
    
    // Olha o construtor aqui denovo
    public Cachorro2 (String nome, int anos){
        // Super é usada para acessar membros da classe pai (ex: Animal2)
        // Que nesse caso buscou a var nome e anos.
        super(nome, anos);
    }
    public void fazerBarulho(){
        System.out.println("O Rex esta latindo auuuuuuuuuuuuuuu.....");
    }
}
