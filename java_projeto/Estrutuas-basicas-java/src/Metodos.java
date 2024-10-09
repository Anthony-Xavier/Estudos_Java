public class Metodos {
    public static void main(String[] args) {
    ativarSoneca();
    String menagemDoAlarme = agendarAlarme(12, 30);
    System.out.println(menagemDoAlarme);
    }
    static void ativarSoneca(){
    System.out.println("Só mais 5 minutos");
    }

    static String agendarAlarme(int hora, int minutos){     //paramtros
    return "seu alarme foi configurada às " + hora + ":" + minutos;
    }
}
