package banco.conta;

//Classe ContaPJ
class ContaPJ extends Conta {
// Construtor que chama o construtor da classe mãe e define o tipo de conta como pessoa jurídica (tipoConta = 2)
public ContaPJ() {
   super(2);
}

// Implementação do método abstrato obterTipoConta da classe mãe
@Override
public String obterTipoConta() {
   return "PJ";
}
}
