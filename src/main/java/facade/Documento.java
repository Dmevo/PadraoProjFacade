package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento {

    private List<Pessoa> pessoasReprovada = new ArrayList<>();

    public void addPessoaReprovada(Pessoa pessoa) { this.pessoasReprovada.add(pessoa); }

    public boolean verificarPessoaRejeitada(Pessoa pessoa) { return this.pessoasReprovada.contains(pessoa); }
}
