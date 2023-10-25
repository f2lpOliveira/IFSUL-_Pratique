package banco;

import java.util.List;
import java.util.ArrayList;

import banco.conta.Conta;
import banco.conta.ContaPF;
import banco.conta.ContaPJ;
import pessoa.Pessoa;

// Classe NuBank que estende Banco
public class NuBank implements IOperacoesBancarias {
    private List<Pessoa> clientes;

    // Construtor que inicializa a lista de clientes do NuBank
    public NuBank() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public String abrirConta(Pessoa pessoa) {
        if (pessoa != null) {
            Conta novaConta = null;

            // Verificar o tipo de pessoa e criar a conta correspondente
            if (pessoa.getTipoPessoa() == 1) {
                novaConta = new ContaPF();
            } else if (pessoa.getTipoPessoa() == 2) {
                novaConta = new ContaPJ();
            } else {
                System.out.println("Tipo de pessoa inválido.");
                return null;
            }

            // Adicionar pessoa à lista de clientes
            clientes.add(pessoa);

            // Associar conta à pessoa
            pessoa.setConta(novaConta);

            // Lógica para salvar a conta, se necessário
        } else {
            System.out.println("Pessoa inválida.");
        }
        return null;
    }

    @Override
    public float obterSaldo(Pessoa pessoa) {
    	// Verificar se a pessoa tem uma conta associada ao NuBank
        if (pessoa.getConta() != null && pessoa.getConta() instanceof Conta) {
            Conta conta = (Conta) pessoa.getConta(); // Cast para o tipo de conta correto (Conta, ContaPF, ContaPJ, etc.)
            return conta.getSaldo(); // Retorna o saldo da conta
        }
        return 0; // Retorna 0 se a pessoa não tem uma conta associada ao NuBank ou se a conta não é do tipo esperado
    }

    @Override
    public List<Pessoa> obterClientes() {
        // Implementação do método para obter a lista de clientes do NuBank
        // ...
        // Retorne a lista de clientes como uma List<Pessoa>
        return clientes; // Substitua isso pela sua lista real de clientes
    }

    @Override
    public boolean encerrarConta(Pessoa pessoa) {
        if (pessoa != null && pessoa.getConta() != null) {
            // Remover pessoa da lista de clientes
            clientes.remove(pessoa);

            // Desassociar conta da pessoa
            pessoa.setConta(null);

            // Lógica para encerrar a conta no NuBank, se necessário
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(Conta conta, int valor) {
        // Verificar se a conta não é nula e se o valor é positivo
        if (conta != null && valor > 0) {
            // Verificar se há saldo suficiente na conta
            if (conta.getSaldo() >= valor) {
                // Realizar o saque
                conta.setSaldo(conta.getSaldo() - valor);
                return true; // Saque bem-sucedido
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Conta inválida ou valor de saque inválido.");
        }
        return false; // Saque mal-sucedido
    }


    @Override
    public boolean enviarPix(Pessoa origem, Pessoa destino, float valor) {
        // Verificar se a pessoa de origem e destino possuem conta
        if (origem.getConta() == null || destino.getConta() == null) {
            System.out.println("Pessoa de origem ou destino não possui conta.");
            return false;
        }
        // Verificar se há saldo suficiente na conta de origem
        if (origem.getConta().getSaldo() < valor) {
            System.out.println("Saldo insuficiente para realizar a transferência PIX.");
            return false;
        }
        // Realizar a transferência PIX
        origem.getConta().setSaldo(origem.getConta().getSaldo() - valor); // Deduz o valor da conta de origem
        destino.getConta().setSaldo(destino.getConta().getSaldo() + valor); // Adiciona o valor à conta de destino
        System.out.println("Transferência PIX realizada com sucesso.");
        return true;
    }
}
