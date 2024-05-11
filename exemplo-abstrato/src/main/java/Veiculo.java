import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Veiculo {

    //atributos
    protected  String nomeCliente;
    protected  String marca;
    protected  Double valor;
    protected Integer anoFabricacao;


    //construtor
    public Veiculo(String nomeCliente, String marca, Double valor, Integer anoFabricacao) {
        this.nomeCliente = nomeCliente;
        this.marca = marca;
        this.valor = valor;
        this.anoFabricacao = anoFabricacao;
    }

    //metodos
    public abstract void exibirRelatorioRevisao();


    public Integer anoDoVeiculo(){
        return LocalDateTime.now().getYear() - anoFabricacao;
    };

    //get e set
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }



}
