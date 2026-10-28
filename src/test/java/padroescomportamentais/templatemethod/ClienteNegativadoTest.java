package padroescomportamentais.templatemethod;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteNegativadoTest {

    @Test
    void deveRetornarReprovado() {
        ClienteNegativado cliente = new ClienteNegativado();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(100.0f);
        assertEquals("Reprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarInformacoes() {
        ClienteNegativado cliente = new ClienteNegativado();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(100.0f);
        cliente.setNome("Ana");
        cliente.setCodigo(3);
        assertEquals("ClienteNegativado{codigo=3, nome='Ana', credito=Reprovado}", cliente.getInfo());
    }
}