public class App {
    public static void main(String[] args){
    //tipos númercos inteiros = byte, short,int , long
    // int numero1 = 1;
    // int numero2 = 2;
    // int soma = numero1 + numero2;

    //tipos decimais - float, double
    // float numero1 = 1.5f;
    // float numero2 = 1.5f;
    // float soma = numero1 + numero2;
    // System.err.println(soma);

    // char e boolean
    // char operador = '+';
    // double numero1 = 2.5;
    // double numero2 = 7.0;
    // double resultado = soma(numero1, numero2);
    // System.out.println(operador + " : " + resultado);
    // boolean ehIgua = numero1 == numero2;
    // System.out.println(ehIgual);

    Calculadora calculadora = new Calculadora(1.5, 3.0);
    System.out.println(calculadora.soma());
    }
    static double soma(double numero1, double numero2){
    return numero1 + numero2;
    }
}
