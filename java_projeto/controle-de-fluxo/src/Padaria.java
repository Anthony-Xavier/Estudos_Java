import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Padaria {
    public static void main(String[] args) {
    System.out.println("--------------------------");
    System.out.println("Bem vindo à Padaria! Temos as seguintes opções:");
    System.out.println("1. Café");
    System.out.println("2. Pão de queijo");
    System.out.println("3. Croissant");
    System.out.println("4. Capuccino");
    System.out.println("5. Finalizar pedido");
    Scanner scanner = new Scanner(System.in);                                  //mostra para o usuario as opções
    List<String> pedidos = new ArrayList<>();                                  //armazena pedidos
        while (true) {                                                         //loop para escolher mais de 1 opção
        System.out.println("Digite a opção desejada:");
        int opcao = scanner.nextInt();                                         // le o teclado e armazena o valor
            switch (opcao) {
            case 1:
            System.out.println("Boa escolha");
            pedidos.add("café");                                            //adiciona para a lista de pedidos
            break;
            case 2:
            System.out.println("certo!");
            pedidos.add("Pão de queijo");                                   //adiciona para a lista de pedidos
            break;
            case 3:
            System.out.println("De qual sabor? Digite o número:");
            System.out.println("1. Chocolate");
            System.out.println("2. Presunto e queijo");
            int opcaoDoCroissant = scanner.nextInt();                       // armazena a opção do croissant - o valor lido é atribuido a vaiavel
                if (opcaoDoCroissant == 1) {                                // se a opção for 1 - armazena croissant com chocolate
                System.out.println("Ótima escolha");
                pedidos.add("Croissant de chocolate");
                } 
                else if (opcaoDoCroissant == 2) {                           // se a opção for 2- armazena croissant com presunto e queijo
                System.out.println("Ótima escolha");
                pedidos.add("Croissant de presunto e queijo");
                }
            break;
            case 4:
            System.out.println("Capuccino com canela?");
            System.out.println("1. com canela");
            System.out.println("2. sem canela");
            int opcaoDoCapuccino = scanner.nextInt();                   // armazena se o capuccino é com canela ou sem - o valor lido é atribuido a variavel
                if (opcaoDoCapuccino == 1) {                            // se a opção for 1 - armazena com canela
                pedidos.add("capuccino com canela");
                }
                else if (opcaoDoCapuccino == 2) {                       // se a opção for 2- armazena sem canela
                pedidos.add("capuccino sem canela");
                }
            break;
            case 5:
            System.out.println("Finalizando o pedido...");            //para sair do pedido
            break;
            default:
            System.out.println("Essa opção não existe");
            continue; 
            }
            if (opcao == 5) {
            break; 
            }
            
        }
        System.out.println("\nSeu pedido foi confirmado: ");
        for (String pedido : pedidos) {                              // Inicia um loop que itera sobre cada item1 na lista 'pedidos'.
            System.out.println("- " + pedido);                       // Para cada pedido, imprime o item na tela precedido por um traço, formatando a saída.
        }
        scanner.close();
    }
}
