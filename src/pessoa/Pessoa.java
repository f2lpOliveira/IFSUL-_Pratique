package pessoa;

import banco.conta.Conta;

public class Pessoa {
	private String nome;
	private String cpf;
	private int tipoPessoa;

	public Pessoa(String nome, String cpf, int tipoPessoa) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoPessoa = tipoPessoa;
	}

	private Conta conta; 
	
	public String getNome() {
        return nome;
    }

	public Conta getConta() {
		return conta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipo) {
        this.tipoPessoa = tipo;
    }

	
	 public void listarInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("CPF: " + cpf);
	        System.out.println("Tipo: " + tipoPessoa);
	    }
}
