package objetoBarco;

public class objetoBarco {

    public static void main(String[] args) {
        
        // Criar novo objeto
        Barco meuBarco = new Barco();

        // Atribuir valor ao atributos do objeto
        meuBarco.marca = "Fishing";
        meuBarco.modelo = "Salmon";
        meuBarco.hpMotor = 200;

        // Chamar os metodos do objeto
        meuBarco.ligar();
        meuBarco.inicioNavegacao();
        meuBarco.atracou();
    }

}

class Barco {

    public int hpMotor;
    public String modelo;
    public String marca;

    public void ligar() {
        System.out.println("O barco esta ligado");
    }

    public void inicioNavegacao() {
        System.out.println("Demos inicio ao nosso passeio, olha so os golfinhos!!!!");
    }

    public void atracou() {
        System.out.println("terminamos nosso passeio o barco atracou!");
    }
}
 
    


