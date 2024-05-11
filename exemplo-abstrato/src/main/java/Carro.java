public class Carro extends Veiculo{
    private Double nivelDeOleo;
    private Boolean possuiEstepe;

    //construtor
    public Carro(String nomeCliente, String marca, Double valor, Integer anoFabricacao, Double nivelDeOleo, Boolean possuiEstepe) {
        super(nomeCliente, marca, valor, anoFabricacao);
        this.nivelDeOleo = nivelDeOleo;
        this.possuiEstepe = possuiEstepe;
    }


    //reescrevendo métodos
    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatório do carro de: " + nomeCliente);

        if (nivelDeOleo < 1.5){
            System.out.println("Nível de óleo baixo, troque com a gente");
        }else {
            System.out.println("Nível de óleo OK");
        }

        if(possuiEstepe){
            System.out.println("Estepe OK");
        }else {
            System.out.println("Sem estepe, compre com a gente!");
        }
    }

    //get e set
    public Double getNivelDeOleo() {
        return nivelDeOleo;
    }

    public void setNivelDeOleo(Double nivelDeOleo) {
        this.nivelDeOleo = nivelDeOleo;
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nivelDeOleo=" + nivelDeOleo +
                ", possuiEstepe=" + possuiEstepe +
                '}';
    }
}
