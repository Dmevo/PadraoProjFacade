package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveRetornarRejeicaoCpfPassaporte() {
        Pessoa pessoa = new Pessoa();
        Cpf.getInstance().addPessoaReprovada(pessoa);

        assertEquals(false, pessoa.emitirPassporte());
    }

    @Test
    void deveRetornarRejeicaoIdentidadePassaporte() {
        Pessoa pessoa = new Pessoa();
        Identidade.getInstance().addPessoaReprovada(pessoa);

        assertEquals(false, pessoa.emitirPassporte());
    }

    @Test
    void deveRetornarPessoaAprovadaPassaporte() {
        Pessoa pessoa = new Pessoa();

        assertEquals(true, pessoa.emitirPassporte());
    }
}
