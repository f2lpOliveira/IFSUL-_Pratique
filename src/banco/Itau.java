package banco;

import java.util.Random;

import banco.conta.*;
import pessoa.Pessoa;

//Classe Itau que estende Banco
public class Itau extends Banco {
	@Override
	public String abrirConta(Pessoa pessoa) {
		if (pessoa != null) {
			// Criar uma ContaPF ou ContaPJ com base no tipo de pessoa
			Conta novaConta;
			if (pessoa.getTipoPessoa() == 1) {
				novaConta = new ContaPF();
			} else if (pessoa.getTipoPessoa() == 2) {
				novaConta = new ContaPJ();
			} else {
				System.out.println("Tipo de pessoa inválido.");
				return null;
			}

			// Definir um valor para o atributo numeroConta da Conta criada
			Random random = new Random();
			String numeroConta = "Itau-" + random.nextInt(1000);
			novaConta.setNumeroConta(numeroConta);

			// Adicionar pessoa à lista de clientes
			clientes.add(pessoa);

			// Lógica para salvar a novaConta, se necessário
		} else {
			System.out.println("Pessoa inválida.");
		}
		return null;
	}

	@Override
	public boolean sacar(Conta conta, int valor) {
		// Lógica para realizar o saque na conta do Itau
		// ...
		return true; // ou false, dependendo da lógica de saque
	}

	@Override
	public boolean encerrarConta(Pessoa pessoa) {
		if (pessoa != null && pessoa.getConta() != null) {
			// Remover pessoa da lista de clientes
			clientes.remove(pessoa);

			// Desassociar conta da pessoa
			pessoa.setConta(null);

			// Lógica para encerrar a conta, se necessário
			return true;
		}
		return false;
	}

	@Override
	public void abrirConta1(Pessoa pessoa) {

	}

	@Override
	public boolean encerrarConta1(Pessoa pessoa) {
		return false;
	}
}