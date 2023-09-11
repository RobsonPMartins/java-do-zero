package encapsulamento;

public class encapsulamento {
    // O encapsulamento envolve o conceito de ocultar os detalhes internos de uma classe
    // e fornecer uma interface controlada para interagir com ela.
    // Isso é feito usando modificadores de acesso (como private, public, protected),
    // e métodos especiais chamados de "getters" e "setters"
    // Getter = Acessar  Setter = Modificar...

    public static void main(String[] args) {
        // Vou usar meu objeto Carro aqui novamente
        Carro meuCarro = new Carro();
    

       // Usando o set para alterar os dados
       meuCarro.setMarca("Porshe");
       meuCarro.setModelo("911 GT3 RS");
       meuCarro.setModelo02("Florida");
       meuCarro.setAno(2023);

       System.out.println("Segue meu carro abaixo: vrummmmmm..............");
       System.out.println("Marca: " + meuCarro.getMarca());
       System.out.println("Era modelo: " + meuCarro.getmodelo02());
       System.out.println("Agora é: " + meuCarro.getmodelo());
       System.out.println("Ano: " + meuCarro.getAno());


    }
}
