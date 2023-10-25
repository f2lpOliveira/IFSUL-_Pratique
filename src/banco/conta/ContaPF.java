package banco.conta;

//Classe ContaPF
public class ContaPF extends Conta {
 // Construtor que chama o construtor da classe mãe e define o tipo de conta como pessoa física (tipoConta = 1)
 public ContaPF() {
     super(1);
 }

 // Implementação do método abstrato obterTipoConta da classe mãe
 @Override
 public String obterTipoConta() {
     return "PF";
 }

@Override
public void setSaldo(float f) {
	// TODO Auto-generated method stub
	
}
}

