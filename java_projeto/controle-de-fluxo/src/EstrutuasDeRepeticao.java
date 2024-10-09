import java.io.Console;
import java.util.ArrayList;

public class EstrutuasDeRepeticao {
    public static void main(String[] args) {
    ArrayList<String> tarefas = new ArrayList<>();
    Console console = System.console();
    String adicionarNovaTarefa = "sim";
        while(adicionarNovaTarefa.equals("sim")){
        System.err.println("informe a tarefa");
        String tarefa = console.readLine();
        tarefas.add(tarefa);
        System.out.println("Adicionar nova tarefa (sim ou nao) ?");
        adicionarNovaTarefa = console.readLine();
        }
    System.out.println("\nsusas tarefas");
    for(int i = 0; i < tarefas.size(); i ++){
    System.out.println(" [ ] " + tarefas.get(i));
    }
    }
}
