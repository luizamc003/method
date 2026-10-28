package padroescomportamentais.templatemethod;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteFielTest {

    @Test
    void deveRetornarAprovado() {
        ClienteFiel cliente = new ClienteFiel();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(500.0f);
        assertEquals("Aprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarReprovado() {
        ClienteFiel cliente = new ClienteFiel();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(510.0f);
        assertEquals("Reprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarInformacoes() {
        ClienteFiel cliente = new ClienteFiel();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(500.0f);
        cliente.setNome("João");
        cliente.setCodigo(2);
        assertEquals("ClienteFiel{codigo=2, nome='João', credito=Aprovado}", cliente.getInfo());
    }
}