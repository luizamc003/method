package padroescomportamentais.templatemethod;

public class ClienteNegativado extends Cliente {

    public String verificarCredito() {
        return "Reprovado";
    }

    @Override
    public String getTipo() {
        return "ClienteNegativado";
    }
}