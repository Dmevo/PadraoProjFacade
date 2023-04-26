package facade;

public class PessoaFacade {

    public static boolean verificarEmissaoPassaporte(Pessoa pessoa) {
        if(Cpf.getInstance().verificarPessoaRejeitada(pessoa)) {
            return false;
        }
        if(Identidade.getInstance().verificarPessoaRejeitada(pessoa)) {
            return false;
        }
        return true;
    }
}
