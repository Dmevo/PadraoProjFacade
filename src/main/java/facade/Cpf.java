package facade;

public class Cpf extends Documento{

    private static Cpf cpf = new Cpf();

    private Cpf() {};

    public  static Cpf getInstance() { return cpf; }
}
