package facade;

public class Pessoa {

    public boolean emitirPassporte() { return PessoaFacade.verificarEmissaoPassaporte(this); }
}
