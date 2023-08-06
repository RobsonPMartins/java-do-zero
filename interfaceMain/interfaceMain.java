package interfaceMain;

public class interfaceMain {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.mover();

        Animal gato = new Gato();
        gato.emitirSom();
        gato.mover();

    }
}
interface Animal{
    void emitirSom();
    void mover();
}
class Cachorro implements Animal{
    public void emitirSom(){
        System.out.println("O cachorro esta latindo!");

    }
    public void mover(){
        System.out.println("O cachorro esta correndo!");

    }
    
}
class Gato implements Animal {
    public void emitirSom() {
        System.out.println("O gato esta miando: Miau!");
    }

    public void mover() {
        System.out.println("O gato esta pulando.");
    }
}