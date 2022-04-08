import java.util.Scanner;

public class Main
{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------------- Depósito de Bebidas -------------");
        
        System.out.println("O que deseja fazer?");
        /**/ NUMSISTEMA = 1;
        /* implementar parte de escolha com switch case */

        System.out.println("1 - INSERIR MERCADORIA QUE CHEGOU e calcular preço ");
        
        System.out.print("Digite o valor total da encomenda:");
        float valorpago = scan.nextInt();
        
        System.out.print("Agora, digite a quantidade de caixas:");
        int qtdcaixas = scan.nextInt();

        System.out.print("Digite a quantidade de unidades por caixa");
        int qtdunidades = scan.nextInt();

        float precounidade = valorpago / (qtdunidades*qtdcaixas);
        System.out.print("O valor da unidade está em R$" + precounidade +". Agora, vamos entender o quanto de lucro você vai ganhar!");

        System.out.print("Digite o quanto, em %, vc deseja obter de lucro em cima dos R$"+ precounidade +" do produto:");
        float porcentagemdesejada = scan.nextInt();
        
        float precovendaunidade = precounidade +  ;
        System.out.print("Beleza!O valor de ");
        
        int precocompra, precovenda;
        int lucroporunidade = precovenda - precocompra;


    }
}
 