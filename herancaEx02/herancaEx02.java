package herancaEx02;

public class herancaEx02 {
    // Herança: Explore o conceito de herança, onde você cria uma nova classe
    // baseada em uma classe existente. Compreenda como as classes pai (superclasse)
    // e filhas (subclasses) interagem e como os membros da classe são herdados.

    public static void main(String[] args) {
        Animal2 animal2 = new Animal2("Dinossauro", 100);
        Cachorro2 cahorro2 = new Cachorro2("Rex", 1);
        
        // Chamando os metodos da Classe pai
        System.out.println("Informacoes do Animal2 abaixo:");
        animal2.exibirInformacoes();
        animal2.fazerBarulho();
        animal2.fazerBarulho2();

        // Chamando os metodos da subclasse(classe filha)
        System.out.println("");
        System.out.println("Informacoes sobre o cachorro2 abaixo:");
        cahorro2.exibirInformacoes();
        cahorro2.fazerBarulho();
        System.out.println("");
        
    }
}
