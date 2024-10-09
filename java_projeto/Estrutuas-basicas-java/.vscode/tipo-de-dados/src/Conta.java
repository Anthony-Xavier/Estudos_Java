public class Conta {
static double saldoContaConjunta;
double saldo;

void depositarContaConjunta(double valor){
    saldoContaConjunta = saldoContaConjunta + valor;
}

void depostiarConta(double valor){
    saldo += valor;
}
}
