package banco;

import java.util.ArrayList;
import java.util.List;

import pessoa.Pessoa;
import banco.conta.Conta;

public class Itau implements IOperacoesBancarias {
	private List<Pessoa> clientes;

	public Itau() {
		clientes = new ArrayList<>();
	}

	public void abrirConta(Pessoa pessoa) {
		
		clientes.add(pessoa);
	}


	public void depositar(Conta conta, int valor) {
		
	}

	public boolean enviarPix(Pessoa remetente, Pessoa destinatario, int valor) {
		
		return false;
	}

	public boolean sacar(Conta conta, int valor) {
		
		return false; 
	}

	public boolean encerrarConta(Pessoa pessoa) {
		
		return false; 
	}

	@Override
	public List<Pessoa> obterClientes() {
		return clientes;
	}

	@Override
	public float obterSaldo(Pessoa pessoa) {
		Conta conta = pessoa.getConta();
		return (conta != null) ? conta.getSaldo() : 0;
	}


}

