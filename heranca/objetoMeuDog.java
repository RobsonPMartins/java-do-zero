package heranca;

public class objetoMeuDog {


    public static void main(String[] args) {
       // Aqui criamos nosso novo objeto cachorro 
       Cachorro meuCachorro = new Cachorro();
       // Atribuimos atributos ao objeto (dados) 
       meuCachorro.nome = "Rex";
       meuCachorro.idade = 10;      

       // Aqui o metodo
       meuCachorro.emitirSom();
       meuCachorro.latir();
    }
    
}
//Criamos uma classe do tipo (Animal)
class Animal {
    // Atribuimos variaveis a essa classe que foi gerada do objeto
    String nome;
    int idade;
    // Aqui chamamos o metodo e ele exibira, o que foi atribuido na mensagem... 
    public void emitirSom(){
        System.out.println("O animal esta latindo!!!!");
    }
    
}
// Aqui a HERANÇA da Classe (Agora o objeto Cachorro da Classe Animal esta latindo com AU AU AU)
// extends chama a class Animal
class Cachorro extends Animal {
   public void latir(){
    System.out.println("Agora o cachorro esta latindo AU AU AUUUUUUUU.....");
   }
}
