package estruturaDeControle;

public class estruturaDeControle {
    
    public static void main(String[] args) {
 
        /* Estrutura de controle, trata-se de condições */
        /* If = Se */
        /* Else if = Se não*/
        int idade = 18;
        System.out.println("Abaixo as condicoes if(Se) Else(Se nao)");
        if (idade < 18) {
           System.out.println("Menor de idade");
        }
        else if (idade == 18) {
            System.out.println("Tem 18 anos");
        }
        else {
            System.out.println("Maior de idade");
        }
        System.out.println("------------------------------------");

        /* É usado quando há várias opções a serem verificadas.  */
        /* Switch = trocar */
        /* case = caso */
        char nota = 'A';
        System.out.println("Abaixo a estrutura Switch ");
        switch (nota) {
            case 'A':
                System.out.println("Excelente");
            break;
            case 'B':
                System.out.println("Muito bom!");
            break;
            case 'C':
                System.out.println("Bom!");
            break;
        
            default:
            System.out.println("Nota invalida");
        }
        System.out.println("------------------------------------------");

        
        /* aqui ele começa a contagem no 1 */
        /* for = para */
        System.out.println("Abaixo temos a estrutura de controle(for = para), contador: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem:" + i);
        }
        System.out.println("--------------------------------------------");

        /* While = enquanto */
        System.out.println("Contagem com while (Porem perigoso se nao por limite)");
        int count = 1;
        while (count <= 5) {
            System.out.println("Contagem: " + count);
            count ++;
        }
        System.out.println("---------------------------------------------");


    }
}
