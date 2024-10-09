package br.com.giulianabezerra.relogio;
public class Despertador {
    int hora;
    int minutos;
    int soneca;

    void ativarSoneca(){
    System.out.println("Só mais " + soneca + "minutos");
     }
    
    String agendarAlarme(){     //paramtros
    return "seu alarme foi configurada às " + hora + ":" + minutos;
    }
}
