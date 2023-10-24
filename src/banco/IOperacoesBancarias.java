package banco;

import java.util.List;

// Interface IOperacoesBancarias
public interface IOperacoesBancarias {
    // Método para obter a lista de clientes
    public List<Pessoa> obterClientes();

    // Método para enviar PIX entre duas pessoas com um determinado valor
    public boolean enviarPix(Pessoa origem, Pessoa destino, float valor);

    // Método para obter o saldo de uma pessoa
    public float obterSaldo(Pessoa pessoa);
}


