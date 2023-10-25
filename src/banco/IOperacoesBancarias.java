package banco;

import java.util.List;
import pessoa.Pessoa;
import banco.conta.Conta;

// Interface IOperacoesBancarias
public interface IOperacoesBancarias {
	// Método para obter a lista de clientes
	public List<Pessoa> obterClientes();

	// Método para enviar PIX entre duas pessoas com um determinado valor
	public boolean enviarPix(Pessoa origem, Pessoa destino, float valor);

	// Método para obter o saldo de uma pessoa
	public float obterSaldo(Pessoa pessoa);

	// Método para sacar dinheiro de uma conta
	public boolean sacar(Conta conta, int valor);

	boolean encerrarConta(Pessoa pessoa);

	String abrirConta(Pessoa pessoa);
}


