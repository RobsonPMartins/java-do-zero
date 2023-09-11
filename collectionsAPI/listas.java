package collectionsAPI;
import java.util.List;
import java.util.ArrayList;

public class listas {
    

    public static void main(String[] args) {
       
       List<Funcionario> listaDeFuncionarios = new ArrayList<>(); 

       // Adicionar funcionários à lista
       listaDeFuncionarios.add(new Funcionario("Alice", "Desenvolvedor", 5000 ));
       listaDeFuncionarios.add(new Funcionario("Bob", "Analista", 6000 ));
       listaDeFuncionarios.add(new Funcionario("Carol", "Gerente", 8000 ));

       //Percorrer e exibir informações dos funcionários
       System.out.println("Lista de Funcionários: ");
       for (Funcionario funcionario : listaDeFuncionarios){
          System.out.println("Nome: " + funcionario.getNome());
          System.out.println("Cargo: " + funcionario.getCargo());
          System.out.println("Salario: " + funcionario.getSalario());

       }


    }


}
