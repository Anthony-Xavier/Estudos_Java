import java.util.Scanner;
public class EstruturasSelecao2 {
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
    scanner.close();
        switch (opcao){
        case 1 -> System.out.println("Humm, muito bom!!");
        case 2 -> System.out.println("Excelente");
        case 3 -> System.out.println("ótimo");
        case 4 -> System.out.println("ta bom");
        default -> System.out.println("opção não suportada");
    }
    }
}

//outra opçao
// String mensagem = switch (opcao) {
// case 1 -> "Humm, muito bom!!";
// case 2 -> "Excelente";
// case 3 -> "ótimo";
// case 4 -> "ta bom";
// default -> "opção não suportada";};
//system.out.println(mensagem);