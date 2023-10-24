package pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private int tipoPessoa;
    private Conta conta;

    // Construtor
    public Pessoa(String nome, String cpf, int tipoPessoa) throws IllegalArgumentException {
        if (tipoPessoa != 1 && tipoPessoa != 2) {
            throw new IllegalArgumentException("Tipo de pessoa inválido. Deve ser 1 para Pessoa Física ou 2 para Pessoa Jurídica.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
    }

    // Método para obter o tipo de pessoa
    public String obterTipoPessoa() {
        if (tipoPessoa == 1) {
            return "Física";
        } else {
            return "Jurídica";
        }
    }

    // Método para exibir todas as informações da pessoa e da conta
    public void listarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo de Pessoa: " + obterTipoPessoa());
        if (conta != null) {
            System.out.println("Número da Conta: " + conta.getNumeroConta());
            System.out.println("Saldo da Conta: " + conta.getSaldo());
            System.out.println("Tipo da Conta: " + conta.obterTipoConta());
        } else {
            System.out.println("A pessoa não possui uma conta.");
        }
    }

    // Getter e setter para o atributo Conta
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
