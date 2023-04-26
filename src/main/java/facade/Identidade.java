package facade;

public class Identidade extends Documento{

    private static Identidade identidade = new Identidade();

    private Identidade() {}

    public static Identidade getInstance() { return identidade; }
}
