package padroescomportamentais.templatemethod;

public class ClienteNovo extends Cliente {

    public String verificarCredito() {
        if (this.calcularComprometimento() <= 30.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "ClienteNovo";
    }
}
