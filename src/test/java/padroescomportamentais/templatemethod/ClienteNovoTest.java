package padroescomportamentais.templatemethod;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteNovoTest {

    @Test
    void deveRetornarAprovado() {
        ClienteNovo cliente = new ClienteNovo();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(290.0f);
        assertEquals("Aprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarReprovado() {
        ClienteNovo cliente = new ClienteNovo();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(310.0f);
        assertEquals("Reprovado", cliente.verificarCredito());
    }

    @Test
    void deveRetornarInformacoes() {
        ClienteNovo cliente = new ClienteNovo();
        cliente.setRenda(1000.0f);
        cliente.setValorCompra(310.0f);
        cliente.setNome("Maria");
        cliente.setCodigo(1);
        assertEquals("ClienteNovo{codigo=1, nome='Maria', credito=Reprovado}", cliente.getInfo());
    }
}