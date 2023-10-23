package banco;

import java.util.List;
import pessoa.Pessoa;


public interface IOperacoesBancarias {
    List<Pessoa> obterClientes();
    float obterSaldo(Pessoa pessoa);
}

