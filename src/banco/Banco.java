package banco;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

// Classe Banco que é uma classe abstrata e implementa a interface IOperacoesBancarias
public abstract class Banco implements IOperacoesBancarias {
	
	 public abstract void abrirConta(Pessoa pessoa);
	 public abstract boolean encerrarConta(Pessoa pessoa);
	
    // Atributo para armazenar a lista de clientes
    protected List<Pessoa> clientes;

    // Construtor que inicializa a lista de clientes
    public Banco() {
        this.clientes = new ArrayList<>();
    }

    // Método para abrir uma conta
    public abstract String abrirConta(Pessoa pessoa);

    // Método para encerrar uma conta
    public abstract boolean encerrarConta(Pessoa pessoa);

    // Implementação do método da interface para enviar PIX entre duas pessoas
    @Override
    public boolean enviarPix(Pessoa origem, Pessoa destino, float valor) throws IllegalArgumentException {
        // Verificar se a pessoa de origem e destino possuem conta
        if (origem.getConta() == null || destino.getConta() == null) {
            throw new IllegalArgumentException("Pessoa de origem ou destino não possui conta.");
        }
        // Lógica para realizar a transferência PIX
        return true; // Retorna true se a operação for bem-sucedida
    }

    // Implementação do método da interface para obter a lista de clientes
    @Override
    public List<Pessoa> obterClientes() {
        return clientes;
    }

    // Implementação do método da interface para obter o saldo de uma pessoa
    @Override
    public float obterSaldo(Pessoa pessoa) {
        // Lógica para obter o saldo da conta da pessoa
        if (pessoa.getConta() != null) {
            return pessoa.getConta().getSaldo();
        } else {
            return 0; // Retorna 0 se a pessoa não possui conta
        }
    }

    // Método para depositar dinheiro em uma conta
    public void depositar(Conta conta, float valor) {
        // Incrementa o valor do saldo
        conta.setSaldo(conta.getSaldo() + valor);
    }

    // Método para sacar dinheiro de uma conta
    public boolean sacar(Conta conta, float valor) {
        // Se houver saldo suficiente, decrementa o valor do saldo e retorna true
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        } else {
            return false; // Retorna false se não houver saldo suficiente
        }
    }
}

