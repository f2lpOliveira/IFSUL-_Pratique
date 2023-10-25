package banco.conta;

//Classe Conta (abstrata)
public abstract class Conta {
 // Atributos
 protected String numeroConta;
 protected float saldo;
 protected int tipoConta;

 //Construtor para inicializar o saldo
 public Conta() {
	 this.saldo = 0;
 }
 
//Construtor que aceita um argumento inteiro para inicializar o tipo de conta
 public Conta(int tipoConta) {
     this.tipoConta = tipoConta;
 }
 
 public String getNumeroConta() {
     return numeroConta;
 }
 
 public void setNumeroConta(String numeroConta) {
     this.numeroConta = numeroConta;
 }
 
 public float getSaldo() {
     return saldo;
 }
 
 public void setSaldo(float saldo) {
     this.saldo = saldo;
 }
 
 public void depositar(float valor) {
     // Implementação do método depositar
     // ...
 }

 // Método abstrato para ser implementado nas classes filhas
 public abstract String obterTipoConta();
}