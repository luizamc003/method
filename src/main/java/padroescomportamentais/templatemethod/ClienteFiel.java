package padroescomportamentais.templatemethod;


public class ClienteFiel extends Cliente {

    public String verificarCredito() {
        if (this.calcularComprometimento() <= 50.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "ClienteFiel";
    }
}
