public class StingBasics {
    public static void main(String[] args) {
    // String str1 = new String("Java s2");
    // String str2 = new String("Java s2");

    //System.out.println(str1 == str2);         false pois compara o endereço de momoria
    // String str1 = "java s2";
    // String str2 = "java s2";
    // System.out.println(str1 == str2);

    //caracateres especiais
    // System.out.println("\njava s2");         quebra de linha
    // System.out.println("\t java s2");        tab

    //string é um array de chars
    String nome = "Anthony Xavier";
    System.out.println("Primeira letra do nome: " + nome.charAt(0));

    //Posição de um caractere
    //System.out.println("Posição da letra A no nome: " + nome.indexOf("A"));

    // Sobrenome da pessoa
    int posicaoSobrenome = nome.indexOf(" ") + 1;
    // System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome));

    // System.out.println("Número de caracteres no nome: " + nome.length());

    //substituição de caracteres
     System.out.println(nome.replaceAll("i","1"));

     //concatenção
     String primeiroNome = "Anthony ";
     String sobrenome = "xavier";
     System.out.println(primeiroNome + "" + sobrenome);
    }
} 
