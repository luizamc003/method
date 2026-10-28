package padroescomportamentais.templatemethod;

public abstract class Cliente {

    private int codigo;
    protected String nome;
    private float renda;
    private float valorCompra;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float calcularComprometimento() {
        return (this.valorCompra / this.renda) * 100;
    }

    public abstract String verificarCredito();

    public String getTipo() {
        return "Cliente";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", credito=" + this.verificarCredito() +
                '}';
    }
}
