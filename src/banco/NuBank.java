package banco;

//Classe NuBank que estende Banco
class NuBank extends Banco {
 @Override
 public void abrirConta(Pessoa pessoa) {
     // Lógica para abrir uma conta no NuBank
 }

 @Override
 public boolean encerrarConta(Pessoa pessoa) {
     // Lógica para encerrar uma conta no NuBank
     return false;
 }
}

