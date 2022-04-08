package com.mycompany.deposito;

import java.util.Date;
import java.util.Scanner;
        
public class Deposito {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("================= Depósito de Bebidas ===================");
        
        System.out.println("O que deseja fazer?");
        Date hora = new Date();
        System.out.println("Hora atual: ");
        System.out.println(hora.toString());
        System.out.println("1- Inserir mercadoria nova no sistema");
        System.out.println("2- Checar existência de mercadorias no sistema");
        System.out.println("3- Realizar venda de mercadorias");
        System.out.println("4- Conceder desconto na mercadoria");
        System.out.println("5- Cadatrar mercadorias novas");
        int numsistema = scan.nextInt();
        switch(numsistema){
            case 1:
                System.out.println("1 - INSERIR MERCADORIA QUE CHEGOU E CACULAR PREÇO ");
                System.out.println("--------------------------------------------------");
        
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

                float precovendaunidade = (precounidade / 100) * porcentagemdesejada + precounidade;
                System.out.print("Beleza!O valor de venda da unidade então será de R$" + precovendaunidade);
            break;
                
            case 2:
                System.out.println("2- CHECAR DISPONIBILIDADE DE MERCADORIA ");
                System.out.println("----------------------------------------");
                System.out.println("Funcionalidade em implementação");
                System.out.println("Digite aqui o nome do produto que você deseja buscar: ");
                String nomeproduto = scan.nextLine();
                System.out.println("O produto " + nomeproduto + " será buscado. Tem certeza?");
                
            break;
            case 4:
                System.out.println("-------------------------------------");
                System.out.println("4 - CONCEDER DESCONTO EM MERCADORIA ");
                System.out.println("-------------------------------------");
                System.out.print("Digite o valor da mercadoria: R$");
                float precomercadoria = scan.nextFloat();
                System.out.println("Quantos % de desconto você deseja dar?");
                float desconto = scan.nextFloat();
                float precodesconto =  (precomercadoria/100) * (100 - desconto);
                System.out.println("==============================================");
                System.out.println("Valor de venda: R$" + precodesconto);
                System.out.println("==============================================");

            }
            
        }

        
}
