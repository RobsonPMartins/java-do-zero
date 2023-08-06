package objetos;


public class objetos {

    
    public static void main(String[] args) {
        

        // Criar um objeto em java
        Carro meuCarro = new Carro();
       
        // Atribuir valores aos atributos do objetos
        meuCarro.marca = "toyota";
        meuCarro.modelo = "corolla";
        meuCarro.ano = 2020;
        
        // Chamar os metodos do objeto
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.frear();
    }
    
}
class Carro {

    public String marca;
    public String modelo;
    public int ano;

    public void ligar() {
        System.out.println("O carro esta ligado!");
    }
    public void acelerar() {
        System.out.println("O carro esta acelerando...");
    }
    public void frear() {
        System.out.println("O carro esta freando!!!");
    }

}
