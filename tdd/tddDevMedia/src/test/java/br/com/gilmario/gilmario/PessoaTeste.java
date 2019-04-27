package br.com.gilmario.gilmario;

import br.com.gilmario.LogMock;
import br.com.gilmario.Pessoa;
import br.com.gilmario.PessoaController;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by gilmario on 21/02/17.
 */
public class PessoaTeste {
    @Test
    public void deveriaCriarUmLogQuandoUmaPessoaForExcluida() throws Exception{
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alexandre");

        LogMock nossoMock = new LogMock();
        PessoaController pessoaController = new PessoaController(nossoMock);
        pessoaController.exclui(pessoa);
        assertEquals(pessoa.getNome(), nossoMock.getNome());
    }
}
