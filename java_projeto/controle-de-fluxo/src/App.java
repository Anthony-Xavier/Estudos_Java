import java.io.Console;

public class App {
    public static void main(String[] args) {
    // System.out.println("ola " + args[0]);
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Digite o seu nome");
    // String name = scanner.nextLine();
    // System.out.println("ola " + name);
    // scanner.close();

    Console console = System.console();
    System.out.println("Quanto anos você tem?");
    String name = console.readLine();
    System.out.println(name);
    }
}
