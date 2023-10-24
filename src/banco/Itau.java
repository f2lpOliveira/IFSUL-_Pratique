package banco;

//Classe Itau que estende Banco
class Itau extends Banco {
 @Override
 public void abrirConta(Pessoa pessoa) {
     if (pessoa != null) {
         // Criar uma ContaPF ou ContaPJ com base no tipo de pessoa
         Conta novaConta;
         if (pessoa.getTipoPessoa() == 1) {
             novaConta = new ContaPF();
         } else if (pessoa.getTipoPessoa() == 2) {
             novaConta = new ContaPJ();
         } else {
             System.out.println("Tipo de pessoa inválido.");
             return;
         }

         // Definir um valor para o atributo numeroConta da Conta criada
         Random random = new Random();
         String numeroConta = "Itau-" + random.nextInt(1000);
         novaConta.setNumeroConta(numeroConta);

         // Lógica para salvar a novaConta, se necessário
     } else {
         System.out.println("Pessoa inválida.");
     }
 }

 @Override
 public boolean encerrarConta(Pessoa pessoa) {
     // Lógica para verificar se a pessoa tem uma conta e encerrá-la
     // Retornar true se a conta foi encerrada com sucesso, false caso contrário
     return false;
 }
}