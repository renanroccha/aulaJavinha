public class Bicicleta extends  Veiculo {
    private  Double calibragemPneu;

    //construtor
    public Bicicleta(String nomeCliente, String marca, Double valor, Integer anoFabricacao, Double calibragemPneu) {
        super(nomeCliente, marca, valor, anoFabricacao);
        this.calibragemPneu = calibragemPneu;
    }

    //sorbreescrevendo métodos
    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatório da bike de: " + super.nomeCliente);
        if(calibragemPneu < 0.4){
            System.out.println("Calibragem incorreta, ajuste aqui");
        }else {
            System.out.println("Calibragem OK");
        }
    }

    //Get e set
    public Double getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Double calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "calibragemPneu=" + calibragemPneu +
                '}';
    }
}
