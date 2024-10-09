public class ModificadorStatic {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        Conta contaMaria = new Conta();

        contaJoao.depositarContaConjunta(100);
        contaMaria.depostiarConta(200);
        System.out.println(Conta.saldoContaConjunta);
        System.out.println(Conta.saldoContaConjunta);
        System.out.println(contaJoao.saldo);
        System.out.println(contaMaria.saldo);
    }
}   