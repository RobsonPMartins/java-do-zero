package construtores;

/**
 *  Classe Carro abaixo
 */
public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano){

        this.marca = marca;
        this.modelo = modelo;
        
        // Exemplo de condição para ano do Carro
        if (ano >= 1900 && ano <= 2025) {
            this.ano = ano;
        } else {
            System.out.println("Ano invalido!");
        }

    }

    // Metodo para exibir inforações
    public void exibirMensagens(){
       System.out.println("A marca do meu carro e: " + marca);
       System.out.println("O modelo dela se chama: " + modelo);
       System.out.println("Ano de fabricacao: " + ano);
    }
     // Metodo para acelerar o carro
     public void acelerarCarro1(){
        System.out.println("Acelerei o carro porem.....");
     }

     // Metodo de avisar que o carro esta freiando
     public void freiandoCarro1(){
        System.out.println("Acabei freiando...");
     }

     //Criando outro metodo
     public void troqueiDeVeiculo(){
        System.out.println("Pois percebi uma falha no veiculo, entao peguei carro2");
     }
     // Criando outro metodo ao pegar o 2º carro
     public void acelerarCarro2(){
        System.out.println("Quando acelerei carro2, quase meu coracao saiu pela boca....");
     }
     public void freiandoCarro2(){
        System.out.println("Resolvi freiar pois e perigoso demais conduzir uma maquina dessa!!!!");
     }
    // Metodo final
    public void gosto(){
        System.out.println("Eu Robson gosto muito dos dois carros.");
    }
    public void conclusao(){
        System.out.println("E lembre-se para conduzir precisa de cnh e respeite os limites de velocidade!");
    }
    // Metodo para pular linha
    public void pularLinhas(){
        System.out.println("");
    }
    
}