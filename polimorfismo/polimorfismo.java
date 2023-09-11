package polimorfismo;
// Polimorfismo: Aprofunde-se no polimorfismo, onde você pode tratar diferentes classes
// de maneira uniforme através de interfaces e classes abstratas.
// Aprenda sobre a substituição de métodos e a capacidade de uma classe filha
// fornecer sua própria implementação de um método da classe pai.
public class polimorfismo {
    
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico", 5);
        Cachorro cachorro = new Cachorro("Rex", 3);

        // Criando uma lista array chamada de (animais)
        // que contem Objeto do tipo Animal
        Animal[] animais = new Animal[2];
        animais[0] = animal; //objeto animal na primeira posição da lista animais
        animais[1] = cachorro; // 2ª Posição da lista

        // Loop para tratar dos Animais, ele vai percorrer
        // todos os elementos da lista (animais)
        // (: dois pontos significa percorrer)
        for (Animal animal1 : animais) {
            animal1.exibirInformacoes();
            animal1.fazerBarulho();
            System.out.println();
        }
    }

}
