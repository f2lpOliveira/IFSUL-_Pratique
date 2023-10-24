package banco.conta;

//Classe Conta (abstrata)
public abstract class Conta {
 // Atributos
 protected String numeroConta;
 protected float saldo;
 protected int tipoConta;

 // Construtor
 public Conta(int tipoConta) {
     this.tipoConta = tipoConta;
 }

 // Método abstrato para ser implementado nas classes filhas
 public abstract String obterTipoConta();
}