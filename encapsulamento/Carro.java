package encapsulamento;

public class Carro {
    private String marca;
    private String modelo;
    private String modelo02;
    private int ano;

    // Metodo Get para (Acessar) marca
    public String getMarca() {
        return marca;
    }

    // Metodo Set para (Modificar) marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Metodo Get para (Acessar) modelo
    public String getmodelo() {
        return modelo;
    }

    // Metodo Set para (Modificar) modelo
    public void setModelo02(String modelo02) {
        this.modelo02 = modelo02;
    }
    // Metodo Get para (Acessar) modelo
    public String getmodelo02() {
        return modelo02;
    }

    // Metodo Set para (Modificar) modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Metodo Get para (Acessar) ano
    public int getAno() {
        return ano;
    }

    // Método setter para o ano
    public void setAno(int ano) {
        if (ano >= 1900 && ano <= 2023) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }
    }
    public void exibirInformacoes(){
        System.out.println("Marca do meu carro :" + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Modelo: " + modelo02);
        System.out.println("Ano: " + ano);
    }

}
