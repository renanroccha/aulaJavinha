public class Moto extends  Veiculo{
    private Boolean possuiCapacete;


    public Boolean getPossuiCapacete() {
        return possuiCapacete;
    }

    public void setPossuiCapacete(Boolean possuiCapacete) {
        this.possuiCapacete = possuiCapacete;
    }


    public Moto(String nomeCliente, String marca, Double valor, Integer anoFabricacao, Boolean possuiCapacete) {
        super(nomeCliente, marca, valor, anoFabricacao);
        this.possuiCapacete = possuiCapacete;
    }

    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatorio da moto de" + nomeCliente);
        if (possuiCapacete){
            System.out.println(" Tudo oK!");

        }else System.out.println("Fds");
    }
}


