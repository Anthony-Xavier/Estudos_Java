import java.util.Scanner;

public class EstruturasSelecao {
    public static void main(String[] args) {
    System.out.println("--------------------------");
    System.out.println("Bem vindo à Padaria! Temos as seguintes opções:");
    System.out.println("1. Café");
    System.out.println("2. Pão de queijo");
    System.out.println("3. Croissant");
    System.out.println("4. Capuccino");
    System.out.println("Digite a opção desejada:");
    Scanner scanner = new Scanner(System.in);
    int opcao = scanner.nextInt();
        if (opcao == 1) {
        System.out.println("Boa escolha");
        } 
        else if (opcao == 2) {
        System.out.println("Bom lanche");
        } 
        else if (opcao == 3) {
        System.out.println("De qual sabor? Digite o número:");
        System.out.println("1. Chocolate");
        System.out.println("2. Presunto e queijo");
        int opcaoDoCroissant = scanner.nextInt();
            if (opcaoDoCroissant == 1) {
            System.out.println("Humm, muito bom!!");
            } 
            else if (opcaoDoCroissant == 2) {
            System.out.println("Excelente");
            } 
            else {
            System.out.println("Opção de sabor não suportada.");
            }
        } 
        else if (opcao == 4) {
        System.out.println("Muito bem, com canela ou sem?");
        System.out.println("1. com canela, por favor");
        System.out.println("2. sem caneka, obrigado");
        int opcaoCapuccino = scanner.nextInt();
            if(opcaoCapuccino == 1){
            System.out.println("Ta bom");
            }
            else if(opcaoCapuccino == 2) {
            System.out.println("ok");
            }
        } 
        else{
        System.out.println("Opção não suportada");
        }
        scanner.close();
    }
}

